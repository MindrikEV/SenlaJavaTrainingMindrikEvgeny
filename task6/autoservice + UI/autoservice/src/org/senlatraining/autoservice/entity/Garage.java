package org.senlatraining.autoservice.entity;

import java.io.Serializable;

import org.senlatraining.autoservice.util.IdMaker;

public class Garage implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;
	private Boolean isBusy = false;
	private IdMaker idMaker = new IdMaker();
	
	public Garage(){
		this.id = idMaker.getIdOfGarage();		
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
	public void setId(Integer id){							
		this.id = id;
	}
//----------------------------------------------------------------
	public Integer getId(){							
		return this.id;
	}
//----------------------------------------------------------------
	public Integer getNumberOfGarage(){							
		return this.id;
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
