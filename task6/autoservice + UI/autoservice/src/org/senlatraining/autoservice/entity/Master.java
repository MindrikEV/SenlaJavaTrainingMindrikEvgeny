package org.senlatraining.autoservice.entity;

import java.io.Serializable;

import org.senlatraining.autoservice.util.IdMaker;

public class Master implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;
	private Boolean isBusy = false;
	private String name;
	private String surName;
	private Order order;
	private IdMaker idMaker;
	
	public Master(String name,String surName){			
		this.name = name;
		this.surName = surName;
		this.id = idMaker.getIdOfMaster();
	}
//----------------------------------------------------------
	public Integer getId(){
		return this.id;
	}
//----------------------------------------------------------
	public void setId(Integer id){
		this.id = id;
	}	
//----------------------------------------------------------
	public Boolean getStatus(){
		return this.isBusy;
	}	
//----------------------------------------------------------
	public void setStatus(Boolean isBusy){
		this.isBusy = isBusy;
	}
//----------------------------------------------------------
	public String getName(){
		return this.name;
	}
//----------------------------------------------------------
	public void setName(String name){
		this.name = name;
	}
//----------------------------------------------------------
	public String getSurName(){
		return this.surName;
	}
//----------------------------------------------------------
	public void setSurName(String surName){
		this.surName = surName;
	}
//----------------------------------------------------------
	public void setOrder(Order order){
		this.order = order;
	}
//----------------------------------------------------------
	public Order getOrder(){
		return this.order;
	}
//----------------------------------------------------------
	@Override
	public String toString(){
		StringBuilder s = new StringBuilder();
		s.append(getName());
		s.append("|");
		s.append(getSurName());
		s.append("|");
		s.append(getStatus());

		return s.toString();
	}
}