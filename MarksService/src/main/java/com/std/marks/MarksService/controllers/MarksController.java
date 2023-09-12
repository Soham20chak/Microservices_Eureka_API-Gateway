package com.std.marks.MarksService.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.std.marks.MarksService.entities.Marks;
import com.std.marks.MarksService.services.MarksService;



@RestController
public class MarksController {
	@Autowired
	private MarksService marksService;
	
	@PostMapping("/marks")
	public ResponseEntity<Marks> create(@RequestBody Marks marks){
		Marks m = marksService.create(marks);
		return ResponseEntity.status(HttpStatus.CREATED).body(m);
	}
	
	@GetMapping("/marks")
	public ResponseEntity<List<Marks>> getMarks(){
		return ResponseEntity.ok(marksService.getMarks());
		
	}
	
	@GetMapping("/marks/users/{userId}")
	public ResponseEntity<List<Marks>> getMarksByUserId(@PathVariable String userId){
		return ResponseEntity.ok(marksService.getMarksByUserId(userId));
		
	}
	
	@GetMapping("/marks/students/{studentId}")
	public ResponseEntity<List<Marks>> getMarksByStudentId(@PathVariable String studentId){
		return ResponseEntity.ok(marksService.getMarksByStudentId(studentId));
		
	}
	
	

}
