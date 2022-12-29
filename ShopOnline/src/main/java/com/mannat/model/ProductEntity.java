package com.mannat.model;



import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class ProductEntity {
	
	@Id
	@Autowired
	@Column(name = "id")
	private Integer id;
	
	@Autowired
	@Column(name = "detail")
	private String detail;
	
	@Autowired
	@Column(name = "name")
	private String name;
	
	@Autowired
	@Column(name = "price")
	private Double price;
	
	@Autowired
	@Column(name = "qty")
	private Integer qty;
	
	@Autowired
	@Column(name = "img")
	private String img;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDetail() {
		return detail;
	}

	public void setDesc(String detail) {
		this.detail = detail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
	
	
	
}
