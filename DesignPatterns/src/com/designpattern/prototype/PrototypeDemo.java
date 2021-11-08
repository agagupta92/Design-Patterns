package com.designpattern.prototype;

public class PrototypeDemo {
	
	public static void main(String[] args) {
		Registry registry = new Registry();
		Movie movie = (Movie) registry.createItem("Movie");
		
		movie.setTitle("Creational pattern in java ");
		
		System.out.println(movie);
		System.out.println(movie.getTitle());
		
		
		Movie anothermovie = (Movie) registry.createItem("Movie");
		
		anothermovie.setTitle("Gangs of four");	
		
		System.out.println(anothermovie);
		System.out.println(anothermovie.getTitle());
		
		
		Book book = (Book) registry.createItem("Book");
		
		System.out.println(book);
		System.out.println(book.getTitle());
		
		
		
	}

}
