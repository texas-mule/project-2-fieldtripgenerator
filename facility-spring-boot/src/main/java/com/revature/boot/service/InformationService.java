package com.revature.boot.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.boot.domain.Information;
import com.revature.boot.repository.InformationRepository;

@Service
public class InformationService {
	@Autowired
	InformationRepository informationRepository;

	@PersistenceContext
	private EntityManager em;

	public void setInformationRepository(InformationRepository informationRepository) {
		this.informationRepository = informationRepository;
	}

	@Transactional
	public List<Information> getAllInformation() {
		return this.informationRepository.findAll();
	}

	@Transactional
	public Information saveNewInformation(Information i) {
		return informationRepository.save(i);
	}

	@Transactional
	public void deleteById(Long id) {
		informationRepository.deleteById(id);
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Information> getAllInfo() {
		List<Information> info = new ArrayList<>();
		Query query = em.createNamedQuery("getAllInfo", Information.class);
		info = query.getResultList();
		em.close();

		return info;
	}
}
