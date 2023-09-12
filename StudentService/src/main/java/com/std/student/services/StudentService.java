package com.std.student.services;

import java.util.List;

import com.std.student.entities.Student;

public interface StudentService {
	Student create(Student student);
	
	List<Student> getAll();
	
	Student getStudent(String id);
	void deleteStudent(String id);
	Student updateStudent(Student student);
	List<Student> findByDepartment(String department);

}
