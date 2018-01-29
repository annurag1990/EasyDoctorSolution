package com.ska.admin.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DoctorQualification implements Serializable{
	

	private static final long serialVersionUID = 6185537664238068569L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="qualificationid",nullable = true, length=50)
    private Long qualificationId;
	
	@Column(name="qualification",nullable = true, length=50)
    private String qualification;
	
	@Column(name="college",nullable = true, length=50)
    private String college;
	
	@Column(name="passingyear",nullable = true, length=50)
    private String passingYear;

	public Long getQualificationId() {
		return qualificationId;
	}

	public void setQualificationId(Long qualificationId) {
		this.qualificationId = qualificationId;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getPassingYear() {
		return passingYear;
	}

	public void setPassingYear(String passingYear) {
		this.passingYear = passingYear;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
	

	