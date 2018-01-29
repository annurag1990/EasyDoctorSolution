package com.ska.admin.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ska.admin.entity.DoctorProfile;
import com.ska.admin.service.DoctorProfileService;

@RestController
@RequestMapping("doctorProfile")
public class DoctorProfileController {
	
	
	@Autowired 
	private DoctorProfileService doctorProfileService;
	
	
	
	@PostMapping()
	public DoctorProfile save(@RequestBody DoctorProfile doctorProfile) {
		
		return doctorProfileService.save(doctorProfile);
		
	}
	
	

}
