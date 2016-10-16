package com.autoservice.java;
/**
 * This class operate with Masters
 */
public class MasterWorker{
	private Master[] listOfMasters = new Master[10];
	private final String path = "Masters.txt";
	private FileOperator fileOperator = new FileOperator(path);
	
	public void add(Master master){
		ArrayWorker.addElement(listOfMasters, master);
	}
//------------------------------------------------------------------------------
	public void remove(Master master){
		ArrayWorker.removeElement(listOfMasters, master);
	}
//------------------------------------------------------------------------------	
	public void show(){
		for(int i=0; i < this.listOfMasters.length; i++){
			if(listOfMasters[i] != null){
			System.out.println(listOfMasters[i]);
			} else {
				continue;
			}
		}
	}
//------------------------------------------------------------------------------
	public void getAmount(){
		System.out.println(ArrayWorker.countOfElements(this.listOfMasters));
	}
//------------------------------------------------------------------------------
	public void pushListToFile(){
		String[] listMasters;
		for(int i = 0; i < this.listOfMasters.length; i++){
			//listOfMasters.getStatus;
		}
		
		fileOperator.pushToFile(listMasters);		
	}
}
