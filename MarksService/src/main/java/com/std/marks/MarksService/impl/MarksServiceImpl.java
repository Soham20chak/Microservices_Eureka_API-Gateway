package com.std.marks.MarksService.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.std.marks.MarksService.entities.Marks;
import com.std.marks.MarksService.repositories.MarksRepository;
import com.std.marks.MarksService.services.MarksService;



@Service
public class MarksServiceImpl implements MarksService{
	
	@Autowired
	private MarksRepository repository;
	
	@Override
	public Marks create(Marks marks) {
		// TODO Auto-generated method stub
		String marksId = UUID.randomUUID().toString();
		marks.setMarksId(marksId);
		return repository.save(marks);
	}

	@Override
	public List<Marks> getMarks() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<Marks> getMarksByUserId(String userId) {
		// TODO Auto-generated method stub
		return repository.findByUserId(userId);
	}

	@Override
	public List<Marks> getMarksByStudentId(String studentId) {
		// TODO Auto-generated method stub
		return repository.findByStudentId(studentId);
	}

	

}
