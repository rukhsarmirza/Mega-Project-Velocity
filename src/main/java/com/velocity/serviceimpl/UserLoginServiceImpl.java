package com.velocity.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.velocity.model.LoginDTO;
import com.velocity.model.LoginResponse;
import com.velocity.model.UserLogin;
import com.velocity.repository.UserLoginRepository;
import com.velocity.service.UserLoginService;

@Service
public class UserLoginServiceImpl implements UserLoginService {

	@Autowired
	private UserLoginRepository userLoginRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public String addLoginDetails(UserLogin userLogin) {

		UserLogin userLogin2 = new UserLogin(userLogin.getName(), userLogin.getEmail(),
				this.passwordEncoder.encode(userLogin.getPassword()), userLogin.getMobileNumber());

		userLoginRepository.save(userLogin2);

		return userLogin2.getName();

	}

	@Override
	public LoginResponse loginUser(LoginDTO loginDTO) {

		UserLogin userLogin = userLoginRepository.findByEmail(loginDTO.getEmail());

		if (userLogin != null) {
			String password = loginDTO.getPassword();
			String encodedPassword = userLogin.getPassword();
			Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);

			if (isPwdRight) {
				Optional<UserLogin> userLogin1 = userLoginRepository.findOneByEmailAndPassword(loginDTO.getEmail(),
						encodedPassword);
				if (userLogin1.isPresent()) {

					return new LoginResponse("Login Successful", true);

				} else {
					return new LoginResponse("Login Failed", false);
				}

			} else {
				return new LoginResponse("Password not match", false);

			}
		} else {
			return new LoginResponse("Email not exist", false);
		}

	}

}
