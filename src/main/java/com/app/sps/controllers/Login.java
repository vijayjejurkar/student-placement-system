package com.app.sps.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.app.sps.models.Student;
import com.app.sps.service.LoginService;


@RestController
public class Login {

	@Autowired
	private LoginService loginService;

	/**
	 * Method To Login As Student
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public Student firstPage(@RequestParam(required = true) Integer id, @RequestParam(required = true) String password) 
	{
		Student verifiedStudent = loginService.getStudentForCorrectCredentials(id);
		if(verifiedStudent != null && verifiedStudent.getPassword().equals(password))
			return verifiedStudent;
		return null;
	}


	
	/**
	 * Method to Recover the password
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "/forgetPassword", method = RequestMethod.POST)
	public String forgetPassword(@RequestParam(required = true) Integer id)
	{
		Student studentVerified = loginService.getStudentForCorrectCredentials(id/*, password*/);
		if(studentVerified != null) {
			String msg = loginService.passwordRecovery(studentVerified.getMailId(),studentVerified.getPassword()) 
					? "Password sent to your registered Mail Id.." : "Error Occured While Sending Email";
			return msg;
		}	
		return "Invalid Username or User ID";		
	}
	
}
