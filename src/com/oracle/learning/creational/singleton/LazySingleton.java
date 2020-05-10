package com.oracle.learning.creational.singleton;

public class LazySingleton {
	private LazySingleton() {}
	
	private static LazySingleton instance;
	
	public static LazySingleton getInstance() {
		
		Object o = new Object();
		synchronized (o) {
			if (instance == null)
				instance = new LazySingleton();
		}
		
		
		return instance;
	}
	
	public void doSomething() {
		Object o = new Object();
		synchronized (this) {
			//using code
		}
		
	}
}
