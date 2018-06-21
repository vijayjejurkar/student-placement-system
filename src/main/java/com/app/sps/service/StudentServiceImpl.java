package com.app.sps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.sps.models.Student;
import com.app.sps.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student studentRegisteration(Student student) {
		
		return studentRepository.save(student);
	}
	
	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}

	@Override
	public Student studentUpdate(Student student) {
		return studentRepository.save(student);
		
		
	}

	@Override
	public Student getStudent(Integer id) {
	
		return studentRepository.findOne(id);
		
	}


}
