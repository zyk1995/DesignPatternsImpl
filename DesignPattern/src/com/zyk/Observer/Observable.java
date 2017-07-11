package com.zyk.Observer;

import java.util.ArrayList;
import java.util.List;

//���۲�����
public class Observable {
	//���۲����б�
	List<Observer> observers = new ArrayList<Observer>();
	
	public void addObserver(Observer o){
		observers.add(o);
	}
	
	public void changed(){
		System.out.println("���Ǳ��۲��ߣ����Ѿ������仯��");
		notifyObservers();//֪ͨ�۲��Լ������Թ۲���
	}

	private void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer observer:observers) {
			observer.update(this);
		}
	}
	
	
	
	
}
