package com.revature.boot.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.boot.domain.Facility;
import com.revature.boot.domain.Information;

@Repository
public interface InformationRepository extends JpaRepository<Information, Long>{
	@Transactional
	List<Facility> findByIdBetween(Integer min, Integer max);
}
