package com.ska.admin.rest.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ska.admin.entity.DoctorProfile;
import com.ska.admin.entity.DoctorQualification;
import com.ska.admin.service.DoctorProfileService;

@RestController
@RequestMapping("doctorQualification")
public class DoctorQualificationController {
	
/*	@Autowired
	private DoctorQualificationService doctorQualificationService;*/
	@Autowired 
	private DoctorProfileService doctorProfileService;
	
	@PostMapping()
		
		DoctorProfile save(@RequestBody DoctorQualification doctorQualification,HttpServletRequest request) {
		
		
		DoctorProfile doctorProfile = doctorProfileService.get((long)2);
		doctorQualification.setCollege("mcmt maldahiya");
		doctorQualification.setPassingYear("2015");
		doctorQualification.setQualification("MBBS MD");
		doctorQualification.setDoctorProfile(doctorProfile);
		doctorProfile.getDoctorQualificationSet().add(doctorQualification);
		return doctorProfileService.save(doctorProfile);
		
		
		
		
		/*DoctorProfile doctorProfile = doctorProfileService.get((long)2);
		Set<DoctorQualification>doctorQualificationSet = doctorProfile.getDoctorQualificationSet();
		doctorQualification.setQualification(request.getParameter("ba"));
		String x = request.getParameter("x");
		System.out.println(x);
		doctorQualification.setCollege(request.getParameter("ptu"));
		doctorQualification.setPassingYear(request.getParameter("2000"));
		doctorQualification.setDoctorProfile(doctorProfile);
		doctorQualificationSet.add(doctorQualification);
		doctorProfile.setDoctorQualificationSet(doctorQualificationSet);
			return doctorProfileService.save(doctorProfile);*/
		}
	}
	
	


