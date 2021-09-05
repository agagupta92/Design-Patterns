package com.designpattern.builder;

public class LunchOrderBeanDemo {

	public static void main(String[] args) {
		
		
		//Builder pattern approach
		LunchOrderBeanBuilder.Builder builder = new LunchOrderBeanBuilder.Builder();
		builder.bread("Wheat").condiments("Lettuce").dressing("Mustard").meat("Ham");
		
		LunchOrderBeanBuilder lunchOrderBean = builder.build();
		
		//TeleScopingConstructor approach
		//LunchOrderBeanTeleScopingConstructor lunchOrderBean = new LunchOrderBeanTeleScopingConstructor("Wheat","Lettuce","Mustard","Ham");
		
		//Setter approach
		//LunchOrderBeanSetter lunchOrderBean = new LunchOrderBeanSetter();
		
		/*
		 * lunchOrderBean.setBread("Wheat"); lunchOrderBean.setCondiments("Lettuce");
		 * lunchOrderBean.setDressing("Mustard"); lunchOrderBean.setMeat("Ham");
		 */
		
		
		System.out.println(lunchOrderBean.getBread());
		System.out.println(lunchOrderBean.getCondiments());
		System.out.println(lunchOrderBean.getDressing());
		System.out.println(lunchOrderBean.getMeat());
		
		
	}
}
