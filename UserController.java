package com.sds.anyframe.mobile.amplt.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sds.anyframe.mobile.amplt.rest.service.UserService;
import com.sds.anyframe.mobile.amplt.rest.vo.RequestVO;
import com.sds.anyframe.mobile.amplt.rest.vo.User;

@RestController
public class UserController {
	private static Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/api/users", method=RequestMethod.GET)
	public List<User> getUsers() {
		logger.debug("getUsers is started...");
		return userService.getEntities();
	}
	
	@RequestMapping(value="/api/users", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public RequestVO<User> createUser(@RequestBody User user) {
		logger.debug("createUser is started...");
		return userService.createEntity(user);
	}
	
	@RequestMapping(value="/api/users/{id:.+}", method=RequestMethod.GET)
	public User getuser(@PathVariable("id") String id) {
		logger.debug("getUser is started...");
		return userService.getEntity(id);
	}
	
	@RequestMapping(value="/api/users/{id:.+}", method=RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_VALUE)
	public RequestVO<User> updateuser(@PathVariable("id") String id, @RequestBody User user) {
		logger.debug("createUser is started...");
		return userService.updateEntity(user);
	}
	
	@RequestMapping(value="/api/users/{id:.+}", method=RequestMethod.DELETE)
	public RequestVO<User> deleteuser(@PathVariable("id") String id) {
		logger.debug("deleteUser is started...");
		return userService.deleteEntity(id);
	}
	
	@RequestMapping(value="/api/users", method=RequestMethod.DELETE)
	public RequestVO<User> deleteApps(@RequestParam String[] ids) {
		logger.debug("deleteUsers is started...");
		return userService.deleteEntities(ids);
	}
}
