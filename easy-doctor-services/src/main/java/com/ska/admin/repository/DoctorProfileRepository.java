package com.ska.admin.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.ska.admin.entity.DoctorProfile;

@Repository
public interface DoctorProfileRepository extends AbstractRepository<DoctorProfile, Long>{
	
	//Optional<DoctorProfile>findDoctorById(Long id);
	
}
