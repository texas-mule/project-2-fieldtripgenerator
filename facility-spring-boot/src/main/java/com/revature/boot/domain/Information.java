package com.revature.boot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "information")
public class Information {
	@Id private int id;
	@Column(name="hours") private String hours;
	@Column(name="admission") private String admission;
	@Column(name="telephone_num", length=10)
	@NotBlank 
	@Pattern(regexp="[0-9]+")
	private long phone_num;
	@Column(name="website")	private String web_site;
	
	public Information(int id, String hours, String admission, @NotBlank @Pattern(regexp = "[0-9]+") long phone_num,
			String web_site) {
		super();
		this.id = id;
		this.hours = hours;
		this.admission = admission;
		this.phone_num = phone_num;
		this.web_site = web_site;
	}

	public Information() {
		super();
	}

	@Override
	public String toString() {
		return "Information [id=" + id + ", hours=" + hours + ", admission=" + admission + ", phone_num=" + phone_num
				+ ", web_site=" + web_site + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHours() {
		return hours;
	}

	public void setHours(String hours) {
		this.hours = hours;
	}

	public String getAdmission() {
		return admission;
	}

	public void setAdmission(String admission) {
		this.admission = admission;
	}

	public long getPhone_num() {
		return phone_num;
	}

	public void setPhone_num(long phone_num) {
		this.phone_num = phone_num;
	}

	public String getWeb_site() {
		return web_site;
	}

	public void setWeb_site(String web_site) {
		this.web_site = web_site;
	}
	
	
}
