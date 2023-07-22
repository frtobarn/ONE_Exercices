package com.bytebank.test;

import com.bytebank.model.Account;
import com.bytebank.model.NormalAccount;
import com.bytebank.model.SaveObject;
import com.bytebank.model.SavingsAccount;

public class TestSaveObject {

	public static void main(String[] args) {
		SaveObject objectList = new SaveObject();

		Account normalAccount = new NormalAccount(10, 25);
		Account savingsAccount = new SavingsAccount(11, 22);

		objectList.addNewObject(normalAccount);
		objectList.addNewObject(savingsAccount);
		objectList.addNewObject(1);

		for (int i = 0; i < objectList.getLenght(); i++) {
			System.out.println(objectList.getObjectAtPos(i));
		}
	}

}
