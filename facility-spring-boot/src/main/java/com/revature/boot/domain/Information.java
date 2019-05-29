package com.revature.boot.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import com.revature.boot.domain.Admission;

@Entity
@Table(name = "information")
@NamedQueries({
	@NamedQuery(name = "getAllInfo", query = "from Information"),
	@NamedQuery(name = "getAllPhones", query = "select i.phone_num from Information as i"),
	@NamedQuery(name = "getAllWebsites", query = "select i.web_site from Information as i"),
	@NamedQuery(name = "getAllAdmissions", query = "select i.admission from Information as i"),
	@NamedQuery(name = "getAllHours", query = "select i.hours from Information as i"),
})
public class Information {
	@Id 
	private int id;
	@Column(name="hours") 
	private String hours;
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="admission") 
	private Admission admission;
	@Column(name="telephone_num", length=10)
	@NotBlank 
	@Pattern(regexp="[0-9]+")
	private long phone_num;
	@Column(name="website")	
	private String web_site;
	
	public Information(int id, String hours, Admission admission, @NotBlank @Pattern(regexp = "[0-9]+") long phone_num,
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

	public Admission getAdmission() {
		return admission;
	}

	public void setAdmission(Admission admission) {
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
