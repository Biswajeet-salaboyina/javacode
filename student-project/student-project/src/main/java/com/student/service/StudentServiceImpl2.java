package com.student.service;

import java.util.ArrayList;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.student.dto.StudentFetch;
import com.student.dto.StudentPage;
import com.student.dto.StudentRequestdto;
import com.student.dto.StudentResponsedto;
import com.student.dto.Studentfetchdto;
import com.student.entity.Student;
import com.student.exception.StudentDataException;
import com.student.repository.StudentRepository;

import io.micrometer.common.util.StringUtils;

@Primary
@Service (value = "service2")
public class StudentServiceImpl2 implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	@Override
	public StudentResponsedto registerstudent(StudentRequestdto studentRequest, Integer collageId) {
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
		List<Student>results = studentRepository.getAll();
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
		 Optional<Student>response= studentRepository.getId(id);
		 if(!response.isPresent())
		 {
			 throw new StudentDataException("Data not found");
		 }
		return response.get();
	}

	@Override
	public Studentfetchdto fetchBygetIddto(Integer id) {
		Optional<Student> response = studentRepository.findById(id);
        if (!response.isPresent()) {
      
        	throw new StudentDataException("Data not found");
        }
        Student student = response.get();
        // map fields manually or use a constructor
        Studentfetchdto dto = new Studentfetchdto();
        dto.setName(student.getName());
        dto.setAge(student.getAge());
        dto.setMobilenumber(student.getMobilenumber());
        dto.setId(student.getId());
        dto.setGender(student.getGender());
        dto.setStatus(student.getStatus());
        dto.setStuId(student.getStuId());
        
        
        return dto;
	}
	
	@Override
	public Studentfetchdto fetchBygetIdandNamedto(Integer id, String name) {
	    Optional<Student> response = studentRepository.getByIdAndName(id, name);

	    if (!response.isPresent()) {
	        throw new StudentDataException("Data not found");
	    }

	    Student student = response.get();

	    Studentfetchdto dto = new Studentfetchdto();
	    dto.setName(student.getName());
	    dto.setAge(student.getAge());
	    dto.setMobilenumber(student.getMobilenumber());
	    dto.setId(student.getId());
	    dto.setGender(student.getGender());
	    dto.setStatus(student.getStatus());
	    dto.setStuId(student.getStuId());

	    return dto;
	}

	@Override
	public Student fetchId(Integer id) {
		// TODO Auto-generated method stub
		 Optional<Student>response= studentRepository.findById(id);
		 if(!response.isPresent())
		 {
			 throw new RuntimeException("Data not found");
		 }
		return response.get();
		
	}

	@Override
	public List<StudentFetch> fetchAllstudentsByName(String Name)
{
		
		List<StudentFetch> response = new ArrayList<>();
		// TODO Auto-generated method stub
		List<Student>results = null;
		if(StringUtils.isBlank(Name))
		{
			results = studentRepository.findAll();
			if( results == null || results.isEmpty())
			{
				return new ArrayList<>();
			}
			response = mapEntity(results,response);
			return response;
			
		}
		
		results = studentRepository.getByName(Name);
		if( results == null || results.isEmpty())
		{
			return new ArrayList<>();
		}
		
//	List<StudentFetch> response1 = 	mapEntity(results,response);
		response = mapEntity(results,response);
		return response;
		
		
		
		
	}

	private List<StudentFetch> mapEntity(List<Student> student, List<StudentFetch> response) {
		// TODO Auto-generated method stub
		
		for(Student stu:student)
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
	public StudentResponsedto deleteId(Integer id) {
		// TODO Auto-generated method stub
		Student response = fetchBygetId(id);
		studentRepository.delete(response);
//		studentRepository.deleteById(id);
		StudentResponsedto responsedto = new StudentResponsedto();
		responsedto.setStudentid(String.valueOf(id));
		responsedto.setMessage("Deleted successfully");
		
		return responsedto;
	}

	@Override
	public StudentResponsedto Updatestudent(StudentRequestdto studentRequest, Integer id) {
		// TODO Auto-generated method stub
		Student response = fetchBygetId(id);
		if(studentRequest.getAge() != null )
		{
			response.setAge(studentRequest.getAge());
		}
		if(studentRequest.getGender() != null)
		{
			response.setGender(studentRequest.getGender());
		}
		if(StringUtils.isNotBlank(studentRequest.getName()))
		{
			response.setName(studentRequest.getName());
		}
		if(StringUtils.isNotBlank(studentRequest.getMobilenumber()))
		{
			response.setMobilenumber(studentRequest.getMobilenumber());
		}
		
		Student student = studentRepository.save(response);
		
		StudentResponsedto responsedto = new StudentResponsedto();
		if(student == null)
		{
			responsedto.setStudentid(String.valueOf(id));
			responsedto.setMessage("Failed to update details");
			return responsedto;
		}
		
		responsedto.setStudentid(String.valueOf(student.getId()));
		responsedto.setMessage("Student details updated ");
		
		
		return responsedto;
	}

	@Override
	public List<StudentPage> getStudents(Integer pagenumber, Integer pagesize) {
		// TODO Auto-generated method stub
		Pageable page = PageRequest.of(pagenumber, pagesize);
		Page<Student>results = studentRepository.findAll(page);
		List<Student> stud = results.getContent();
	long 	totalElements = results.getTotalElements();
	int 	pagecount = results.getTotalPages();
		if( results == null || results.isEmpty())
		{
			return new ArrayList<>();
		}
		List<StudentPage> response =  new ArrayList<>();
		
		for(Student stu:stud)
		{
			StudentPage stuResponse = new StudentPage();
			stuResponse.setId(stu.getId());
			stuResponse.setName(stu.getName());
			stuResponse.setStuId(stu.getStuId());
			stuResponse.setAge(stu.getAge());
//			stuResponse.setGender(stu.getGender());
			stuResponse.setMobilenumber(stu.getMobilenumber());
//			stuResponse.setStatus(stu.getStatus());
			stuResponse.setTotalElements(totalElements);
			stuResponse.setPagecount(pagecount);
			response.add(stuResponse);
		}
		return response;
	}

	@Override
	public List<StudentFetch> fetchStudents(Integer id, Integer clgId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	

//	@Override
//	public StudentResponsedto UpdatestudentByIdandStatus(StudentRequestdto studentRequest, Integer id) {
//		// TODO Auto-generated method stub
//		Student response = fetchBygetIdandStatus(id);
//		
//		response.setStatus("Inactive");
//////		if(studentRequest.getAge() != null )
//////		{
//////			response.setAge(studentRequest.getAge());
//////		}
//////		if(studentRequest.getGender() != null)
//////		{
//////			response.setGender(studentRequest.getGender());
//////		}
//////		if(StringUtils.isNotBlank(studentRequest.getName()))
//////		{
//////			response.setName(studentRequest.getName());
//////		}
//////		if(StringUtils.isNotBlank(studentRequest.getMobilenumber()))
//////		{
//////			response.setMobilenumber(studentRequest.getMobilenumber());
//////		}
////		if(StringUtils.isNotBlank(studentRequest.getStatus()))
////		{
////			response.setStatus(studentRequest.getStatus());
////		}
//		
	
//		Student student = studentRepository.save(response);
//		
//		StudentResponsedto responsedto = new StudentResponsedto();
//		if(student == null)
//		{
//			responsedto.setStudentid(String.valueOf(id));
//			responsedto.setMessage("Failed to update details");
//			return responsedto;
//		}
//		
//		responsedto.setStudentid(String.valueOf(student.getId()));
//		responsedto.setMessage("Student details updated ");
//		
//		
//		return responsedto;
//	}
//
//	private Student fetchBygetIdandStatus(Integer id) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	private Student fetchBygetIdandStatus(Integer id, String status) {
////		Optional<Student> response = studentRepository.fetchBygetIdandStatus(id, status);
////
////	    if (!response.isPresent()) {
////	        throw new StudentDataException("Data not found");
////	    }
////
////	    Student student = response.get();
////
////	   	student.setStatus("Inactive");
////	   
////
////	    return student;
//	}



}
