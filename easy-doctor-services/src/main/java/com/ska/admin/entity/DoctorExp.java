package com.ska.admin.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class DoctorExp {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="expid",nullable = true, length=50)
    private Integer expId;
	
	@Column(name="clinicname",nullable = true, length=50)
    private String clinicName;
	
	@Column(name="location",nullable = true, length=50)
    private String location;
	
	@Column(name="day",nullable = true, length=50)
    private String day;
	
	@Column(name="timing",nullable = true, length=50)
    private String timing;
	
	@Column(name="description",nullable = true, length=50)
    private String description;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JsonIgnore
	@JoinColumn(name ="docid")
	private DoctorProfile doctorProfile;

	public Integer getExpId() {
		return expId;
	}

	public void setExpId(Integer expId) {
		this.expId = expId;
	}

	public String getClinicName() {
		return clinicName;
	}

	public void setClinicName(String clinicName) {
		this.clinicName = clinicName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getTiming() {
		return timing;
	}

	public void setTiming(String timing) {
		this.timing = timing;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public DoctorProfile getDoctorProfile() {
		return doctorProfile;
	}

	public void setDoctorProfile(DoctorProfile doctorProfile) {
		this.doctorProfile = doctorProfile;
	}
	
}
	