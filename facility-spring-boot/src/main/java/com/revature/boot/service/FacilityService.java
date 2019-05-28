package com.revature.boot.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.boot.domain.Facility;
import com.revature.boot.domain.Information;
import com.revature.boot.repository.FacilityRepository;

@Service
public class FacilityService {
	@Autowired
	FacilityRepository facilityRepository;
	
	@PersistenceContext
	private EntityManager em;

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
	public Facility getFacilityByName(String name) {
		return this.facilityRepository.findByName(name);
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Facility>searchFacilityByName(String name) {
		List<Facility> facilities = new ArrayList<>();
	    Query query = em.createNamedQuery("searchFacilityByName", Facility.class);
	    query.setParameter("name", name);
	    facilities = query.getResultList();

	    return facilities;
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<Facility>searchFeature(String feature) {
		List<Facility> facilities = new ArrayList<>();
	    Query query = em.createNamedQuery("searchFeature", Facility.class);
	    query.setParameter("feat", feature);
	    facilities = query.getResultList();

	    return facilities;
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<Facility>search(String feature) {
		List<Facility> facilities = new ArrayList<>();
	    Query query = em.createNamedQuery("search", Facility.class);
	    query.setParameter("feat", feature);
	    facilities = query.getResultList();

	    return facilities;
	}
	
	@Transactional
	public Information getContactInfoByName(String name) {
		Information info = new Information();
	    Query query = em.createNamedQuery("getContactInfoByName");
	    query.setParameter("name", name);
	    info = (Information) query.getSingleResult();

	    return info;
	}
		

}
