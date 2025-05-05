package com.product.exception;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ExceptionResponse implements Serializable
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 786335959957318046L;
	private String statusCode;
	private String error;
	private String message;
	private LocalDateTime timeStamp;
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
