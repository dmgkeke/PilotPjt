package com.sds.anyframe.mobile.amplt.rest.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sds.anyframe.mobile.amplt.rest.vo.User;

public interface UserRepository extends JpaRepository<User, String> {
	
}
