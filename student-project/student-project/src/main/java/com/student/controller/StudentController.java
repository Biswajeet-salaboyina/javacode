package com.student.controller;

//import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.student.dto.StudentRequestdto;
import com.student.dto.StudentFetch;
import com.student.dto.StudentPage;
import com.student.dto.StudentResponsedto;
import com.student.dto.Studentfetchdto;
import com.student.entity.Student;
import com.student.service.StudentService;

@Qualifier(value="service1")
@RequestMapping("/student")
@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	@PostMapping("/register/{collageId}")
	public ResponseEntity<StudentResponsedto>registerstudent(@RequestBody StudentRequestdto studentRequest,@PathVariable (value = "collageId") Integer collageId)
	{
		StudentResponsedto response = studentService.registerstudent(studentRequest,collageId);
		System.out.println(">>> Register student method called");
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
	
	@GetMapping("/fetch-all-dto/{id}/{name}")
	public ResponseEntity<Studentfetchdto> fetchBygetIdandNamedto(@PathVariable("id") Integer id, @PathVariable("name") String name)
	{
		Studentfetchdto response = studentService.fetchBygetIdandNamedto(id,name);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
	@GetMapping("/fetch-all-dto")
	// By using requestparam 
	public ResponseEntity<Student> fetchId(@RequestParam (value = "id") Integer id)
	{
		Student response = studentService.fetchId(id);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
	@GetMapping("/fetch-all/details")
	public ResponseEntity<List<StudentFetch>> fetchAllstudentsByName(@RequestParam (required = false, value = "Name") String Name)
	{
		List<StudentFetch> response = studentService.fetchAllstudentsByName(Name);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<StudentResponsedto> deleteId(@PathVariable("id") Integer id)
	{
		StudentResponsedto response = studentService.deleteId(id);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<StudentResponsedto>Updatestudent(@RequestBody StudentRequestdto studentRequest, @PathVariable("id") Integer id)
	{
		StudentResponsedto response = studentService.Updatestudent(studentRequest, id);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
	@GetMapping("/fetch-all/pagen")
	public ResponseEntity<List<StudentPage>> getStudents(@RequestParam("pagenumber") Integer pagenumber, @RequestParam("pagesize") Integer pagesize)
	{
		List<StudentPage> response = studentService.getStudents(pagenumber,pagesize);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
//	@PutMapping("/update/status/{id}") 
//	public ResponseEntity<StudentResponsedto>UpdatestudentByIdandStatus(@RequestBody StudentRequestdto studentRequest, @PathVariable("id") Integer id)
//	{
//		StudentResponsedto response = studentService.UpdatestudentByIdandStatus(studentRequest, id);
//		return ResponseEntity.status(HttpStatus.OK).body(response);
//	}
	@GetMapping("/fetch-all/{id}/{clgId}")
	public ResponseEntity<List<StudentFetch>> fetchStudents(@PathVariable("id") Integer id, @PathVariable("clgId") Integer clgId)
	{
		List<StudentFetch> result = studentService.fetchStudents(id,clgId);
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}
	
	
	
	
}
