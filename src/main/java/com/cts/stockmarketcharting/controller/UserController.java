package com.cts.stockmarketcharting.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.stockmarketcharting.entity.User;
import com.cts.stockmarketcharting.model.UserModel;
import com.cts.stockmarketcharting.service.UserService;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;

@RestController
@RequestMapping("user")
public class UserController {

	
	@Autowired
	ModelMapper modelMapper;	
	
	@Autowired
	UserService userService;
	
	@PostMapping(value = "register",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public void registerUser(@RequestBody UserModel user)
	{
		User userEntity = convertToEntity(user);
		userEntity.setConfirmed(false);
		userEntity.setUserType("user");
		userService.addUSer(userEntity);
	}
	
	
	
	
	
	private User convertToEntity(UserModel user)
	{
		User map = modelMapper.map(user, User.class);
		return map;
	}
	
	private UserModel convertToDTO(User user)
	{
		UserModel map = modelMapper.map(user, UserModel.class);
		return map;
	}
	
	
	
}
