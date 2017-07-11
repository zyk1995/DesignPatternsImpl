package com.zyk.factory.method;

public class TubeCreator implements Creator {

	@Override
	public Light createLight() {
		// TODO Auto-generated method stub
		return new TubeLight();
	}

}
