package com.ska.admin.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.ska.admin.entity.Registration;

@Repository
public interface RegistrationRepository extends AbstractRepository<Registration, Long>{
	
	 Optional<Registration> findByName(String name);

}

