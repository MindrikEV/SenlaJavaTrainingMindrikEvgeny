package org.senlatraining.autoservice.manager;

import org.senlatraining.autoservice.util.*;
import org.senlatraining.autoservice.util.sort.*;
import org.senlatraining.autoservice.entity.*;
import org.senlatraining.autoservice.api.*;
import org.senlatraining.autoservice.util.parsers.*;

public class MasterManager implements IMaster{ // , ICommonEntitiesManagers
	private final String AMOUNT_OF_MASTERS = "Amount of masters = ";
	private final String ORDER_NOT_FOUND = "Master don't have order now!";
	private ArrayWorker arrayWorker = new ArrayWorker();
	private Path path = new Path();
	private FileWorker fileOperator = new FileWorker(path.getPathForMaster());
	//private ParserForMasters parserForMaster = new ParserForMasters();
	private Master[] listOfMasters = new Master[5];
	
	//@Override
	public void add(Master master){
		arrayWorker.addElement(listOfMasters, master);
		saveArray();
	}
//------------------------------------------------------------------------------
	//@Override
	public void remove(Master master){
		arrayWorker.removeElement(listOfMasters, master);
		saveArray();
	}
//------------------------------------------------------------------------------	
	@Override
	public void showListOfMasters(){
		arrayWorker.ShowList(listOfMasters);
	}
//------------------------------------------------------------------------------
	@Override
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
	public void showOrderOfMaster(Master master){
		if (master.getOrder() == null){
			System.out.print(ORDER_NOT_FOUND);
		} else {
			System.out.println(master.getOrder().toString());
		}
	}
//------------------------------------------------------------------------------
	public void sortListBySurName(){
		Sort sort = new Sort();
		sort.sortMastersListBySurName(listOfMasters);
	}
//------------------------------------------------------------------------------	
	public void sortListByStatus(){
		Sort sort = new Sort();
		sort.sortMastersListByStatus(listOfMasters);
	}
//------------------------------------------------------------------------------
	//@Override
	public void saveArray(){
		fileOperator.pushListToFile(listOfMasters);
	}
}
