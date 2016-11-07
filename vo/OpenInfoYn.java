package com.sds.anyframe.mobile.amplt.rest.vo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum OpenInfoYn {
	No("0"), Yes("1");
	
	private String value;
	
	private OpenInfoYn() {
		this.value = "1";
	}
	
	private OpenInfoYn(String value) {
		this.value = value;
	}
	
	@JsonValue
	public String value() {
		return this.value;
	}

	@JsonCreator
	public static OpenInfoYn of(String value) {
		for (OpenInfoYn openInfoYn : values()) {
			if( openInfoYn.value.equals(value) ) {
				return openInfoYn;
			}
		}
		
		return null;
	}
}
