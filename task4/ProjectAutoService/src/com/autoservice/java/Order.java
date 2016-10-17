package com.autoservice.java;


public class Order {
	private Integer idOfOrder = 0;
	private Double price;
	//private Date nowTime;
	private String description;
	
	public Order(String description, Double price){
		this.description = description;
		this.price = price;
		this.idOfOrder++;
	}
//-----------------------------------------------------------------
	
}
