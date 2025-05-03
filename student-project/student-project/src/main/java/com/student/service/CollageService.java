package com.student.service;

import java.util.List;

import com.student.dto.CollageFetch;
import com.student.dto.CollageRequest;
import com.student.entity.Collage;

public interface CollageService {

	String createCollage(CollageRequest request);

	Collage getclgid(Integer clgid);

	

	List<CollageFetch> clgAddress();

	String clearClg(Integer clgid);
 
	
}
