package com.ska.admin.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ska.admin.entity.Registration;
import com.ska.admin.service.RegistartionService;


@RestController
@RequestMapping("registration")
public class RegistrationController {
	
	 
	private static final Logger log = LoggerFactory.getLogger(RegistrationController.class);
	

	
	@Autowired
	private RegistartionService registartionService;
	
	
	@PostMapping()
	public Registration save(@RequestBody Registration registration) {
		log.debug("registration method start");
		return registartionService.save(registration);
	}
	
	@GetMapping("/{id}")
	public Registration save(@PathVariable("id") Long id) {
		return registartionService.get(id);
	}

}
