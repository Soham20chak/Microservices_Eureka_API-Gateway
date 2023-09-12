package com.std.marks.MarksService.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.std.marks.MarksService.entities.Marks;


@Service
public interface MarksService {
	//create 
	Marks create(Marks marks);
	
	
	//get all the marks
	List<Marks> getMarks();
	
	//get all by UserId
	List<Marks> getMarksByUserId(String userId);
	
	//get all by studentId
	List<Marks> getMarksByStudentId(String studentId);



	
	
}
