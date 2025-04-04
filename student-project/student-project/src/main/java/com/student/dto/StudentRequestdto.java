package com.student.dto;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import com.student.entity.Gender;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class StudentRequestdto {

	
	
	private String name;

	private String mobilenumber;
	private Integer age;
	
	private Gender gender;



	@Override
	public String toString() {
		return "StudentRequestdto [name=" + name + ", mobilenumber=" + mobilenumber + ", age=" + age + ", gender="
				+ gender + "]";
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getMobilenumber() {
		return mobilenumber;
	}



	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}



	public Integer getAge() {
		return age;
	}



	public void setAge(Integer age) {
		this.age = age;
	}



	public Gender getGender() {
		return gender;
	}



	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
}
