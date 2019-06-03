package com.revature.boot.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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
	public List<Facility> searchFacilityByName(String name) {
		List<Facility> facilities = new ArrayList<>();
		Query query = em.createNamedQuery("searchFacilityByName", Facility.class);
		query.setParameter("name", name);
		facilities = query.getResultList();
		em.close();

		return facilities;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Facility> searchFeature(String feature) {
		List<Facility> facilities = new ArrayList<>();
		Query query = em.createNamedQuery("searchFeature", Facility.class);
		query.setParameter("feat", feature);
		facilities = query.getResultList();
		em.close();

		return facilities;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Facility> search(String feature) {
		List<Facility> facilities = new ArrayList<>();
		Query query = em.createNamedQuery("search", Facility.class);
		query.setParameter("feat", feature);
		facilities = query.getResultList();
		em.close();

		return facilities;
	}

	@Transactional
	public Information getContactInfoByName(String name) {
		Information info = new Information();
		Query query = em.createNamedQuery("getContactInfoByName");
		query.setParameter("name", name);
		info = (Information) query.getSingleResult();
		em.close();

		return info;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public String getFullAddress(String name) {
		String address = "";
		Query query = em.createNamedQuery("getFullAddress");
		query.setParameter("name", name);
		List<Object[]> addr = query.getResultList();
		for(Object[] a : addr) {
			address = a[0] + " " + a[1] + ", " + a[2] + " " + a[3];
		}
		em.close();
		return address;
	}
	
	@Transactional
	public String getAddress(String name) {
		Query query = em.createNamedQuery("getAddress");
		query.setParameter("name", name);
		em.close();
		return query.getSingleResult().toString();
	}
	
	@Transactional
	public String getCity(String name) {
		Query query = em.createNamedQuery("getCity");
		query.setParameter("name", name);
		em.close();
		return query.getSingleResult().toString();
	}
	
	@Transactional
	public String getState(String name) {
		Query query = em.createNamedQuery("getState");
		query.setParameter("name", name);
		em.close();
		return query.getSingleResult().toString();
	}
	@Transactional
	public String getZip(String name) {
		Query query = em.createNamedQuery("getZip");
		query.setParameter("name", name);
		em.close();
		return query.getSingleResult().toString();
	}
	
	@Transactional
	public long getPhone(String name) {
		Query query = em.createNamedQuery("getPhone");
		query.setParameter("name", name);
		em.close();
		return (long) query.getSingleResult();
	}
	
	@Transactional
	public String getWebsite(String name) {
		Query query = em.createNamedQuery("getWebsite");
		query.setParameter("name", name);
		em.close();
		return query.getSingleResult().toString();
	}
	@Transactional
	public double getChildPrice(String name) {
		Query query = em.createNamedQuery("getChildPrice");
		query.setParameter("name", name);
		em.close();
		return (double) query.getSingleResult();
	}
	@Transactional
	public double getAdultPrice(String name) {
		Query query = em.createNamedQuery("getAdultPrice");
		query.setParameter("name", name);
		em.close();
		return (double) query.getSingleResult();
	}
	
	@Transactional
	public double estimatePrice(int numStudents, int numTeachers, String facilityName) {
		return (this.getChildPrice(facilityName) * numStudents) + (this.getAdultPrice(facilityName) * numTeachers);
	}
}
