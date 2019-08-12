package com.cts.stockmarketcharting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.stockmarketcharting.entity.User;
import com.cts.stockmarketcharting.repository.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public void addUSer(User user) {
		userRepository.addUser(user);
	}

	@Override
	public void updateUser(User user) {
		userRepository.updateUser(user);
	}

}
