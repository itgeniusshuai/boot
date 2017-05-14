package com.boot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.boot.domain.User;
import com.boot.domain.UserDetailsImpl;
import com.boot.service.UserService;

@Service
public class UserDetailServiceImpl implements UserDetailsService{
	
	@Autowired
	private UserService userService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userService.getUserByName(username);
		if (user == null) {
            throw new UsernameNotFoundException("UserName " + username + " not found");
        }
		UserDetails userDetails = new UserDetailsImpl(user);
        return userDetails;
	}



}
