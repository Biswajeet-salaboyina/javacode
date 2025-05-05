package com.product.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProductExceptionHandler {

	@ExceptionHandler(value = ProductNotFoundException.class)
	public ResponseEntity<ExceptionResponse> handleProductNotFoundException(ProductNotFoundException ex) {
//		ExceptionResponse response = ExceptionResponse.builder().statusCode("404").error("Not Found")
//				.message(ex.getMessage()).timeStamp(LocalDateTime.now()).build();
//		return ResponseEntity.ok(response);
		ExceptionResponse response = new ExceptionResponse();
		response.setStatusCode("404");
		response.setError("Not Found");
		response.setMessage(ex.getMessage());
		response.setTimeStamp(LocalDateTime.now());
		return ResponseEntity.status(HttpStatus.OK).body(response);

	}

}
