package com.zyk.factory;
/*
 * 简单工厂模式
 * 由一个工厂对象决定创建出哪一种产品类的实例
 */
public class Creator {
	
	private Creator() {
			// TODO Auto-generated constructor stub
	}
	
	public static IProduct createProduct(String productName) {
		if(productName == null) {
			return null;
		}
		
		if(productName.equals("A")) {
			return new ProductA();
		}else if(productName.equals("B")){
			return new ProductB();
		}else{
			return null;
		}
		
		
	}
}
