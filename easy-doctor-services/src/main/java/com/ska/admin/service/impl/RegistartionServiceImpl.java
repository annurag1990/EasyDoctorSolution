package com.ska.admin.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ska.admin.entity.Registration;
import com.ska.admin.repository.RegistrationRepository;
import com.ska.admin.service.RegistartionService;

@Service
public class RegistartionServiceImpl implements RegistartionService{
	
	@Autowired
	private RegistrationRepository registrationRepository;
	
	@Transactional
	@Override
	public Registration save(Registration registration) {
		
		return registrationRepository.save(registration);
	}
	
	@Override
	public Registration get(Long id) {
		return registrationRepository.findOne(id);
	}

}
