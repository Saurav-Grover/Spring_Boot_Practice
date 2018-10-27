package com.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.bean.Student;
import com.java.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping("/sms")
	public String sayHi() {
		return "Welcome to Student Management System";
	}

	@RequestMapping("/sms/students")
	public List<Student> viewAll() {
		return studentService.viewAll();
	}
	
	@RequestMapping("/sms/{id}")
	public Student viewById(@PathVariable int id) {
		return studentService.viewById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/sms/students")
	public void addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
	}
	
	@RequestMapping(value="/sms/{id}/students", method=RequestMethod.PUT)
	public void updateStudent(@RequestBody Student student,@PathVariable int id) {
		studentService.updateStudent(id,student);
	}
	
	@RequestMapping(value="/sms/{id}", method=RequestMethod.DELETE)
	public void deleteById(@PathVariable int id) {
		studentService.deleteById(id);
	}

}
