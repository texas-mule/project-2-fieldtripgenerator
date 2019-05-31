package com.revature.boot.controller;

import java.io.IOException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.revature.boot.domain.Facility;
import com.revature.boot.domain.Information;
import com.revature.boot.service.FacilityService;
import com.revature.boot.service.InformationService;

@RestController
@RequestMapping("/facilities")
public class FacilityController {
	@Autowired
	FacilityService facilityService;
	
	@Autowired
	InformationService informationService;
	
	@GetMapping
	public List<Facility> getAll() {
		return facilityService.getAllFacilities();
	}
	
	@GetMapping("/{name}")
	public Facility getFacilityByName(@PathVariable("name") String name){
		return facilityService.getFacilityByName(name);
	}
	
	@GetMapping("/contact")
	public List<Information> getAllInfo(){
		return informationService.getAllInfo();
	}
	
	@GetMapping("/contact/{name}")
	public Information getContactInfoByName(@PathVariable("name") String name) {
		return facilityService.getContactInfoByName(name);
	}
	
	@GetMapping("/search/name/{name}")
	public List<Facility> searchFacilityByName(@PathVariable("name") String name){
		return facilityService.searchFacilityByName(name);
	}
	
	@GetMapping("/search/feature/{feat}")
	public List<Facility> searchFeature(@PathVariable("feat") String feature){
		return facilityService.searchFeature(feature);
	}
	
	@GetMapping("/search/{feat}")
	public List<Facility> search(@PathVariable("feat") String feature){
		return facilityService.search(feature);
	}
	@GetMapping("/price/child/{facilityName}")
	public double getChildPrice(@PathVariable("facilityName") String name){
		return facilityService.getChildPrice(name);
	}
	@GetMapping("/price/adult/{facilityName}")
	public double getAdultPrice(@PathVariable("facilityName") String name){
		return facilityService.getAdultPrice(name);
	}
	
	@PostMapping
	public Facility add(@RequestBody @Valid Facility a, Errors errors) {
		if(errors.hasErrors()) return null;
		return facilityService.saveNewFacility(a);
	}
	
	@PostMapping(path = "/estimate")
	public double estimatePrice(@RequestParam("student_count") int student_count, @RequestParam("adult_count") int adult_count, @RequestParam("fac_name") String fac_name) {
		//if(errors.hasErrors()) return (Double) null;
		return facilityService.estimatePrice(student_count, adult_count, fac_name);
	}
	
	@DeleteMapping("/{id}")
	public String deleteById(@PathVariable("id") Long id) {
		facilityService.deleteById(id);
		return "deleted!";
	}
	
	@GetMapping("/address/full/{name}")
	public String getFullAddress(@PathVariable("name") String name) {
		return facilityService.getFullAddress(name);
	}
	
	@GetMapping("/address/{name}")
	public String getAddress(@PathVariable("name") String name) {
		return facilityService.getAddress(name);
	}
	@GetMapping("/city/{name}")
	public String getCity(@PathVariable("name") String name) {
		return facilityService.getCity(name);
	}
	@GetMapping("/state/{name}")
	public String getState(@PathVariable("name") String name) {
		return facilityService.getState(name);
	}
	@GetMapping("/zip/{name}")
	public String getZip(@PathVariable("name") String name) {
		return facilityService.getZip(name);
	}
	
	@GetMapping("/phone/{name}")
	public long getPhone(@PathVariable("name") String name) {
		return facilityService.getPhone(name);
	}
	
	@GetMapping("/website/{name}")
	public String getWebsite(@PathVariable("name") String name) {
		return facilityService.getWebsite(name);
	}
//	
//	@PutMapping("/name/{}")
//	@PutMapping("/description/{}")
//	@PutMapping("/address/{}")
//	@PutMapping("/city/{}")
//	@PutMapping("/state/{}")
//	@PutMapping("/zip/{}")
	
	@GetMapping("/oops")
	public void oops() throws IOException {
		throw new IOException();
	}
	
	@ExceptionHandler(IOException.class)
	@ResponseStatus(value=HttpStatus.I_AM_A_TEAPOT)
	public String ioProblem() {
		return "oops!";
	}
}
