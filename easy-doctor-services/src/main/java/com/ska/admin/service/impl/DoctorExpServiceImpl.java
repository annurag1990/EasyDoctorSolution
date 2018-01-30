package com.ska.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ska.admin.entity.DoctorExp;
import com.ska.admin.repository.DoctorExpRepository;
import com.ska.admin.service.DoctorExpService;

@Service
public class DoctorExpServiceImpl implements DoctorExpService {

	@Autowired
	DoctorExpRepository doctorExpRepository;

	@Override
	public DoctorExp save(DoctorExp doctorExp) {
		return doctorExpRepository.save(doctorExp);
	}

}
