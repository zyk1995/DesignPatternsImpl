package com.zyk.adapter;


/*
 * 对象适配器
 * 适配器类，直接关联被适配器类，同时实现标准接口
 */
public class ObjectAdapter implements Target{
	//直接关联被适配器类
	private Adaptee adaptee;
	
	//可以通过构造函数传入具体需要适配的被适配器类对象
	public ObjectAdapter (Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	
	public void request() {
		//这里是使用委托的方式完成特殊功能
		this.adaptee.specificRequest();
	}
}
