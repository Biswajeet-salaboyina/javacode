package com.student.exception;

import java.time.LocalDateTime;

public class ExceptionResponse {

	private String status;
	private String error;
	private LocalDateTime timestamp;
	private String message;
	public ExceptionResponse(String status, String error, LocalDateTime timestamp, String message) {
		this.status = status;
		this.error = error;
		this.timestamp = timestamp;
		this.message = message;
	}
	public ExceptionResponse() {
		super();
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
