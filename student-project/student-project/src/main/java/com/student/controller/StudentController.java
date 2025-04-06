package com.student.controller;

//import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.student.dto.StudentRequestdto;
import com.student.dto.StudentFetch;
import com.student.dto.StudentResponsedto;
import com.student.dto.Studentfetchdto;
import com.student.entity.Student;
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
	
	@GetMapping("/fetch-all")
	public ResponseEntity<List<StudentFetch>> fetchAllstudents()
	{
		List<StudentFetch> response = studentService.fetchAllstudents();
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
	@GetMapping("/fetch-all/{id}")
	public ResponseEntity<Student> fetchBygetId(@PathVariable("id") Integer id)
	{
		Student response = studentService.fetchBygetId(id);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
	@GetMapping("/fetch-all-dto/{id}")
	public ResponseEntity<Studentfetchdto> fetchBygetIddto(@PathVariable("id") Integer id)
	{
		Studentfetchdto response = studentService.fetchBygetIddto(id);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
}
