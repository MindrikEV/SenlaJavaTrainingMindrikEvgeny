package org.senlatraining.autoservice.entity;

import java.util.Calendar;

public class Order {
	private static Integer counter = 0;
	private Integer idOfOrder;
	private Double price;
	private String description;
	private String status;
	//private Date dateOfRegistration;
	
	public Order(String description, Double price){
		this.description = description;
		this.price = price;
		this.idOfOrder = ++this.counter;
		this.status = "active";
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
//-----------------------------------------------------------------
	public void setStatus(String status){
		this.status = status;
	}
//-----------------------------------------------------------------
	public String getStatus(){
		return this.status;
	}
//-----------------------------------------------------------------
	@Override
	public String toString(){
		StringBuilder s = new StringBuilder();
		s.append(getDescription());
		s.append("|");
		s.append(getPrice());
		s.append("|");
		s.append(getStatus());

		return s.toString();
	}
}
