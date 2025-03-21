package com.mehmetali.exception;

import lombok.Getter;

@Getter
public enum MessageType {

	NO_RECORD_EXIST("1001","kayit bulunamadi"),
	GENERAL_EXCEPTION("9999","genel bir hata olustu");
	
	private String code;
	
	private String message;
	
	private MessageType(String code,String message) {
		this.code=code;
		this.message=message;
	}
	
	
	
	
}
