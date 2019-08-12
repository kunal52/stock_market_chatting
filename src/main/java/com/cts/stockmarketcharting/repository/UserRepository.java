package com.cts.stockmarketcharting.repository;

import com.cts.stockmarketcharting.entity.User;

public interface UserRepository {

	void addUser(User user);
	void updateUser(User user);
	
}
