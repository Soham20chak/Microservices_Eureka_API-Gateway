package com.std.user.service.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "micro_users")
public class User {
	@Id
	private String userId;
	
	@NotBlank
	private String name;
	
	@Email
	private String email;
	
	@NotBlank
	private String department;
	
	@Transient
	private List<Marks> marks = new ArrayList<>();
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public User(String userId, String name, String email, String department) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.department = department;
	}
	public User() {
		
	}
	public User(String userId, String name, String email, String department, List<Marks> marks) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.department = department;
		this.marks = marks;
	}
	public List<Marks> getMarks() {
		return marks;
	}
	public void setMarks(List<Marks> marks) {
		this.marks = marks;
	}
	
	
}
