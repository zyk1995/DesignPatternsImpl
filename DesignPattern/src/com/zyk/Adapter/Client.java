package com.zyk.Adapter;

public class Client {

	public static void main(String[] args) {
		//ʹ����ͨ������
		Target concreteTarget = new ConcreteTarget();
		concreteTarget.request();
		
		//ʹ�����⹦���࣬��������
		Target adapter = new ClassAdapter();
		adapter.request();
		
		adapter = new ObjectAdapter(new Adaptee());
		adapter.request();
	}

}
