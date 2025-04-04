package com.student.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dto.StudentFetch;
import com.student.dto.StudentRequestdto;
import com.student.dto.StudentResponsedto;
import com.student.entity.Student;
import com.student.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	@Override
	public StudentResponsedto registerstudent(StudentRequestdto studentRequest) {
		// TODO Auto-generated method stub
		
		Student student = new Student();
		student.setName(studentRequest.getName());
		student.setAge(studentRequest.getAge());
		student.setMobilenumber(studentRequest.getMobilenumber());
		student.setId(null);
		String StudentId = getRandomStudentId();
		student.setStuId(StudentId);
		student.setGender(studentRequest.getGender());
		student.setStatus("Active");
		
		Student response = studentRepository.save(student);
		StudentResponsedto responsedto = new StudentResponsedto();
		if(response == null)
		{
			responsedto.setStudentid(null);
			responsedto.setMessage("Failed to save");
			return responsedto;
		}
		
		responsedto.setStudentid(response.getStuId());
		responsedto.setMessage("Student details saved ");
		
		return responsedto;
	}

	private String getRandomStudentId() {
		// TODO Auto-generated method stub
		Random random = new Random();
		int num = random.nextInt(1111, 9999);
		String stuid= "abc"+num;
		return stuid;
	}

	@Override
	public List<StudentFetch> fetchAllstudents() {
		// TODO Auto-generated method stub
		List<Student>results = studentRepository.findAll();
		if( results == null || results.isEmpty())
		{
			return new ArrayList<>();
		}
		List<StudentFetch> response =  new ArrayList<>();
		for(Student stu:results)
		{
			StudentFetch stuResponse = new StudentFetch();
			stuResponse.setId(stu.getId());
			stuResponse.setName(stu.getName());
			stuResponse.setStuId(stu.getStuId());
			stuResponse.setAge(stu.getAge());
			stuResponse.setGender(stu.getGender());
			stuResponse.setMobilenumber(stu.getMobilenumber());
			stuResponse.setStatus(stu.getStatus());
			response.add(stuResponse);
		}
			
			
		
		
		return response;
	}

	
	@Override
	public Student fetchBygetId(Integer id) {
		// TODO Auto-generated method stub
//		studentRepository.findByStuid(id);
//		studentRepository.findByName(id);
		 Optional<Student>response= studentRepository.findById(id);
		 if(!response.isPresent())
		 {
			 throw new RuntimeException("Data not found");
		 }
		return response.get();
	}

}
