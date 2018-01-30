package com.ska.admin;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ska.admin.entity.DoctorProfile;
import com.ska.admin.entity.DoctorQualification;



public class TestDoctorQualificationMain {
	
	public static void main(String[] args)throws JsonProcessingException {
		
		DoctorProfile profile = new DoctorProfile();
		DoctorQualification qualification = new DoctorQualification();
		Set<DoctorQualification>doctorQualifications1 = new HashSet<>();
	    qualification.setCollege("hjdfh");
		qualification.setPassingYear("7676");
		qualification.setQualification("nnn");
		qualification.setDoctorProfile(profile);
		doctorQualifications1.add(qualification);
		
	
		ObjectMapper mapper = new ObjectMapper();
		String jsonInString = mapper.writeValueAsString(qualification);
		System.out.println(jsonInString);
	}
}