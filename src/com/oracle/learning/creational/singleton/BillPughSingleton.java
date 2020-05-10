package com.oracle.learning.creational.singleton;

public class BillPughSingleton {
	private BillPughSingleton() {}
	
	
	private static class BillPughSingletonHelper {
		public static BillPughSingleton instance = new BillPughSingleton();
		
	}
	
	public static BillPughSingleton getInstance() {
		return BillPughSingletonHelper.instance;
	}
}
