package com.bytebank.test;

import com.bytebank.model.Admin;
import com.bytebank.model.Gerente;
import com.bytebank.model.SystemControl;

public class TestSystem {

	public static void main(String[] args) {
		SystemControl systemTest = new SystemControl();
		Gerente gerente1 = new Gerente();
		Admin admin1 = new Admin();
		
		systemTest.auth(gerente1);
		systemTest.auth(admin1);
	}

}
