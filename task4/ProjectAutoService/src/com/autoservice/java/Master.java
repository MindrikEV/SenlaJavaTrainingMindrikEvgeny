package com.autoservice.java;

public class Master extends Man{
	private Boolean status = false;
	
	public Master(String firstname,String lastname){
		super(firstname, lastname);		
	}
//----------------------------------------------------------
	public Boolean getStatus(){
		return this.status;
	}
//----------------------------------------------------------
	public void setStatus(Boolean status){
		this.status = status;
	}
//----------------------------------------------------------
	public String toString(){
		return getLastname();
	}
}
