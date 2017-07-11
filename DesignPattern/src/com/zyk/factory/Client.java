package com.zyk.factory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IProduct product1 = Creator.createProduct("A");
		product1.method();
		
		IProduct product2 = Creator.createProduct("B");
		product2.method();
	}

}
