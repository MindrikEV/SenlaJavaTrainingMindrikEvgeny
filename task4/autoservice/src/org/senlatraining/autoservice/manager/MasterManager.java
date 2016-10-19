package org.senlatraining.autoservice.manager;

import org.senlatraining.autoservice.util.*;
import org.senlatraining.autoservice.entity.*;

public class MasterManager {
	private final String path = "src/files/masters.txt";
	private ArrayWorker arrayWorker = new ArrayWorker();
	private FileWorker fileOperator = new FileWorker(path);
	private Master[] listOfMasters = new Master[5];
		
	public void add(Master master){
		arrayWorker.addElement(listOfMasters, master);
	}
//------------------------------------------------------------------------------
	public void remove(Master master){
		arrayWorker.removeElement(listOfMasters, master);
	}
//------------------------------------------------------------------------------	
	public void showListOfMasters(){
		arrayWorker.ShowList(listOfMasters);
	}
//------------------------------------------------------------------------------
	public void getAmountOfMasters(){
		System.out.println(arrayWorker.countOfElements(this.listOfMasters));
	}
//------------------------------------------------------------------------------
	public void saveArray(){
		fileOperator.pushListToFile(listOfMasters);
	}
//------------------------------------------------------------------------------
/*	public void loadArray(){
		fileOperator.pullFromFile(listOfMasters);
	}*/
}
