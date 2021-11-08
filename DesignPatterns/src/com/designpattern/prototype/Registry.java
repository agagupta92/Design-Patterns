package com.designpattern.prototype;

import java.util.*;

public class Registry {

	private Map<String,Item> items = new LinkedHashMap<String,Item>();
	
	public Registry() {
		loadItems();
	}
	
	
	public Item createItem(String type) {
		Item item = null;
		
		try {
			item = (Item)(items.get(type)).clone();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return item;
	}
	
	private void loadItems() {
		Movie movie = new Movie();
		movie.setTitle("Basic movie");
		movie.setPrice(24.99);
		movie.setRuntime("2 hours");
		items.put("Movie",movie);
		
		Book book = new Book();
		book.setNumberOfPages(335);
		book.setPrice(19.99);
		book.setTitle("Basic book");
		items.put("Book",book);
		
		
	}
}
