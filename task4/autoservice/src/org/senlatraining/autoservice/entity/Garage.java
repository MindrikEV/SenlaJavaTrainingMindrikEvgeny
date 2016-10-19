package org.senlatraining.autoservice.entity;

public class Garage {
	private Integer idOfGarage;
	private static Integer counter = 0;
	private Boolean isBusy = false;
	
	public Garage(){
		this.idOfGarage = ++this.counter;		
	}
//----------------------------------------------------------------
	public Boolean getStatus(){									
		return this.isBusy;
	}
//----------------------------------------------------------------
	public void setStatus(Boolean isBusy){									
		this.isBusy = isBusy;
	}
//----------------------------------------------------------------
	public Integer getIdOfGarage(){							
		return this.idOfGarage;
	}
//----------------------------------------------------------------
	@Override
	public String toString(){
		StringBuilder s = new StringBuilder();
			
		s.append(getIdOfGarage());
		s.append(" ");
		s.append(getStatus());

		return s.toString();
	}
}
