package com.app.sps.service;

import org.springframework.stereotype.Service;

import com.app.sps.models.Student;

@Service
public interface LoginService {
	
	public boolean passwordRecovery(String mailId,String password);
	public Student getStudentForCorrectCredentials(Integer id/*, String password*/);

}
