package com.zyk.abstractFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Creator creator = new ConcreteCreator1();
		ProductA productA = creator.createProductA();
		ProductB productB = creator.createProductB();
		productA.methodA();
		productB.methodB();
		
		creator = new ConcreteCreator2();
		productA = creator.createProductA();
		productB = creator.createProductB();
		productA.methodA();
		productB.methodB();
		
	}

}
