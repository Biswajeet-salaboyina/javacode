package com.student.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.student.entity.Student;

import jakarta.transaction.Transactional;

@Repository
@Transactional


public interface StudentRepository extends JpaRepository<Student, Integer>  {



	Optional<Student> findByIdAndName(Integer id, String name);

	List<Student> findByName(String name);

//	
//	@Query("Select e from Student e where e.name=:name")
	
	@Query(value = "Select * from Student_table where name = :name",nativeQuery = true)
	List<Student> getByName(String name);

	@Query(value = "Select * from Student_table ", nativeQuery = true)
	List<Student> getAll();

	@Query(value="Select * from Student_table where id=:id", nativeQuery = true)
	Optional<Student> getId(Integer id);

	@Query(value="Select * from Student_table where id=:id and name= :name", nativeQuery = true)
	Optional<Student> getByIdAndName(Integer id, String name);

//	@Query(value="Delete  from Student_table where id=:id ",nativeQuery = true)
//	void deletedata(Student response);
	
	

//	@Query(value="Update Student_table set age=:age where id=:id",nativeQuery = true)
//	Student Updatestu(Student response);

	


//	Optional<Student> fetchBygetIdandStatus(Integer id, String status);

	

}
