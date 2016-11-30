package com.plt.rest;

import org.springframework.beans.factory.annotation.Autowired;

import com.plt.rest.service.UserService;

public class UserController {
	
	@Autowired
	UserService userService;
	
}
