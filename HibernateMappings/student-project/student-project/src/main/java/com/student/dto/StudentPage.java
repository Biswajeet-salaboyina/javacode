package com.student.dto;

public class StudentPage {

	private Integer Id;
	private String name;
	private String mobilenumber;
	private Integer age;
	private String stuId;
	private Long totalElements;
	private Integer pagecount;
	public Integer getId() {
		return Id;
	}
	public StudentPage() {

	}
	public StudentPage(Integer id, String name, String mobilenumber, Integer age, String stuId, Long totalElements,
			Integer pagecount) {
		
		Id = id;
		this.name = name;
		this.mobilenumber = mobilenumber;
		this.age = age;
		this.stuId = stuId;
		this.totalElements = totalElements;
		this.pagecount = pagecount;
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
	public Long getTotalElements() {
		return totalElements;
	}
	public void setTotalElements(Long totalElements) {
		this.totalElements = totalElements;
	}
	public Integer getPagecount() {
		return pagecount;
	}
	public void setPagecount(Integer pagecount) {
		this.pagecount = pagecount;
	}
}
