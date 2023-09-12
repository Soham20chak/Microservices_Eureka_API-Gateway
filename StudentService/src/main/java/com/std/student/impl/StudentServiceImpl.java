package com.std.student.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.std.student.entities.Student;
import com.std.student.exceptions.ResourceNotFoundException;
import com.std.student.repositories.StudentRepository;
import com.std.student.services.StudentService;


@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student create(Student student) {
		String studentId=UUID.randomUUID().toString();
		student.setId(studentId);
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAll() {
		List<Student>students;
		try {
			students=studentRepository.findAll();
		}
		catch(Exception e) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"There is a server error");
		}
		
			if(students.isEmpty()) {
				throw new ResponseStatusException(HttpStatus.NOT_FOUND,"No students have been found ");
			}
		
		return students;
	}

	@Override
	public Student getStudent(String id) {
		return studentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Student with the given id is not present !!!"));
	}

	@Override
	public void deleteStudent(String id) {
		 
		studentRepository.deleteById(id); 
		
	
	}

	@Override
	public Student updateStudent(Student student) {
		
		Optional<Student> studentDb = this.studentRepository.findById(student.getId());
		if(studentDb.isPresent()) {
			Student studentUpdate = studentDb.get();
			studentUpdate.setId(student.getId());
			studentUpdate.setName(student.getName());
			studentUpdate.setDepartment(student.getDepartment());
			studentUpdate.setAbout(student.getAbout());
			studentRepository.save(studentUpdate);
			return studentUpdate;
		}
		else {
			throw new ResourceNotFoundException("Record not found with id : " + student.getId());
		}
	
	}

	@Override
	public List<Student> findByDepartment(String department) {
		return studentRepository.findByDepartment(department);
	}
	

}
