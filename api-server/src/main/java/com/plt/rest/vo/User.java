package com.plt.rest.vo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="userMst")
public class User {
	
	@Id
	private String userId;
	private String userClsf;
	private String userCert;
	private Date regDt;
	
	public String getUserClsf() {
		return userClsf;
	}

	public void setUserClsf(String userClsf) {
		this.userClsf = userClsf;
	}

	public String getUserCert() {
		return userCert;
	}

	public void setUserCert(String userCert) {
		this.userCert = userCert;
	}

	public Date getRegDt() {
		return regDt;
	}

	public void setRegDt(Date regDt) {
		this.regDt = regDt;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}
