package com.designpattern.builder;

public class LunchOrderBeanTeleScopingConstructor {

	private String bread;
	
	private String condiments;
	
	private String dressing;
	
	private String meat;

	public LunchOrderBeanTeleScopingConstructor(String bread) {
		this.bread = bread;
	}
	
	public LunchOrderBeanTeleScopingConstructor(String bread,String condiments) {
		this(bread);
		this.condiments = condiments;
	}
	
	public LunchOrderBeanTeleScopingConstructor(String bread,String condiments,String dressing) {
		this(bread,condiments);
		this.dressing = dressing;
	}
	
	public LunchOrderBeanTeleScopingConstructor(String bread,String condiments,String dressing,String meat) {
		this(bread,condiments,dressing);
		this.meat = meat;
	}
	
	public String getBread() {
		return bread;
	}

	public String getCondiments() {
		return condiments;
	}

	public String getDressing() {
		return dressing;
	}

	public String getMeat() {
		return meat;
	}


}
