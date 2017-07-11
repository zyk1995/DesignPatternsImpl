package com.zyk.factory.method;

import java.awt.List;
import java.util.ArrayList;

public class Client {
	public static void main(String[] args) {
		Creator creator = new BuldCreator();
		Light light = creator.createLight();
		light.turnOn();
		light.turnOff();
		
		creator = new TubeCreator();
		light = creator.createLight();
		light.turnOn();
		light.turnOff();
		
	}
}
