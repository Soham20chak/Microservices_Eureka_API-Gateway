package com.std.student.Controllers;



import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.std.student.entities.Student;
import com.std.student.services.StudentService;

@RestController
public class StudentController {
	
	
	@Autowired
	private StudentService studentService;
	
	
	@PostMapping("/students")
	public ResponseEntity<Student> createStudent(@RequestBody Student student){
		Student s = studentService.create(student);
		return ResponseEntity.status(HttpStatus.CREATED).body(s);
	}
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudents(){
		List<Student> s = studentService.getAll();
		return ResponseEntity.ok(s);
	}
	
	@GetMapping("/students/{studentId}")
	public ResponseEntity<Student> getStudent(@PathVariable String studentId){
		Student s = studentService.getStudent(studentId);
		return ResponseEntity.ok(s);
	}
	
	@DeleteMapping("/students/{studentId}")
	@ResponseBody
	public  void deleteStudent(@PathVariable String studentId){
		studentService.deleteStudent(studentId);
				
	}
	
	@PutMapping("/students/{studentId}")
	public ResponseEntity<Student> updateStudent(@PathVariable String studentId , @RequestBody Student student){
		student.setId(studentId);
		return ResponseEntity.ok().body(this.studentService.updateStudent(student));
	}
	
	@GetMapping("/students/department/{department}")
	
	public ResponseEntity<List<Student>> getStudentByDepartment(@PathVariable String department){
		List<Student> s = studentService.findByDepartment(department);
		return ResponseEntity.ok(s);
	}
	
	

}
