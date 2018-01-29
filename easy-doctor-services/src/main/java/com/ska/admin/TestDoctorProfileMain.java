package com.ska.admin;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ska.admin.entity.DoctorProfile;
import com.ska.admin.entity.DoctorQualification;

public class TestDoctorProfileMain  {
	
	public static void main(String[] args) throws JsonProcessingException{
		
		DoctorProfile profile = new DoctorProfile();
		DoctorQualification qualification = new DoctorQualification();
		DoctorQualification qualification1 = new DoctorQualification();
		Set<DoctorQualification>doctorQualifications1 = new HashSet<>();
		doctorQualifications1.add(qualification1);
		doctorQualifications1.add(qualification);
		profile.setDoctorQualificationSet(doctorQualifications1);
		qualification.setCollege("mcmt");
		qualification.setPassingYear("2017");
		qualification.setQualification("mbbs");
		qualification1.setCollege("mcmt");
		qualification1.setPassingYear("2017");
		qualification1.setQualification("mbbs");
		profile.setTitle("dr");
		profile.setName("ak");
		profile.setGender("female");
		profile.setContact("88787");
		profile.setCity("delhi");
		profile.setStreet("ewe");
		profile.setHouse("324234");
		ObjectMapper mapper = new ObjectMapper();
		String jsonInString = mapper.writeValueAsString(profile);
		System.out.println(jsonInString);
		
	}

}
