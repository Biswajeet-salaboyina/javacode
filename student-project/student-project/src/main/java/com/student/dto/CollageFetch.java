package com.student.dto;

import jakarta.persistence.Column;

public class CollageFetch {

	private Integer clgId;
	private String clgName;
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
	public Integer getStudentid() {
		return studentid;
	}
	public void setStudentid(Integer studentid) {
		this.studentid = studentid;
	}
	private Integer clgCode;
	private Integer studentid;
}
