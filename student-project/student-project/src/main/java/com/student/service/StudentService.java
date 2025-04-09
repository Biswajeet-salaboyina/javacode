package com.student.service;

import java.util.List;

import com.student.dto.StudentFetch;
import com.student.dto.StudentRequestdto;
import com.student.dto.StudentResponsedto;
import com.student.dto.Studentfetchdto;
import com.student.entity.Student;

public interface StudentService {

	StudentResponsedto registerstudent(StudentRequestdto studentRequest);

	List<StudentFetch> fetchAllstudents();

	

	Student fetchBygetId(Integer id);

	 

	Studentfetchdto fetchBygetIddto(Integer id);

	Studentfetchdto fetchBygetIdandNamedto(Integer id, String name);

    Student  fetchId(Integer id);

	List<StudentFetch> fetchAllstudentsByName(String Name);

	StudentResponsedto deleteId(Integer id);

	StudentResponsedto Updatestudent(StudentRequestdto studentRequest, Integer id);

	
	

}
