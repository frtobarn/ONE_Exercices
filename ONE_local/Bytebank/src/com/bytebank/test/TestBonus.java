package com.bytebank.test;

import com.bytebank.model.Accountant;
import com.bytebank.model.BonusControl;
import com.bytebank.model.Gerente;
import com.bytebank.model.Official;

public class TestBonus {
	public static void main(String[] args) {
		Official official = new Accountant("Fanto", "001", 2000);
		Gerente gerente = new Gerente("Fabito", "002", 5000);
		Accountant counter = new Accountant("Mathman", "003", 4500);

		BonusControl bonusControl = new BonusControl();
		bonusControl.bonusLog(official);
		bonusControl.bonusLog(gerente);
		bonusControl.bonusLog(counter);
		
		
	}

}
