package com.app.sps.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.sps.models.Student;
import com.app.sps.service.StudentService;


@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentServiceInterface;
	
	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public Student getStudentById	(@PathVariable(required = true) Integer id)
	{
		System.out.println(id);
		return studentServiceInterface.getStudent(id);
	}
	
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public List<Student> getAllStudents()
	{
		return studentServiceInterface.getAllStudents();
	}

	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public String registerStudent(@RequestBody Student student) 
	{
		System.out.println(student);
		return studentServiceInterface.studentRegisteration(student) == null ?  "FAIL" : "SUCESSFUL";
		
	}
	
	
	@RequestMapping(method = RequestMethod.PUT, produces = "application/json")
	public Student updateStudent(@RequestBody Student student)
	{
		studentServiceInterface.studentUpdate(student);
		return null;
		
	}
	

}