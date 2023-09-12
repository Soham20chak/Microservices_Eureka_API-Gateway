package com.std.student.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.std.student.entities.Student;

public interface StudentRepository extends JpaRepository<Student,String> {
	List<Student> findByDepartment(String department);
}
