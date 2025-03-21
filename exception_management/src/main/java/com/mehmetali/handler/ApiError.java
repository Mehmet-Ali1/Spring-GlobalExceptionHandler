package com.mehmetali.handler;

import lombok.Data;

@Data
public class ApiError<T> {

	private Integer status;

	private  Exception<T> exception;
}

