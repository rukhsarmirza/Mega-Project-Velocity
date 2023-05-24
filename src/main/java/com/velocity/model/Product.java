package com.velocity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String productName;
	private String description;
	private String amount;
	private String categary;
	private int categaryId;
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAmonut() {
		return amount;
	}

	public void setAmonut(String amount) {
		this.amount = amount;
	}
	public String getCategary() {
		return categary;
	}

	public void setCategary(String categary) {
		this.categary = categary;
	}
	public int getCategaryId() {
		return categaryId;
	}
	public void setCategaryId(int categaryId) {
		this.categaryId = categaryId;
	}

}
