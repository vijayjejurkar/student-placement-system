package com.app.sps.models;


import javax.persistence.*;
/**
 * Entity Class For Student Object.
 * @author Vijay.Jejurkar
 *
 */
@Entity
public class Student {
	
	@Id
	private Integer id;
	private String firstName;
	private String lastName;
	private String mobileNumber;
	private String mailId;
	private String password;

	
	
	public Student() {
		super();
	}


	public Student(Integer id, String firstName, String lastName, String mobileNumber, String mailId, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.mailId = mailId;
		this.password = password;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getMailId() {
		return mailId;
	}


	public void setMailId(String mailId) {
		this.mailId = mailId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", mobileNumber="
				+ mobileNumber + ", mailId=" + mailId + ", password=" + password  + "]";
	}



	
	
}
