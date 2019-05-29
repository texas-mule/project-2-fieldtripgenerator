package com.ezimmerhanzel.domain;

public class Food {
	private String name;

	private String rating;
	
	private String price_level;

	private Coordinate location;

	public Food(String name, String rating, String price_level, Coordinate location) {
		super();
		this.name = name;
		this.rating = rating;
		this.location = location;
		this.price_level = price_level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public Coordinate getLocation() {
		return location;
	}

	public void setLocation(Coordinate location) {
		this.location = location;
	}

	public String getPrice_level() {
		return price_level;
	}

	public void setPrice_level(String price_level) {
		this.price_level = price_level;
	}
}
