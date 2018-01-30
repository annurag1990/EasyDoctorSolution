package com.ska.admin.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ska.admin.entity.DoctorExp;
import com.ska.admin.entity.DoctorProfile;
import com.ska.admin.service.DoctorProfileService;

@RestController
@RequestMapping("doctorExp")
public class DoctorExpController {

	@Autowired
	private DoctorProfileService doctorProfileService;

	
	@PostMapping()
	DoctorProfile save(@RequestBody DoctorExp doctorExp) {

		DoctorProfile doctorProfile = doctorProfileService.get((long) 2);
		doctorExp.setClinicName("kaya");
		doctorExp.setDay("monday");
		doctorExp.setDescription("sjajsgfjasfj");
		doctorExp.setDoctorProfile(doctorProfile);
		doctorProfile.getDoctorExplist().add(doctorExp);
		return doctorProfileService.save(doctorProfile);

	}

}
