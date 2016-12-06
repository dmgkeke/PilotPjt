package com.plt.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plt.rest.service.UserService;
import com.plt.rest.vo.User;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/User")
	User test() {
		User test = userService.test();
		System.out.println(test);
		return test;
	}
	
}
