package com.bytebank.model;

public class BonusControl {
	private double bonusResume;
 
	public double bonusLog(Official official) {
		this.bonusResume += official.getBonus();
		System.out.println(this.bonusResume);
		return this.bonusResume;
	}
	public double bonusLog(Gerente gerente) {
		this.bonusResume += gerente.getBonus();
		System.out.println(this.bonusResume);
		return this.bonusResume;
	}

	public double bonusLog(Accountant counter) {
		this.bonusResume += counter.getBonus();
		System.out.println(this.bonusResume);
		return this.bonusResume;
	}
}
