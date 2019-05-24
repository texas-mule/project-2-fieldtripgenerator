package com.revature.boot.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "facilities")
public class Facility {
	public Facility(Long id, String description, String address, String city, @Pattern(regexp = "[A-Z]+") String state,
			int zip, Information visiting_info,
			@Pattern(regexp = "[a-zA-Z]+") @Size(min = 2, max = 45) @NotBlank String name) {
		super();
		this.id = id;
		this.description = description;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.visiting_info = visiting_info;
		this.name = name;
	}

	@Id private Long id;
	@Column(name="description") private String description;
	@Column(name="address") private String address;
	@Column(name="city") private String city;
	@Pattern(regexp="[A-Z]+")
	@Column(name="state") private String state;
	@Column(name="zip", length=2) private int zip;
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "visit_id")
	private Information visiting_info;
	
	@Pattern(regexp="[a-zA-Z]+")
	@javax.validation.constraints.Size(min=2, max=45)
	@NotBlank
	@Column(name="facility_name")
	private String name;


	@Override
	public String toString() {
		return "Facility [id=" + id + ", name=" + name + ", description=" + description + ", address=" + address
				+ ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}

	public Facility() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public Information getVisiting_info() {
		return visiting_info;
	}

	public void setVisiting_info(Information visiting_info) {
		this.visiting_info = visiting_info;
	}

}
