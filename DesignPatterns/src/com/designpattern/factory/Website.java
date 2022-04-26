package com.designpattern.factory;

import java.util.*;

public abstract class Website {
	
	List<Page> pages = new ArrayList<>();
	
	
	public List<Page> getPages() {
		return pages;
	}

	public void setPages(List<Page> pages) {
		this.pages = pages;
	}

	public Website() {
		this.createWebsite();
	}
	
	protected abstract void createWebsite();

}
