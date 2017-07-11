package com.zyk.abstractFactory;


import com.zyk.factory.method.Light;

public class ConcreteCreator2 implements Creator {

	@Override
	public ProductA createProductA() {
		// TODO Auto-generated method stub
		return new ProductA2();
	}

	@Override
	public ProductB createProductB() {
		// TODO Auto-generated method stub
		return new ProductB2();
	}


}
