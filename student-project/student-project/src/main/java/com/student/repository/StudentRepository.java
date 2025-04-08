package com.student.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>  {



	Optional<Student> findByIdAndName(Integer id, String name);

	List<Student> findByName(String name);

	

}
