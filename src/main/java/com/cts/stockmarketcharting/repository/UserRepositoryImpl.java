package com.cts.stockmarketcharting.repository;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.stockmarketcharting.entity.User;


@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {

	@Autowired
	EntityManager entityManager;
	
	@Override
	public void addUser(User user) {
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(user);
	}

	@Override
	public void updateUser(User user) {
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(user);
	}

}
