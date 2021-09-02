package com.student.fee.springboot.StudentFee.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.student.fee.springboot.StudentFee.entity.Student;
import com.student.fee.springboot.StudentFee.service.StudentService;


@Controller
@RequestMapping("/fee")
public class StudentRestController {

private StudentService studentService	;
	
	@Autowired
	public StudentRestController(StudentService theStudentService) {
		studentService=theStudentService;
	}
	
	@GetMapping("/list")
	public String findAll(Model theModel){
      List<Student> listStudents=studentService.findAll();
		
		theModel.addAttribute("students",listStudents);
		
		return "list-students";
	}
	
	@GetMapping("/showFormForAdd")
	public String get(Model theModel ) {
		
		Student theStudent=new Student();
		theModel.addAttribute("student", theStudent);
		return "student-form";
		
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("student") Student theStudent) {
		
		studentService.save(theStudent);
		return "redirect:/fee/list";
		
	}
	@GetMapping("/update")
	public String update(@RequestParam("studentId") int id, Model theModel) {
		
		
		Student theStudent=studentService.findById(id);
		theModel.addAttribute("student", theStudent);
		return "student-form";
		
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("studentId") int studentId) {
		Student tempStudent=studentService.findById(studentId);
		if(tempStudent==null) {
			throw new RuntimeException("StudentId doesn't exist: " + studentId);
			
		}
		studentService.deleteById(studentId);
		return "redirect:/fee/list";
	}
	
	
}
