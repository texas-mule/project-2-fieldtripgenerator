package com.ezimmerhanzel.domain;

public class Coordinate {
	private double lat;

	private double lng;

	public Coordinate(double lat, double lng) {
		this.lat = lat;
		this.lng = lng;
	}

	public Coordinate() {
		super();
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}

	@Override
	public String toString() {
		return Double.toString(lat) + "," + Double.toString(lng);
	}
}
