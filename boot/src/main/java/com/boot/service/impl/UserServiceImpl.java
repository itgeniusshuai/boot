package com.boot.service.impl;

import org.springframework.stereotype.Service;

import com.boot.db.MemeryDb;
import com.boot.domain.User;
import com.boot.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public User getUserByName(String name) {
		User user = MemeryDb.getUserByName(name);
		return user;
	}

}
