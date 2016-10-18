package com.autoservice.java;

public class Place {
	private Integer idOfPlace;
	private Integer counter = 0;
	private Boolean isBusy = false;
	
	public Place(){
		this.idOfPlace = this.counter++;
	}
//---------------------------------------------------------------
	public void setStatus(Boolean isBusy){
		this.isBusy = isBusy;
	}
//---------------------------------------------------------------
	public Boolean getStatus(){
		return this.isBusy;
	}
//---------------------------------------------------------------
	public Integer getId(){
		return this.idOfPlace;
	}
//---------------------------------------------------------------
	@Override
	public String toString(){
		StringBuilder s = new StringBuilder();
		
		s.append(getId());
		s.append(" ");
		s.append(getStatus());

		return s.toString();
	}
}
