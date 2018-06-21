package com.app.sps.service;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.sps.models.Student;
import com.app.sps.repository.StudentRepository;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private StudentRepository studentRepository;
	
	/**
	 * Method to send mail which recovers password..
	 */
	
	@Override
	public boolean passwordRecovery(String reciepientMail,String password) {
	      String senderMail = "test9.perf.003@gmail.com";
	      String senderPassword = "atmecs@123";
	      Properties properties = System.getProperties();
	  	  	properties.put("mail.smtp.auth", "true");
	  	  	properties.put("mail.smtp.starttls.enable", "true");
	  	  	properties.put("mail.smtp.host", "smtp.gmail.com");
	  	  	properties.put("mail.smtp.port", "587");
	      
	  	  Session session = Session.getInstance(properties,
	  			  new javax.mail.Authenticator() {
	  				protected PasswordAuthentication getPasswordAuthentication() {
	  					return new PasswordAuthentication(senderMail,senderPassword);
	  				}
	  			  });
	      try
	      {
	         MimeMessage message = new MimeMessage(session);
	         message.setFrom(new InternetAddress(senderMail));
	         message.addRecipients(Message.RecipientType.TO,InternetAddress.parse(reciepientMail));
	         message.setSubject("Password Recovery");
	         message.setText("Your Password For Account = "+password);
	         Transport.send(message);
	         return true;
	      }
	      catch (MessagingException exception) 
	      {
	         exception.printStackTrace();
	      }
		return false;
	   }

	
	/**
	 * Method to Get Trusted User Based On User Credentials.
	 */
	@Override
	public Student getStudentForCorrectCredentials(Integer id/*, String password*/) 
	{
		Student student = studentRepository.findOne(id);
		if(student != null) {
			return student;
		}
		return null;
	}
	


}
