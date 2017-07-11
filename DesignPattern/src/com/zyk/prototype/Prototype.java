package com.zyk.prototype;



/*
 * ���壺��ԭ��ʵ��ָ��������������࣬����ͨ��������Щԭ�ʹ����µĶ���
 * 
 * ʹ�ó�����
 * 1������Ĵ����ǳ����ӣ�����ʹ��ԭ��ģʽ��ݵĴ�������
 * 2�������й����в�֪������ľ������ͣ���ʹ��ԭ��ģʽ����һ����ͬ���͵Ķ��󣬻��������й����ж�̬�Ļ�ȡ��һ�������״̬��
 * 
 * �ŵ㣺
 * 1������clone�������������ֱ�Ӹ����ڴ��ִ�У��������ٶ��ϱ�ʹ��new�ķ�ʽ��������Ҫ�졣 
 * 2�����Ի���ԭ�ͣ����ٵĴ���һ�����󣬶�����֪��������ϸ�ڡ�
 * 3������������ʱ��̬�Ļ�ȡ����������Լ�״̬���Ӷ�����һ������
 */
public class Prototype implements Cloneable {

	private int x;
	private int y;
	private int z;
	
	public Prototype() {
		this.x = 2;
		this.y = 3;
		this.z = 4;
	}
	
	public void change() {
		this.x = 9;
		this.y = 8;
		this.z = 7;
	}
	
	public Prototype clone() {
		Object object = null;
		
		try{
			object = super.clone();
		} catch (CloneNotSupportedException exception) {
			// TODO: handle exception
			throw new RuntimeException(exception);
		}
		
		return (Prototype) object;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + x + "," + y + "," + z + "]";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prototype p1 = new Prototype();
		p1.change();
		System.out.println(p1);
		Prototype p2 = p1.clone();
		System.out.println(p2);
	}

}
