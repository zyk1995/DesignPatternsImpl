package com.zyk.observer;

import java.util.ArrayList;
import java.util.List;

//被观察者类
public class Observable {
	//被观察者列表
	List<Observer> observers = new ArrayList<Observer>();
	
	public void addObserver(Observer o){
		observers.add(o);
	}
	
	public void changed(){
		System.out.println("我是被观察者，我已经发生变化了");
		notifyObservers();//通知观察自己的所以观察者
	}

	private void notifyObservers() {
		for(Observer observer:observers) {
			observer.update(this);
		}
	}
	
	
	
	
}
