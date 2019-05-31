package com.revature.boot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "admissions")
public class Admission {
	@Id
	private int id;
	
	@javax.validation.constraints.Size(min = 3, max = 35)
	@Column(name = "baby_age")
	private String babyAge;

	@Column(name = "baby_price")
	private double babyPrice;
	
	@javax.validation.constraints.Size(min = 3, max = 35)
	@Column(name = "child_age")
	private String childAge;

	@Column(name = "child_price")
	private double childPrice;

	@javax.validation.constraints.Size(min = 3, max = 35)
	@Column(name = "adult_age")
	private String adultAge;
	
	@Column(name = "adult_price")
	private double adultPrice;

	@javax.validation.constraints.Size(min = 3, max = 35)
	@Column(name = "senior_age")
	private String seniorAge;

	@Column(name = "senior_price")
	private double seniorPrice;

	@Column(name = "vet_price")
	private double veteranPrice;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAdultPrice() {
		return adultPrice;
	}

	public void setAdultPrice(double adultPrice) {
		this.adultPrice = adultPrice;
	}

	public String getAdultAge() {
		return adultAge;
	}

	public void setAdultAge(String adultAge) {
		this.adultAge = adultAge;
	}

	public double getChildPrice() {
		return childPrice;
	}

	public void setChildPrice(double childPrice) {
		this.childPrice = childPrice;
	}

	public String getChildAge() {
		return childAge;
	}

	public void setChildAge(String childAge) {
		this.childAge = childAge;
	}

	public double getSeniorPrice() {
		return seniorPrice;
	}

	public void setSeniorPrice(double seniorPrice) {
		this.seniorPrice = seniorPrice;
	}

	public String getSeniorAge() {
		return seniorAge;
	}

	public void setSeniorAge(String seniorAge) {
		this.seniorAge = seniorAge;
	}

	public double getBabyPrice() {
		return babyPrice;
	}

	public void setBabyPrice(double babyPrice) {
		this.babyPrice = babyPrice;
	}

	public String getBabyAge() {
		return babyAge;
	}

	public void setBabyAge(String babyAge) {
		this.babyAge = babyAge;
	}

	public double getVeteranPrice() {
		return veteranPrice;
	}

	public void setVeteranPrice(double veteranPrice) {
		this.veteranPrice = veteranPrice;
	}

	@Override
	public String toString() {
		return "Admission [id=" + id + ", adultPrice=" + adultPrice + ", adultAge=" + adultAge + ", childPrice="
				+ childPrice + ", childAge=" + childAge + ", seniorPrice=" + seniorPrice + ", seniorAge=" + seniorAge
				+ ", babyPrice=" + babyPrice + ", babyAge=" + babyAge + ", veteranPrice=" + veteranPrice + "]";
	}

	public Admission(int id, double adultPrice, @Size(min = 3, max = 35) String adultAge, double childPrice,
			@Size(min = 3, max = 35) String childAge, double seniorPrice, @Size(min = 3, max = 35) String seniorAge,
			double babyPrice, @Size(min = 3, max = 35) String babyAge, double veteranPrice) {
		super();
		this.id = id;
		this.adultPrice = adultPrice;
		this.adultAge = adultAge;
		this.childPrice = childPrice;
		this.childAge = childAge;
		this.seniorPrice = seniorPrice;
		this.seniorAge = seniorAge;
		this.babyPrice = babyPrice;
		this.babyAge = babyAge;
		this.veteranPrice = veteranPrice;
	}

	public Admission() {
		super();
	}
}
