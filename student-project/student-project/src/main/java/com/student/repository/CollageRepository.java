package com.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.entity.Address;
import com.student.entity.Collage;

public interface CollageRepository extends JpaRepository<Collage, Integer> {
	

}
