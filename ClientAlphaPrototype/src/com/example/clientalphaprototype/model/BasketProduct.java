package com.example.clientalphaprototype.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BasketProduct extends Product {
	
	@JsonProperty("notes") private String notes;

	public BasketProduct(long id, String name, BigDecimal price, String notes) {
		super(id, name, price);
		this.notes = notes;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	
}
