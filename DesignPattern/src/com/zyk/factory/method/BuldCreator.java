package com.zyk.factory.method;

public class BuldCreator implements Creator {

	@Override
	public Light createLight() {
		// TODO Auto-generated method stub
		return new BuldLight();
	}

}
