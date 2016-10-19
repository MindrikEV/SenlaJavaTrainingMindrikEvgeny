package org.senlatraining.autoservice.entity;

public class Master extends Man{
	private Boolean isBusy = false;
	
	public Master(String firstname,String lastname){			// Constructor
		super(firstname, lastname);		
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
