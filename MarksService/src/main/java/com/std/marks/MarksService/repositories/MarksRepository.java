package com.std.marks.MarksService.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.std.marks.MarksService.entities.Marks;

public interface MarksRepository extends JpaRepository<Marks,String>{

	List<Marks> findByUserId(String userId);
	
	List<Marks> findByStudentId(String studentId);
}
