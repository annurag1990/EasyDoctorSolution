package com.ska.admin.repository;

import org.springframework.stereotype.Repository;

import com.ska.admin.entity.DoctorProfile;

@Repository
public interface DoctorProfileRepository extends AbstractRepository<DoctorProfile, Long>{
	
}
