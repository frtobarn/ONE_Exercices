package com.bytebank.model;

public class SaveObject {
	Object[] objectList = new Object[10];
	int index = 0;

	public void addNewObject(Object objectToStore) {
		objectList[index] = objectToStore;
		index++;
	}

	public Object getObjectAtPos(int position) {
		return objectList[position];
	}

	public int getLenght() {
		// TODO Auto-generated method stub
		return objectList.length;
	}

}
