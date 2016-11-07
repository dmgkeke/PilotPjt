package com.sds.anyframe.mobile.amplt.rest.vo;

public class RequestVO<T> {
	private boolean status;
	private String statusDetails;
	private T entity;
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getStatusDetails() {
		return statusDetails;
	}
	public void setStatusDetails(String statusDetails) {
		this.statusDetails = statusDetails;
	}
	public T getEntity() {
		return entity;
	}
	public void setEntity(T t) {
		this.entity = t;
	}
	
}
