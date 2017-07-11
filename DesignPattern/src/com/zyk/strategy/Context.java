package com.zyk.strategy;

public class Context {
	Strategy strategy;
	
	public void method() {
		// TODO Auto-generated method stub
		strategy.algorithm();
	}
	
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
}
