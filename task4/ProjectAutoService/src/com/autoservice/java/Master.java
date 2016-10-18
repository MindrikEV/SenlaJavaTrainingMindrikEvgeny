package com.autoservice.java;

public class Master extends Man{
	private Boolean statusOfMaster = false;
	
	public Master(String firstname,String lastname){			// Constructor
		super(firstname, lastname);		
	}
//----------------------------------------------------------
	public Boolean getStatus(){
		return this.statusOfMaster;
	}
//----------------------------------------------------------
	public void setStatus(Boolean status){
		this.statusOfMaster = status;
	}
//----------------------------------------------------------
	@Override
	public String toString(){
		StringBuilder s = new StringBuilder();
		
		s.append(getFirstname());
		s.append(" ");
		s.append(getLastname());
		s.append(" ");
		s.append(getStatus());

		return s.toString();
	}
//----------------------------------------------------------
}
