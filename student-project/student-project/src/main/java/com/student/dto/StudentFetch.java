package com.student.dto;

import com.student.entity.Gender;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class StudentFetch {
	private Integer Id;
	private String name;
	private String mobilenumber;
	private Integer age;
	private String stuId;
	public StudentFetch() {
	}
	public StudentFetch(Integer id, String name, String mobilenumber, Integer age, String stuId, Gender gender,
			String status) {
		Id = id;
		this.name = name;
		this.mobilenumber = mobilenumber;
		this.age = age;
		this.stuId = stuId;
		this.gender = gender;
		this.status = status;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
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
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
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
	private Gender gender;
	private String status;

}
