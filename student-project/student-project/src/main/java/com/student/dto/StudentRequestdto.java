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
	private String status;
	
	private Gender gender;
	private Integer clgId;



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



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public Integer getClgId() {
		return clgId;
	}



	public void setClgId(Integer clgId) {
		this.clgId = clgId;
	}
	
}
