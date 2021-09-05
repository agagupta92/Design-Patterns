package com.designpattern.singleton;

public class DbSingletonDemo {

	public static void main(String[] args) {
		DbSingleton instance = DbSingleton.getInstance();
		
		System.out.println(instance);
		
		
		DbSingleton anotherinstance = DbSingleton.getInstance();
		
		System.out.println(anotherinstance);
		
	}
}
