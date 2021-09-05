package com.designpattern.singleton;

public class DbSingleton {

	private static DbSingleton instance = null;// lazy loading

	// to protect from reflection to create one more instance of the singleton class
	// will throw the exception when instance is not null.
	private DbSingleton() {
		if (instance != null) {
			throw new RuntimeException("Use getInstance() method to create");
		}
	}

	public static DbSingleton getInstance() {
		if (instance == null) {
			synchronized (DbSingleton.class) {
				if (instance == null) {
					instance = new DbSingleton();
				}
			}
		}
		return instance;
	}
}
