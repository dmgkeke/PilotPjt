package com.sds.anyframe.mobile.amplt.rest.service.dao;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.google.common.collect.Lists;
import com.sds.anyframe.mobile.amplt.rest.vo.RequestVO;
import com.sds.anyframe.mobile.amplt.rest.vo.User;

public class UserDAO {
	
	private static final UserDAO INSTANCE = new UserDAO();
	
	private UserDAO() {
	}

	public static UserDAO getInstance() {
		return INSTANCE;
	}

	public List<User> getUsers() {
		List<User> users = Lists.newArrayList();
		
		users.add(createJin());
		users.add(createOh());
		
		return users;
	}

	public RequestVO<User> createUser(User user) {
		RequestVO<User> request = new RequestVO<User>();
		request.setStatus(true);
		request.setStatusDetails(user.toString());
		
		return request;
	}

	public User getUser(String id) {
		if( "kaka.jin".equals(id) ) {
			return createJin();
		} else if( "sch.oh".equals(id) ) {
			return createOh();
		}
		
		return null;
	}

	public RequestVO<User> updateUser(User user) {
		RequestVO<User> request = new RequestVO<User>();
		request.setStatus(true);
		request.setStatusDetails(user.toString());
		
		return request;
	}

	public RequestVO<User> deleteUser(String id) {
		RequestVO<User> request = new RequestVO<User>();
		request.setStatus(true);
		request.setStatusDetails(String.format("delete product id[%s]", id));
		
		return request;
	}

	public RequestVO<User> deleteUsers(String[] ids) {
		RequestVO<User> request = new RequestVO<User>();
		request.setStatus(true);
		request.setStatusDetails(String.format("delete product id[%s]", StringUtils.join(ids, ", ")));
		
		return request;
	}
	
	// TODO Dump data 생성을 위한 임시 메소드, DB 연결 후에 삭제
	private User createJin() {
		return createDumpUser("kaka.jin", "진광수", "010-9197-8895", "qwrqwfqwf");
	}

	// TODO Dump data 생성을 위한 임시 메소드, DB 연결 후에 삭제
	private User createOh() {
		return createDumpUser("sch.oh", "오승철", "010-0000-1111", "qwrqwfqwf");
	}
	
	// TODO Dump data 생성을 위한 임시 메소드, DB 연결 후에 삭제
	private User createDumpUser(String id, String name, String phone, String pw) {
		User user = new User();
		user.setId(id);
		user.setName(name);
		user.setPhone(phone);
		user.setPw(pw);
		
		return user;
	}

}
