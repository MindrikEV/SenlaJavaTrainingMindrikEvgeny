package org.senlatraining.autoservice.util;

public class Path {
	private String pathForMaster = "src/files/masters.txt";
	private String pathForGarage = "src/files/garages.txt";
	private String pathForOrder  = "src/files/orders.txt";
	
//---------------------------------------------------------------	
	public void setPathForMaster(String pathForMaster){
		this.pathForMaster = pathForMaster;
	}
//---------------------------------------------------------------
	public String getPathForMaster(){
		return this.pathForMaster;
	}
//---------------------------------------------------------------		
	public void setPathForGarage(String pathForGarage){
		this.pathForGarage = pathForGarage;
	}
//---------------------------------------------------------------
	public String getPathForGarage(){
		return this.pathForGarage;
	}
//---------------------------------------------------------------	
	public void setPathForOrder(String pathForOrder){
		this.pathForOrder = pathForOrder;
	}
//---------------------------------------------------------------
	public String getPathForOrder(){
		return this.pathForOrder;
	}
}
