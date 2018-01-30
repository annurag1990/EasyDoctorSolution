package com.ska.admin.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ska.admin.entity.DoctorProfile;
import com.ska.admin.entity.DoctorRegistration;
import com.ska.admin.service.DoctorProfileService;

@RestController
@RequestMapping("doctorRegistration")
public class DoctorRegistrationController {
	
@Autowired 
private DoctorProfileService doctorProfileService;

@PostMapping()

DoctorProfile save(@RequestBody DoctorRegistration doctorRegistration) {
	
	DoctorProfile doctorProfile = doctorProfileService.get((long) 2);
	doctorRegistration.setRegCouncil("DMC");
	doctorRegistration.setRegNo("3443");
	doctorRegistration.setRegYear("2017");
	doctorRegistration.setDoctorProfile(doctorProfile);
	doctorProfile.setDoctorRegistration(doctorRegistration);
	return doctorProfileService.save(doctorProfile);
}

}


