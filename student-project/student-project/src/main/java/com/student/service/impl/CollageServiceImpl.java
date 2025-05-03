package com.student.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dto.CollageFetch;
import com.student.dto.CollageRequest;
import com.student.dto.StudentFetch;
import com.student.entity.Address;
import com.student.entity.Collage;
import com.student.entity.Student;
import com.student.exception.StudentDataException;
import com.student.repository.CollageRepository;
import com.student.service.CollageService;
import com.student.service.StudentService;

@Service
public class CollageServiceImpl implements CollageService {

	@Autowired
	CollageRepository collageRespository;
	

	@Override
	public String createCollage(CollageRequest request) {
		// TODO Auto-generated method stub

		Collage result = new Collage();
		result.setClgId(request.getClgId());
		result.setClgName(request.getClgName());
		result.setClgCode(request.getClgCode());

		Collage clgres = collageRespository.save(result);

		if (clgres != null) {
			return "details saved";
		} else {
			return "unable to save";
		}

	}

	@Override
	public Collage getclgid(Integer clgid) {
		// TODO Auto-generated method stub
		Optional<Collage> res = collageRespository.findById(clgid);

		if (!res.isPresent()) {
			throw new StudentDataException("Data not found");
		}

		return res.get();
	}

	@Override
	public List<CollageFetch> clgAddress() {
		// TODO Auto-generated method stub
		List<Collage> result = collageRespository.findAll();
		List<CollageFetch> response = new ArrayList<>();
		for (Collage clg : result) {
			CollageFetch clgResponse = new CollageFetch();
			clgResponse.setClgId(clg.getClgId());
			clgResponse.setClgName(clg.getClgName());
			clgResponse.setClgCode(clg.getClgCode());
			
			response.add(clgResponse);
		}

		return response;
	}

	@Override
	public String clearClg(Integer clgid) {
		// TODO Auto-generated method stub
		if (!collageRespository.existsById(clgid)) {
			throw new StudentDataException("College with ID " + clgid + " not found");
		}
		collageRespository.deleteById(clgid);

		return "College with ID " + clgid + " deleted successfully";

	}

}
