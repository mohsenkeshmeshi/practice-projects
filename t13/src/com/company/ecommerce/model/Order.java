package com.company.ecommerce.model;

import java.time.LocalDate;

public class Order {
	
	private int id;
	private double amount;
	private LocalDate date;
	
	public Order(int id, double amount, LocalDate date) {
		this.id = id;
		this.amount = amount;
		this.date = date;
	}
	
	public int getId() {
		return id;
	}
	
	public double getamount() {
		return amount;
	}
	
	public LocalDate getDate() {
		return date;
	}

}
