package com.sds.anyframe.mobile.amplt.rest.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sds.anyframe.mobile.amplt.rest.service.UserService;
import com.sds.anyframe.mobile.amplt.rest.service.dao.UserDAO;
import com.sds.anyframe.mobile.amplt.rest.vo.RequestVO;
import com.sds.anyframe.mobile.amplt.rest.vo.User;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	UserDAO userDAO = UserDAO.getInstance();
	
	@Override
	public List<User> getEntities() {
		return userDAO.getUsers();
	}

	@Override
	public RequestVO<User> createEntity(User user) {
		RequestVO<User> requestVO = new RequestVO<User>(); 
		
		try {
			requestVO = userDAO.createUser(user);
		} catch (Exception e) {
			requestVO.setStatus(false);
			requestVO.setStatusDetails(e.getLocalizedMessage());
		}
		
		return requestVO;
	}

	@Override
	public User getEntity(String id) {
		return userDAO.getUser(id);
	}

	@Override
	public RequestVO<User> updateEntity(User user) {
		RequestVO<User> requestVO = new RequestVO<User>(); 
		
		try {
			requestVO = userDAO.updateUser(user);
		} catch (Exception e) {
			requestVO.setStatus(false);
			requestVO.setStatusDetails(e.getLocalizedMessage());
		}
		
		return requestVO;
	}

	@Override
	public RequestVO<User> deleteEntity(String id) {
		RequestVO<User> requestVO = new RequestVO<User>();
		
		try {
			requestVO = userDAO.deleteUser(id);
		} catch (Exception e) {
			requestVO.setStatus(false);
			requestVO.setStatusDetails(e.getLocalizedMessage());
		}
		
		return requestVO;
	}

	@Override
	public RequestVO<User> deleteEntities(String[] ids) {
		RequestVO<User> requestVO = new RequestVO<User>(); 
		
		try {
			requestVO = userDAO.deleteUsers(ids);
		} catch (Exception e) {
			requestVO.setStatus(false);
			requestVO.setStatusDetails(e.getLocalizedMessage());
		}
		
		return requestVO;
	}

}
