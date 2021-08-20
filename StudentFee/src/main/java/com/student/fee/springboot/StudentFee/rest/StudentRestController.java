package com.student.fee.springboot.StudentFee.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.fee.springboot.StudentFee.entity.Student;
import com.student.fee.springboot.StudentFee.service.StudentService;


@RestController
@RequestMapping("/fee")
public class StudentRestController {

private StudentService studentService	;
	
	@Autowired
	public StudentRestController(StudentService theStudentService) {
		studentService=theStudentService;
	}
	
	@GetMapping("/list")
	public List<Student> findAll(){
		return studentService.findAll();
	}
	
	@GetMapping("/fee/{studentId}")
	public Student get(@PathVariable int studentId ) {
		
		Student theStudent=studentService.findById(studentId);
		if(theStudent==null) {
			throw new RuntimeException("StudentId not Found: " + studentId);
		}
		return theStudent;
		
	}
	
	@PostMapping("/fee")
	public Student save(@RequestBody Student theStudent) {
		
		theStudent.setId(0);
		studentService.save(theStudent);
		return theStudent;
		
	}
	@PutMapping("/fee")
	public Student update(@RequestBody Student theStudent) {
		
		
		studentService.save(theStudent);
		return theStudent;
		
	}
	
	@DeleteMapping("/fee/{studentId}")
	public String delete(@PathVariable int studentId) {
		Student tempStudent=studentService.findById(studentId);
		if(tempStudent==null) {
			throw new RuntimeException("StudentId doesn't exist: " + studentId);
			
		}
		studentService.deleteById(studentId);
		return "Deleted StudentId : " + studentId;
	}
	
	
}
