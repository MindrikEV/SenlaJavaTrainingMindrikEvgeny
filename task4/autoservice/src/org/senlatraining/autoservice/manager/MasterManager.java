package org.senlatraining.autoservice.manager;

import org.senlatraining.autoservice.util.*;
import org.senlatraining.autoservice.util.sort.*;
import org.senlatraining.autoservice.entity.*;
import org.senlatraining.autoservice.api.*;
import org.senlatraining.autoservice.util.parsers.*;

public class MasterManager implements IMaster, ICommonEntitiesManagers{
	private final String AMOUNT_OF_MASTERS = "Amount of masters = ";
	private final String ORDER_NOT_FOUND = "Master don't have order now!";
	private final String path = "src/files/masters.txt";
	private ArrayWorker arrayWorker = new ArrayWorker();
	private FileWorker fileOperator = new FileWorker(path);
	private ParserForMasters parserForMaster = new ParserForMasters();
	private Master[] listOfMasters = new Master[5];
		
	public void add(Master master){
		arrayWorker.addElement(listOfMasters, master);
		saveArray();
	}
//------------------------------------------------------------------------------
	public void remove(Master master){
		arrayWorker.removeElement(listOfMasters, master);
		saveArray();
	}
//------------------------------------------------------------------------------	
	public void showListOfMasters(){
		arrayWorker.ShowList(listOfMasters);
	}
//------------------------------------------------------------------------------
	public void getAmountOfMasters(){
		System.out.println(AMOUNT_OF_MASTERS + arrayWorker.countOfElements(listOfMasters));
	}
//------------------------------------------------------------------------------
	public Master getFreeMaster(){
		Integer position = 0;
		
		for(int i = 0; i < listOfMasters.length; i++){
			if(listOfMasters[i] != null){
				if(listOfMasters[i].getStatus().toString() == "false"){
					listOfMasters[i].setStatus(true);
					position = i;
					break;
				}
			}
		} 
		saveArray();
		return	listOfMasters[position];
	}
//------------------------------------------------------------------------------
	public void sortListBySurName(){
		Sort sort = new Sort();
		sort.sortMastersListBySurName(listOfMasters);
	}
//------------------------------------------------------------------------------
	public void showOrderOfMaster(Master master){
		if (master.getOrder() == null){
			System.out.print(ORDER_NOT_FOUND);
		} else {
			System.out.println( master.getOrder().toString());
		}
	}
//------------------------------------------------------------------------------
	public String getPath(){
		return this.path;
	}
//------------------------------------------------------------------------------	
	public void sortListByStatus(){
		Sort sort = new Sort();
		sort.sortMastersListByStatus(listOfMasters);
	}
//------------------------------------------------------------------------------
	public void saveArray(){
		fileOperator.pushListToFile(listOfMasters);
	}
//------------------------------------------------------------------------------
	public void loadArray(){													// Read array from file
		parserForMaster.parseFromFile(fileOperator.pullFromFile());
	}
}
