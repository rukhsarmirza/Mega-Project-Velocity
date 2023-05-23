package com.velocity.service;

import com.velocity.model.UserDetails;

public interface UserDetailsService {
	public UserDetails saveUserDetails(UserDetails userDetails);
	public UserDetails updateUserDetails(UserDetails userDetails);
	public UserDetails getUserDetails(Integer id);
	
	

}
