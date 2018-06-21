package com.app.sps.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.sps.models.Student;

@Service
public interface StudentService {
	
	public Student studentRegisteration(Student student);
	public List<Student> getAllStudents();
	public Student studentUpdate(Student student);
	public Student getStudent(Integer id);

}
