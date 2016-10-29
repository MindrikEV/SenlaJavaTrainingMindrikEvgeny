package org.senlatraining.autoservice.entity;

public class Garage {
	private Integer numberOfGarage;
	private static Integer counter = 0;
	private Boolean isBusy = false;
	
	public Garage(){
		this.numberOfGarage = ++this.counter;		
	}
//----------------------------------------------------------------
	public void setStatus(Boolean isBusy){									
		this.isBusy = isBusy;
	}
//----------------------------------------------------------------
	public Boolean getStatus(){									
		return this.isBusy;
	}
//----------------------------------------------------------------
	public void setNumberOfGarage(Integer numberOfGarage){							
		this.numberOfGarage = numberOfGarage;
	}
//----------------------------------------------------------------
	public Integer getNumberOfGarage(){							
		return this.numberOfGarage;
	}
//----------------------------------------------------------------
	@Override
	public String toString(){
		StringBuilder s = new StringBuilder();	
		s.append(getNumberOfGarage());
		s.append("|");
		s.append(getStatus());
		
		return s.toString();
	}
}
