package com.mehmetali.handler;

import java.util.Date;


import lombok.Data;

@Data
public class Exception<T> {

	private String hostName;
	
	private String path;
	
	private Date createTime;
	
	private T message;
}
