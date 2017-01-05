package com.plt.rest;

import java.util.HashMap;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plt.rest.service.UserService;
import com.plt.rest.vo.User;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/user")
	HashMap test(String id) {
		System.out.println("=====Called User=====" + id);

		User test = userService.test(id);
		
		HashMap map = new HashMap();
		if(test != null) {
			System.out.println(test.getUserId());
			map.put("message", test.getUserId()+" / "+test.getUserClsf()+" / "+test.getUserCert()+" / "+test.getRegDt());
		}
		
		return map;
	}
	
}
