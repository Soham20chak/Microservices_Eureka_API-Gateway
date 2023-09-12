package com.std.student.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name="students")
public class Student {
	
	@Id
	private String id;
	@NotBlank
	private String name;
	@NotBlank
	private String department;
	private String about;
	public Student(String id, String name, String department, String about) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.about = about;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public Student() {
		
	}
	
}
