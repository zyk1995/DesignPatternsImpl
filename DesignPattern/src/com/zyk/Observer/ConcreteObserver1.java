package com.zyk.Observer;



public class ConcreteObserver1 implements Observer {

	@Override
	public void update(Observable o) {
		// TODO Auto-generated method stub
		System.out.println("观察者1观察到"+o.getClass().getSimpleName() + "发生变化");
		System.out.println("观察者1做出响应");
	}

}
