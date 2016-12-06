package com.plt.rest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plt.rest.service.UserService;
import com.plt.rest.service.dao.UserRepository;
import com.plt.rest.vo.User;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public User test(){
		return userRepository.findOne("1");
	}
	
}
