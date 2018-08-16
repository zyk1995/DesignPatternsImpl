package com.zyk.observer;


/*
 * 观察者接口
 * 这个接口是为了提供一个统一的观察者做出相应行为的方法
 * JDK中有现成的观察者接口
 */
public interface Observer {
	void update(Observable o);
}	
