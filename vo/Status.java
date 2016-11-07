package com.sds.anyframe.mobile.amplt.rest.vo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Status {
	Complete("0"), Sale("1");
	
	private String value;
	
	private Status() {
		this.value = "1";
	}
	
	private Status(String value) {
		this.value = value;
	}
	
	@JsonValue
	public String value() {
		return this.value;
	}

	@JsonCreator
	public static Status of(String value) {
		for (Status status : values()) {
			if( status.value.equals(value) ) {
				return status;
			}
		}
		
		return null;
	}
	
	
}
