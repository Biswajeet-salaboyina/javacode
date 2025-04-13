package com.student.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.student.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

//	@Query(value= "Select * from address where studentid=:studentid", nativeQuery=true)
//	Optional<Address> findBysId(Integer studentid);

	Optional<Address> findByStudentid(Integer studentid);

	List<Address> findByCity(String city);

	
	
}
