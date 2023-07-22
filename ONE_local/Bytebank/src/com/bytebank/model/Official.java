package com.bytebank.model;

public abstract class Official {
	private String name;
	private String id;
	private double payment;

	public Official() {

	}

	public Official(String name, String id, double payment) {
		super();
		this.name = name;
		this.id = id;
		this.payment = payment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}

	public abstract double getBonus();

}
