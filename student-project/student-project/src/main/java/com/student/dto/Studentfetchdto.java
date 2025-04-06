package com.student.dto;

import com.student.entity.Gender;

public class Studentfetchdto {
	private Integer Id;
	private String name;
	private String mobilenumber;
	private Integer age;
	private String stuId;
	private Gender gender;
	private String status;
	public Studentfetchdto() {
		super();
	}
	public Studentfetchdto(Integer id, String name, String mobilenumber, Integer age, String stuId, Gender gender,
			String status) {
		super();
		Id = id;
		this.name = name;
		this.mobilenumber = mobilenumber;
		this.age = age;
		this.stuId = stuId;
		this.gender = gender;
		this.status = status;
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
	
	
	@Override
	public String toString() {
		return "Studentfetchdto [Id=" + Id + ", name=" + name + ", mobilenumber=" + mobilenumber + ", age=" + age
				+ ", stuId=" + stuId + ", gender=" + gender + ", status=" + status + "]";
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
	
}
