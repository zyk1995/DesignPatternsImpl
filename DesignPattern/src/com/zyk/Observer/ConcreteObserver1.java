package com.zyk.Observer;



public class ConcreteObserver1 implements Observer {

	@Override
	public void update(Observable o) {
		// TODO Auto-generated method stub
		System.out.println("�۲���1�۲쵽"+o.getClass().getSimpleName() + "�����仯");
		System.out.println("�۲���1������Ӧ");
	}

}
