package org.senlatraining.autoservice.entity;

import org.senlatraining.autoservice.util.IdMaker;

public class Garage {
	private Integer numberOfGarage;
	private Boolean isBusy = false;
	private IdMaker idMaker = new IdMaker();
	
	public Garage(){
		this.numberOfGarage = idMaker.getNumber();		
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
