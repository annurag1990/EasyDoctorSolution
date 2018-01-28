package com.ska.admin.service;

import com.ska.admin.entity.Registration;

public interface RegistartionService {

	Registration save(Registration registration);

	Registration get(Long id);

}
