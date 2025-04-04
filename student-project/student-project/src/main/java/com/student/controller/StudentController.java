package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.dto.StudentRequestdto;
import com.student.dto.StudentResponsedto;
import com.student.service.StudentService;

@RequestMapping("/student")
@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	@PostMapping("/register")
	public ResponseEntity<StudentResponsedto>registerstudent(@RequestBody StudentRequestdto studentRequest)
	{
		StudentResponsedto response = studentService.registerstudent(studentRequest);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}
}
