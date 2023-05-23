package com.velocity.service;


import com.velocity.model.LoginDTO;
import com.velocity.model.LoginResponse;
import com.velocity.model.UserLogin;

public interface UserLoginService {

	String addLoginDetails(UserLogin userLogin);

	LoginResponse loginUser(LoginDTO loginDTO);


}
