package com.plt.rest.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plt.rest.vo.User;

public interface UserRepository extends JpaRepository<User, String> {

}
