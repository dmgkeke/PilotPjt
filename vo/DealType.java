package com.sds.anyframe.mobile.amplt.rest.vo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DealType {
	Direct("1"), Delivery("2"), All("3");
	
	private String value;
	
	private DealType() {
		this.value = "3";
	}
	
	private DealType(String value) {
		this.value = value;
	}
	
	@JsonValue
	public String value() {
		return this.value;
	}
	
	@JsonCreator
	public static DealType of(String value) {
		for (DealType dealType : values()) {
			if( dealType.value.equals(value) ) {
				return dealType;
			}
		}
		
		return null;
	}
}
