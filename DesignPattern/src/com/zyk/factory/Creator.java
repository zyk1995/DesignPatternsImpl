package com.zyk.factory;
/*
 * �򵥹���ģʽ
 * ��һ���������������������һ�ֲ�Ʒ���ʵ��
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
