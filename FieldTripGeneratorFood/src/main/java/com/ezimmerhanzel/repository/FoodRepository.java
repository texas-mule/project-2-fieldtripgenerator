package com.ezimmerhanzel.repository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Repository;

import com.ezimmerhanzel.domain.Food;

@Repository
public class FoodRepository {
	private ArrayList<Food> food;
	
	public FoodRepository(ArrayList<Food> food) {
		this.food = food;
	}
	
	public Collection<Food> getAll() {
		return this.food;
	}

	public void addFood(Food food) {
		this.food.add(food);
	}

	public void deleteAll() {
		this.food.clear();
	}
}
