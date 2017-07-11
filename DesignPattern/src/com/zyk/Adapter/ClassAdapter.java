package com.zyk.Adapter;

/*
 * 类适配器
 * 适配器类，继承了被适配类，同时实现标准接口
 */
public class ClassAdapter extends Adaptee implements Target {

	@Override
	public void request() {
		// TODO Auto-generated method stub
		super.specificRequest();
	}

}
