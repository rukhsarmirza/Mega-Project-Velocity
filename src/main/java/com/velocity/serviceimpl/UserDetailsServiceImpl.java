package com.velocity.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.UserDetails;
import com.velocity.repository.UserDetailsRepository;
import com.velocity.service.UserDetailsService;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	public UserDetailsRepository userDetailsRepository;

	@Override
	public UserDetails saveUserDetails(UserDetails userDetails) {
		UserDetails userDetail = userDetailsRepository.save(userDetails);
		return userDetail;
	}

	@Override
	public UserDetails updateUserDetails(UserDetails userDetails) {
		return userDetailsRepository.save(userDetails);
		 
	}

	@Override
	public void deleteUserDetails(Integer id) {
		userDetailsRepository.deleteById(id);
		
	}

}
