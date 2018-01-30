package com.ska.admin.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ska.admin.entity.DoctorProfile;
import com.ska.admin.repository.DoctorProfileRepository;
import com.ska.admin.service.DoctorProfileService;

@Service
public class DoctorProfileServiceImpl implements DoctorProfileService{
	
	@Autowired
	private DoctorProfileRepository doctorProfileRepository;

	@Transactional
	@Override
	public DoctorProfile save(DoctorProfile doctorProfile) {
		return doctorProfileRepository.save(doctorProfile);
	}

	@Override
	public DoctorProfile get(Long docId) {
		return doctorProfileRepository.findOne(docId);
	}
	
	

}
