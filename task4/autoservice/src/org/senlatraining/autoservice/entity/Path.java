package org.senlatraining.autoservice.entity;

public class Path {
	private String pathForMaster = "src/files/masters.txt";
	private String pathForGarage = "src/files/garages.txt";
	private String pathForOrder  = "src/files/orders.txt";
	
	public String getPathForMaster(){
		return this.pathForMaster;
	}
//---------------------------------------------------------------	
	public void setPathForMaster(String pathForMaster){
		this.pathForMaster = pathForMaster;
	}
//---------------------------------------------------------------	
	public String getPathForGarage(){
		return this.pathForGarage;
	}
//---------------------------------------------------------------	
	public void setPathForGarage(String pathForGarage){
		this.pathForGarage = pathForGarage;
	}
//---------------------------------------------------------------
	public String getPathForOrder(){
		return this.pathForOrder;
	}
//---------------------------------------------------------------	
	public void setPathForOrder(String pathForOrder){
		this.pathForOrder = pathForOrder;
	}
}
