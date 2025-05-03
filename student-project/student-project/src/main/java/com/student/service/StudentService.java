package com.student.service;

import java.util.List;

import com.student.dto.StudentFetch;
import com.student.dto.StudentPage;
import com.student.dto.StudentRequestdto;
import com.student.dto.StudentResponsedto;
import com.student.dto.Studentfetchdto;
import com.student.entity.Student;

public interface StudentService {

	StudentResponsedto registerstudent(StudentRequestdto studentRequest, Integer collageId);

	List<StudentFetch> fetchAllstudents();

	

	Student fetchBygetId(Integer id);

	 

	Studentfetchdto fetchBygetIddto(Integer id);

	Studentfetchdto fetchBygetIdandNamedto(Integer id, String name);

    Student  fetchId(Integer id);

	List<StudentFetch> fetchAllstudentsByName(String Name);

	StudentResponsedto deleteId(Integer id);

	StudentResponsedto Updatestudent(StudentRequestdto studentRequest, Integer id);

	List<StudentPage> getStudents(Integer pagenumber, Integer pagesize);


	List<StudentFetch> fetchStudents(Integer id, Integer clgId);

//	StudentResponsedto UpdatestudentByIdandStatus(StudentRequestdto studentRequest, Integer id);

	
	

}
