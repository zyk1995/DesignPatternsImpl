package com.zyk.abstractFactory;


public class ConcreteCreator1 implements Creator {

	@Override
	public ProductA createProductA() {
		// TODO Auto-generated method stub
		return new ProductA1();
	}

	@Override
	public ProductB createProductB() {
		// TODO Auto-generated method stub
		return new ProductB1();
	}



}
