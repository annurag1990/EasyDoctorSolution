package com.ska.admin.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity

public class DoctorProfile implements Serializable {
	
	
	
	
	private static final long serialVersionUID = -4687118606338081375L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="docid",  length=50)
    private Long docId;
	
	@Column(name="title", length=50)
    private String title;
	
	@Column(name="name", length=100)
    private String name;
	
	@Column(name="gender", length=50)
    private String gender;
	
	@Column(name="contact", length=10)
    private String contact;
	
	@Column(name="email", length=50)
    private String email;
	
	@Column(name="house",length=50)
    private String house;
	
	@Column(name="street", length=50)
    private String street;
	
	@Column(name="city", length=50)
    private String city;
	
	@Column(name="country", length=50)
    private String country;
	
	@Column(name="pin", length=50)
    private String pin;
	
	
	@OneToOne(cascade =CascadeType.ALL)
	private DoctorRegistration doctorRegistration;
	
	@OneToMany(cascade =CascadeType.ALL)
	public List<DoctorExp>doctorExplist;

	@OneToMany(cascade =CascadeType.ALL)
	private Set<DoctorQualification>doctorQualificationSet;

	public Long getDocId() {
		return docId;
	}

	public void setDocId(Long docId) {
		this.docId = docId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public DoctorRegistration getDoctorRegistration() {
		return doctorRegistration;
	}

	public void setDoctorRegistration(DoctorRegistration doctorRegistration) {
		this.doctorRegistration = doctorRegistration;
	}

	public List<DoctorExp> getDoctorExplist() {
		return doctorExplist;
	}

	public void setDoctorExplist(List<DoctorExp> doctorExplist) {
		this.doctorExplist = doctorExplist;
	}

	public Set<DoctorQualification> getDoctorQualificationSet() {
		return doctorQualificationSet;
	}

	public void setDoctorQualificationSet(Set<DoctorQualification> doctorQualificationSet) {
		this.doctorQualificationSet = doctorQualificationSet;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
	
