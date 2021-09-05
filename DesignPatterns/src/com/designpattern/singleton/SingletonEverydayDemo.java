package com.designpattern.singleton;

public class SingletonEverydayDemo {
	
	public static void main(String[] args) {
		
		Runtime runtime = Runtime.getRuntime();
		
		runtime.gc();
		
		System.out.println(runtime);
		
		Runtime anotherruntime = Runtime.getRuntime();
		
		System.out.println(anotherruntime);
		
		
		if(runtime == anotherruntime) {
			System.out.println("They are same instance");
		}
	}

}
