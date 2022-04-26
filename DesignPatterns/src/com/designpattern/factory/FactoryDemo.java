package com.designpattern.factory;

public class FactoryDemo {
	
	public static void main(String[] args) {
		
		Website website = WebsiteFactory.getWebsite("blog");
		
		System.out.println(website.getPages());
		
		Website website1 = WebsiteFactory.getWebsite("shop");
		
		System.out.println(website1.getPages());
	}

}
