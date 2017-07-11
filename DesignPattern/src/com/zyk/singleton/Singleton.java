package com.zyk.singleton;

/*
 * ����ģʽ�� һ��һ�����ܷ����ɵ���������������ĵط������ڣ�
 *       ��Щ�࣬��Ӧ������������������������ϵ�ʵ������������ֻ����һ��仰˵��������Щ�࣬
 *       ������Ӧ���У�ͬһʱ�̣�����ֻ����һ��״̬��
 */
public class Singleton {
	private static Singleton singleton;
	
	private Singleton(){}
	
	//˽�л����췽��
	public static Singleton getInstance() {
			synchronized (Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton();				
				}
			}
		
		return singleton;
	}
}
