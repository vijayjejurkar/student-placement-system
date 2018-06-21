package com.app.sps.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Qualification {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Integer year;
	private String qualification;
	private Double percentage;
	private String nameOfSchool;
	
	public Qualification() {
		super();
	}

	public Qualification(Integer year, String qualification, Double percentage, String nameOfSchool) {
		super();
		this.year = year;
		this.qualification = qualification;
		this.percentage = percentage;
		this.nameOfSchool = nameOfSchool;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	public String getNameOfSchool() {
		return nameOfSchool;
	}

	public void setNameOfSchool(String nameOfSchool) {
		this.nameOfSchool = nameOfSchool;
	}

	@Override
	public String toString() {
		return "Qualification [id=" + id + ", year=" + year + ", qualification=" + qualification + ", percentage="
				+ percentage + ", nameOfSchool=" + nameOfSchool + "]";
	}
	
	
	
	
}
