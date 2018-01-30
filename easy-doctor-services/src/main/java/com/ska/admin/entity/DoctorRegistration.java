package com.ska.admin.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity

public class DoctorRegistration implements Serializable{
	

	private static final long serialVersionUID = -3906979155916574222L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="registrationid", nullable = false, length=50)
    private Long registrationId;
	
	@Column(name="regno",nullable = true, length=50)
    private String regNo;
	
	@Column(name="regcouncil",nullable = true, length=50)
    private String regCouncil;
	
	@Column(name="regyear",nullable = true, length=50)
    private String regYear;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JsonIgnore
	@JoinColumn(name="docid")
	public DoctorProfile doctorProfile;


	public DoctorProfile getDoctorProfile() {
		return doctorProfile;
	}

	public void setDoctorProfile(DoctorProfile doctorProfile) {
		this.doctorProfile = doctorProfile;
	}

	public Long getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(Long registrationId) {
		this.registrationId = registrationId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getRegCouncil() {
		return regCouncil;
	}

	public void setRegCouncil(String regCouncil) {
		this.regCouncil = regCouncil;
	}

	public String getRegYear() {
		return regYear;
	}

	public void setRegYear(String regYear) {
		this.regYear = regYear;
	}

	

}

