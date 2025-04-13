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

import com.student.dto.AddressRequest;
import com.student.entity.Address;
import com.student.service.AddressService;


import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/address")
public class AddressController {

	@Autowired
	AddressService addressService;
	
	@PostMapping("/save/{studentid}")
	public ResponseEntity<String> createdAddress(@RequestBody AddressRequest request,@PathVariable("studentid") Integer studentid)
	{
		try {
		String response= addressService.createdAddress(request,studentid);
	
		
		
		
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
		}
		catch(Exception e)
		{
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to save");

		}
		
	}
	
	@GetMapping("/fetch/{aid}")
	public ResponseEntity<Address> fetchbyId(@PathVariable("aid") Integer aid)
	{
		Address respone=addressService.fetchbyId(aid);
		return ResponseEntity.status(HttpStatus.OK).body(respone);	}
	
	@GetMapping("/fetchby/{studentid}")
	
		public ResponseEntity<Address> fetchstudid(@PathVariable("studentid") Integer studentid)
		{
			Address response = addressService.fetchstudid(studentid);
			return ResponseEntity.status(HttpStatus.OK).body(response);
		}
	@GetMapping("/fetch-city/{city}")
	public ResponseEntity<List<Integer>> fetchCity(@PathVariable ("city") String city)
	{
		List<Integer> response = addressService.fetchCity(city);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteAddress(@PathVariable("id") Integer id)
	{
		String response = addressService.deleteAddress(id);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	@GetMapping("/fetch-address/{city}")
	public ResponseEntity<List<Address>> fetchAddress(@PathVariable("city") String city)
	{
		List<Address> response = addressService.fetchAddress(city);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
}
