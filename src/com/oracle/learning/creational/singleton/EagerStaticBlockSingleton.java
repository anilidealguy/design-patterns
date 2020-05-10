package com.oracle.learning.creational.singleton;

public class EagerStaticBlockSingleton {
	private EagerStaticBlockSingleton() throws Exception {
		throw new Exception("just a message");
	}
	private static EagerStaticBlockSingleton instance;
	
	static {
		try {
			instance = new EagerStaticBlockSingleton();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static EagerStaticBlockSingleton getInstance() {
		return instance;
	}
	
}
