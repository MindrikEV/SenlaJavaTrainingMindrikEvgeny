package com.autoservice.java;


public class Order {
	private Integer idOfOrder;
	private Integer counter = 0;
	private Double price;
	//private Date nowTime;
	private String description;
	
	public Order(String description, Double price){
		this.description = description;
		this.price = price;
		this.idOfOrder = this.counter++;
	}
//-----------------------------------------------------------------
	public void setPrice(Double price){
		this.price = price;
	}
//-----------------------------------------------------------------
	public Double getPrice(){
		return this.price;
	}
//-----------------------------------------------------------------
	public void setDescription(String description){
		this.description = description;
	}
//-----------------------------------------------------------------
	public String getDescription(){
		return this.description;
	}
//-----------------------------------------------------------------
	public Integer getId(){
		return idOfOrder;
	}
}
