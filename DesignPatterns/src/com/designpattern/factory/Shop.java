package com.designpattern.factory;

public class Shop extends Website {

	@Override
	protected void createWebsite() {
		pages.add(new CartPage());
		pages.add(new SerachPage());
		pages.add(new ContactPage());
	}
}
