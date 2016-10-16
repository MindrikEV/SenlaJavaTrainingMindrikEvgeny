package com.autoservice.java;
/**
 * This class operate with Masters
 */

public class MasterWorker implements Operation{
	private Master[] listOfMasters = new Master[10];	
	
	public void add(Master master){
		ArrayWorker.addElement(listOfMasters, master);
	}
//------------------------------------------------------------------------------
	public void remove(Master master){
		ArrayWorker.removeElement(listOfMasters, master);
	}
//------------------------------------------------------------------------------	
	public void show(){
		
	}
}
