package com.revature.boot.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.boot.domain.Facility;

@Repository
public interface FacilityRepository extends JpaRepository<Facility, Long>{
	Facility findByName(String name);

	@Transactional
	List<Facility> findByIdBetween(Integer min, Integer max);
	
	
}
