package com.mannat.model;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "address")
public class AddressEntity {

	@Id
	@Autowired
	@Column(name = "id")
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CustomerEntity getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}

	public String getAptNum() {
		return aptNum;
	}

	public void setAptNum(String aptNum) {
		this.aptNum = aptNum;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	@OneToOne
	@JoinColumn(name = "id", referencedColumnName = "userid")
	private CustomerEntity customer;
	@Autowired
	@Column(name = "apt_num")
	private String aptNum;

	@Autowired
	@Column(name = "city")
	private String city;

	@Autowired
	@Column(name = "country")
	private String country;

	@Autowired
	@Column(name = "pincode")
	private String pincode;

	@Autowired
	@Column(name = "street_name")
	private String streetName;

}
