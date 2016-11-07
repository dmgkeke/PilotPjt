package com.sds.anyframe.mobile.amplt.rest.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User {
	@Id
	@Column(name="EMAIL")
	private String id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="PHONE_NUMBER")
	private String phone;
	
	@Column(name="SECRET")
	private String pw;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	@Override
	public String toString() {
		return String.format("id : {%s}, name : {%s}, phone : {%s}"
				, id
				, name
				, phone);
	}
	
}
