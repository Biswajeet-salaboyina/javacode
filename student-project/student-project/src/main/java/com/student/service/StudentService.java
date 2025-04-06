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

	
	

}
