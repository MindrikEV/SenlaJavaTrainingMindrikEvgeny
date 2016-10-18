package com.autoservice.java;

public class Place {
	private Integer idOfPlace;
	private Integer counter = 0;
	private Boolean statusOfPlace = false;
	
	public Place(){
		this.idOfPlace = counter++;
	}
//---------------------------------------------------------------
	public void setStatus(Boolean statusOfPlace){
		this.statusOfPlace = statusOfPlace;
	}
//---------------------------------------------------------------
	public Boolean getStatus(){
		return this.statusOfPlace;
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
