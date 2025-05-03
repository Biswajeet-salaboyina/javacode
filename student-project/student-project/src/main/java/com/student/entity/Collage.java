package com.student.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Collage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer clgId;
	public Integer getClgId() {
		return clgId;
	}
	public void setClgId(Integer clgId) {
		this.clgId = clgId;
	}
	public String getClgName() {
		return clgName;
	}
	public void setClgName(String clgName) {
		this.clgName = clgName;
	}
	public Integer getClgCode() {
		return clgCode;
	}
	public void setClgCode(Integer clgCode) {
		this.clgCode = clgCode;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private String clgName;
	@Column(unique = true)
	private Integer clgCode;

	
	

}
