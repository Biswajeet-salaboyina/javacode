package com.student.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class StudentExceptionHandler {
	
	@ExceptionHandler(StudentDataException.class)
	public ResponseEntity<?> handleStudentDataException(StudentDataException ex)
	{
		ExceptionResponse response = new ExceptionResponse();
		response.setStatus("500");
		response.setError("Internal server");
		response.setTimestamp(LocalDateTime.now());
		response.setMessage(ex.getMessage());
		return ResponseEntity.status(HttpStatus.OK).body(response);
		
	}

	
}
