package com.ska.admin.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ska.admin.entity.DoctorQualification;
import com.ska.admin.repository.DoctorQualificationRepository;
import com.ska.admin.service.DoctorQualificationService;

@Service
public class DoctorQualificationServiceImpl implements DoctorQualificationService{
	
	@Autowired 
	private DoctorQualificationRepository doctorQualificationRepository;

	@Transactional
	@Override
	public DoctorQualification save(DoctorQualification doctorQualification) {
		return doctorQualificationRepository.save(doctorQualification);
	}

}
