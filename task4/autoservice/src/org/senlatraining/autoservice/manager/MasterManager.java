package org.senlatraining.autoservice.manager;

import org.senlatraining.autoservice.util.*;
import org.senlatraining.autoservice.util.sort.*;
import org.senlatraining.autoservice.entity.*;
import org.senlatraining.autoservice.api.*;
//import org.senlatraining.autoservice.util.parsers.*;
import org.senlatraining.autoservice.util.Printer;

public class MasterManager implements IMasterManager, ICommonManagers{  
	private final String AMOUNT_OF_MASTERS = "Amount of masters = ";
	private final String ORDER_NOT_FOUND = "Master don't have order now!";
	private static Master[] listOfMasters = new Master[10];
	private Path path = new Path();
	private Sort sort = new Sort();
	private Printer printer = new Printer();
	private ArrayWorker arrayWorker = new ArrayWorker();
	private FileWorker fileOperator = new FileWorker(path.getPathForMaster());
	
	
	@Override
	public void add(Master master){
		arrayWorker.addElement(listOfMasters, master);
		saveArray();
	}
//------------------------------------------------------------------------------
	@Override
	public void remove(Master master){
		arrayWorker.removeElement(listOfMasters, master);
		saveArray();
	}
//------------------------------------------------------------------------------	
	@Override
	public void showListOfMasters(){
		printer.printArray(listOfMasters);
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
			if((listOfMasters[i] != null)
			&&(!listOfMasters[i].getStatus())){
					listOfMasters[i].setStatus(true);
					position = i;
					break;
			}
		} 
		saveArray();
		return	listOfMasters[position];
	}
//------------------------------------------------------------------------------
	public void showOrderOfMaster(Master master){
		if (master.getOrder() != null){
			System.out.println(master.getOrder().toString());
		} else {
			printer.printMessage(ORDER_NOT_FOUND);
		}
	}
//------------------------------------------------------------------------------
	public void sortListBySurName(){
		sort.sortMastersListBySurName(listOfMasters);
		//showListOfMasters();
	}
//------------------------------------------------------------------------------	
	public void sortListByStatus(){
		sort.sortMastersListByStatus(listOfMasters);
		//showListOfMasters();
	}
//------------------------------------------------------------------------------
	@Override
	public void saveArray(){
		fileOperator.pushListToFile(listOfMasters);
	}
}
