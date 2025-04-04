package com.student.service;

import com.student.dto.StudentRequestdto;
import com.student.dto.StudentResponsedto;

public interface StudentService {

	StudentResponsedto registerstudent(StudentRequestdto studentRequest);
	

}
