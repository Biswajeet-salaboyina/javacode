package com.student.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.student.entity.Address;
import com.student.entity.Student;
import com.student.exception.StudentDataException;
import com.student.dto.AddressRequest;
import com.student.repository.AddressRepository;
import com.student.repository.StudentRepository;
import com.student.service.AddressService;
import com.student.service.StudentService;

@Service
public class AddressServiceImpl implements AddressService{
//	@Qualifier(value = "service1")
	@Autowired
	AddressRepository addressRepository;
	@Autowired
	StudentService studentService;

	
	@Override
	public String createdAddress(AddressRequest request, Integer studentid) throws Exception {
		
		
		// TODO Auto-generated method stub
		try {
		Student response = studentService.fetchBygetId(studentid);
		Address address = new Address();
		address.setCity(request.getCity());
		address.setLocality(request.getLocality());
		address.setPlotno(request.getPlotno());
		address.setState(request.getState());
		address.setStudentid(response.getId());
		
		Address addressRes= addressRepository.save(address);
		if(addressRes == null)
		{
			throw new Exception("Failed to save records");

		}
		return"Saved succesfully";
	
		}
		catch (Exception ex)
		{
			System.out.println("Exception occured" + ex.getMessage());
			throw new Exception("Failed to save records");
		}
		 
	}


	@Override
	public Address fetchbyId(Integer aid) {
		// TODO Auto-generated method stub
	Optional<Address> result = addressRepository.findById(aid);
	
	 if(!result.isPresent())
	 {
		 throw new StudentDataException("Data not found");
	 }
		return result.get();
	}


	@Override
	public Address fetchstudid(Integer studentid) {
		// TODO Auto-generated method stub
		Optional<Address> result = addressRepository.findByStudentid(studentid);
		return result.get();
	}


	@Override
	public List<Integer> fetchCity(String city) {
		// TODO Auto-generated method stub
		
		List<Address> result = addressRepository.findByCity(city);
	
	List<Integer>res1  =	result.stream().map(s->
	{ return s.getStudentid();}).collect(Collectors.toList());
		
return res1;
	}


	@Override
	public String deleteAddress(Integer id) {
		// TODO Auto-generated method stub
		Address res= fetchbyId(id);
		 addressRepository.delete(res);
		
		return "deleted successfully ";
	}


	@Override
	public List<Address> fetchAddress(String city) {
		// TODO Auto-generated method stub
		List<Address> res =addressRepository.findByCity(city);
		return res;
	}
	

}
