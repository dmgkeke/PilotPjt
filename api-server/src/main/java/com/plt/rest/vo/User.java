package com.plt.rest.vo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="user")
public class User {
	
	@Id
	private String id;
	
}
