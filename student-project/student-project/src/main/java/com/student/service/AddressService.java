package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dto.AddressRequest;
import com.student.entity.Address;
import com.student.repository.AddressRepository;


public interface AddressService {
 
	
	

	

	String createdAddress(AddressRequest request, Integer studentid) throws Exception;

	Address fetchbyId(Integer aid);

	Address fetchstudid(Integer studentid);

	List<Integer> fetchCity(String city);

	String deleteAddress(Integer id);

	List<Address> fetchAddress(String city);

}
