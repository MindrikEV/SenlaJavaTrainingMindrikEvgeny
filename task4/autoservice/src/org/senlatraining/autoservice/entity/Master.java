package org.senlatraining.autoservice.entity;

public class Master{
	private Boolean isBusy = false;
	private String name;
	private String surName;
	
	public Master(String name,String surName){			// Constructor
		this.name = name;
		this.surName = surName;
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
	@Override
	public String toString(){
		StringBuilder s = new StringBuilder();
		
		s.append(getSurName());
		s.append(" ");
		s.append(getName());
		s.append(" ");
		s.append(getStatus());

		return s.toString();
	}
}