package org.senlatraining.autoservice.util;

public class Path {
	private static String pathForMaster = "src/files/masters.txt";
	private static String pathForGarage = "src/files/garages.txt";
	private static String pathForOrder  = "src/files/orders.txt";
	private static String pathForMasterManager = "src/files/mastersManager.txt";
	private static String pathForGarageManager = "src/files/garagesManager.txt";
	private static String pathForOrderManager  = "src/files/ordersManager.txt";
	
	
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
//---------------------------------------------------------------	
	public void setPathForMasterManager(String pathForMasterManager){
		this.pathForMasterManager = pathForMasterManager;
	}
//---------------------------------------------------------------
	public String getPathForMasterManager(){
		return this.pathForMasterManager;
	}
//---------------------------------------------------------------		
	public void setPathForGarageManager(String pathForGarageManager){
		this.pathForGarage = pathForGarageManager;
	}
//---------------------------------------------------------------
	public String getPathForGarageManager(){
		return this.pathForGarageManager;
	}
//---------------------------------------------------------------	
	public void setPathForOrderManager(String pathForOrderManager){
		this.pathForOrderManager = pathForOrderManager;
	}
//---------------------------------------------------------------
	public String getPathForOrderManager(){
		return this.pathForOrderManager;
	}	
}
