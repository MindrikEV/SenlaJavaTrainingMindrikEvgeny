package org.senlatraining.autoservice.util;

import org.senlatraining.autoservice.frontage.Service;

public class Properties {
	private static Properties instance;
	private static Boolean addebleOfGarage = false;
	private static Boolean removebleOfGarage = false;
	private static Boolean movableOfOrder = false;
	private static Boolean removebleOfOrder = false;
	
	private Properties(){	
	}
//--------------------------------------------------------------------	
	public static Properties getInstance(){
		if (instance == null){
			instance = new Properties();
		}
		return instance;
	}
//--------------------------------------------------------------------	
	public Boolean getAddebleOfGarage(){
		return this.addebleOfGarage;
	}
//--------------------------------------------------------------------
	public Boolean getRemovebleOfGarage(){
		return this.removebleOfGarage;
	}
//--------------------------------------------------------------------	
	public Boolean getMovableOfOrder(){
		return this.movableOfOrder;
	}
//-------------------------------------------------------------------
	public Boolean getRemovebleOfOrder(){
		return this.removebleOfOrder;
	}		
//--------------------------------------------------------------------	
	public void setAddebleOfGarage(Boolean addebleOfGarage){
		this.addebleOfGarage = addebleOfGarage;
	}
//--------------------------------------------------------------------
	public void setRemovebleOfGarage(Boolean removebleOfGarage){
		this.removebleOfGarage = removebleOfGarage;
	}
//--------------------------------------------------------------------	
	public void setMovableOfOrder(Boolean movableOfOrder){
		this.movableOfOrder = movableOfOrder;
	}
//-------------------------------------------------------------------
	public void setRemovebleOfOrder(Boolean removebleOfOrder){
		this.removebleOfOrder = removebleOfOrder;
	}	
}
