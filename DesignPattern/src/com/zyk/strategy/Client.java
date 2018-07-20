package com.zyk.strategy;

public class Client {

	public static void main(String[] args) {
		Context context = new Context();
		context.setStrategy(new ConcreteStrategyA());
		context.method();
		
		context.setStrategy(new ConcreteStrategyB());
		context.method();
		
		context.setStrategy(new ConcreteStrategyC());
		context.method();
	}

}
