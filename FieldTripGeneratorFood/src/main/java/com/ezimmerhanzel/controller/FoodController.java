package com.ezimmerhanzel.controller;

import java.io.IOException;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ezimmerhanzel.domain.Coordinate;
import com.ezimmerhanzel.domain.Food;
import com.ezimmerhanzel.service.FoodService;

@RestController
@RequestMapping("/food")
public class FoodController {
	@Autowired
	FoodService foodService;
	
	@Deprecated
	@GetMapping
	public Collection<Food> getAll() {
		return foodService.getAllFood();
	}
	
	@PostMapping(consumes = "application/json", produces = "application/json")
	public Collection<Food> start(@RequestBody Coordinate coord) {
		foodService.deleteAllFood();
		foodService.findFood(coord);
		return foodService.getAllFood();
	}
	
	@ExceptionHandler(IOException.class)
	@ResponseStatus(value=HttpStatus.BAD_REQUEST)
	public String ioProblem() {
		return "Why aren't you using my program correctly you goon?";
	}
}
