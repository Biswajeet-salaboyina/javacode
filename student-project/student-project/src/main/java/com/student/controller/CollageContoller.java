package com.student.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.dto.CollageFetch;
import com.student.dto.CollageRequest;
import com.student.entity.Collage;
import com.student.service.CollageService;



@RequestMapping("/collage")
@RestController
public class CollageContoller {

	@Autowired
	CollageService collageService;
	
	@PostMapping("/save")
	public ResponseEntity<String> createCollage(@RequestBody CollageRequest request)
	{
		String response = collageService.createCollage(request);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}
	
	@GetMapping("/get-collage/{clgid}")
	
		public ResponseEntity<Collage> getclgid(@PathVariable("clgid") Integer clgid)
		{
			Collage result  = collageService.getclgid(clgid);
			return ResponseEntity.status(HttpStatus.OK).body(result);
		}
	
	@GetMapping("/fetch-all")
	public ResponseEntity<List<CollageFetch>> clgAddress()
	{
		List<CollageFetch> response = collageService.clgAddress();
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	@DeleteMapping("/delete/{clgid}")
	public ResponseEntity<String> clearClg(@PathVariable("clgid") Integer clgid)
	{
		   String result= collageService.clearClg(clgid);
		   return ResponseEntity.status(HttpStatus.OK).body(result);
	}
	
}
