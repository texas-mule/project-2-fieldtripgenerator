package com.revature.boot.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.boot.domain.Facility;
import com.revature.boot.repository.FacilityRepository;

@Service
public class FacilityService {
	@Autowired
	FacilityRepository facilityRepository;

	public void setFacilityRepository(FacilityRepository facilityRepository) {
		this.facilityRepository = facilityRepository;
	}

	@Transactional
	public List<Facility> getAllFacilities() {
		return this.facilityRepository.findAll();
	}

	@Transactional
	public Facility saveNewFacility(Facility f) {
		return facilityRepository.save(f);
	}

	@Transactional
	public void deleteById(Long id) {
		facilityRepository.deleteById(id);
	}

	@Transactional
	public List<Facility> getFacilityByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
