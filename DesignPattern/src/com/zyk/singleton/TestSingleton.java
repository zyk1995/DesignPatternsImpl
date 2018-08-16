package com.zyk.singleton;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestSingleton {
	boolean lock;

	public boolean isLock() {
		return lock;
	}

	public void setLock(boolean lock) {
		this.lock = lock;
	}
	
    public static void main(String[] args) throws InterruptedException {
		final Set<String> instanceSet = Collections.synchronizedSet(new HashSet<String>());
		final TestSingleton lock = new TestSingleton();
		lock.setLock(true);
		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++) {
			executorService.execute(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					while(true) {
						if(lock.isLock()) {
							Singleton singleton = Singleton.getInstance();
							instanceSet.add(singleton.toString());
							break;
						}
					}
				}
			});
		}
		
		Thread.sleep(5000);
		lock.setLock(false);
		Thread.sleep(5000);
		System.out.println("-------并发情况下我们取到的实例---------");
		for (String instance : instanceSet) {
			System.out.println(instance);
		}
		executorService.shutdown();
	}
}
