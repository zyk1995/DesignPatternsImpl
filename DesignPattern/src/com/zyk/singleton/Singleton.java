package com.zyk.singleton;

/*
 * 单例模式： 一般一个类能否做成单例，最容易区别的地方就在于，
 *       这些类，在应用中如果有两个或者两个以上的实例会引起错误，又或者我换句话说，就是这些类，
 *       在整个应用中，同一时刻，有且只能有一种状态。
 */
public class Singleton {
	private static Singleton singleton;
	
	private Singleton(){}
	
	//私有化构造方法
	public static Singleton getInstance() {
			synchronized (Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton();				
				}
			}
		
		return singleton;
	}
}
