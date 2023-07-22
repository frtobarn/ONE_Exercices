package com.bytebank.model;

public class Admin extends Official implements Logeable {

	private AuthTool loginTool;

	public Admin() {
		super();
		this.loginTool = new AuthTool();
	}

	public Admin(String name, String id, double payment) {
		super(name, id, payment);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getBonus() {
		return this.getPayment();
	}

	@Override
	public boolean login(String password) {
		return this.loginTool.login(password);
	}

	@Override
	public void setPassword(String password) {
		this.loginTool.setPassword(password);
	}

}
