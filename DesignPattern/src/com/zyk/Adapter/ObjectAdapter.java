package com.zyk.Adapter;


/*
 * ����������
 * �������ֱ࣬�ӹ������������࣬ͬʱʵ�ֱ�׼�ӿ�
 */
public class ObjectAdapter implements Target{
	//ֱ�ӹ�������������
	private Adaptee adaptee;
	
	//����ͨ�����캯�����������Ҫ����ı������������
	public ObjectAdapter (Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	
	public void request() {
		//������ʹ��ί�еķ�ʽ������⹦��
		this.adaptee.specificRequest();
	}
}
