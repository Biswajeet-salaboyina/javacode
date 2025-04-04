package com.student.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;




@Entity 
@Table(name = "Student_table")
public class Student  implements Serializable{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Student(Integer id, String name, String mobilenumber, Integer age, String stuId, Gender gender,
			String status, LocalDateTime createAt, LocalDateTime updateAt) {
		Id = id;
		this.name = name;
		this.mobilenumber = mobilenumber;
		this.age = age;
		this.stuId = stuId;
		this.gender = gender;
		this.status = status;
		CreateAt = createAt;
		UpdateAt = updateAt;
	}
	public Student() {
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", mobilenumber=" + mobilenumber + ", age=" + age + ", stuId="
				+ stuId + ", gender=" + gender + ", status=" + status + ", CreateAt=" + CreateAt + ", UpdateAt="
				+ UpdateAt + "]";
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
	public LocalDateTime getCreateAt() {
		return CreateAt;
	}
	public void setCreateAt(LocalDateTime createAt) {
		CreateAt = createAt;
	}
	public LocalDateTime getUpdateAt() {
		return UpdateAt;
	}
	public void setUpdateAt(LocalDateTime updateAt) {
		UpdateAt = updateAt;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Id
	
	@Column (name = "Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer Id;
	private String name;
//	@Column(length =10) nullable = false , updatable = false	)
	@Column(length =10)
	private String mobilenumber;
	private Integer age;
	@Column(name = "stu_id", unique = true )
	private String stuId;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	private String status;
	@CreationTimestamp
	private LocalDateTime CreateAt;
	@UpdateTimestamp
	private LocalDateTime UpdateAt;
}
