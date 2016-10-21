package org.senlatraining.autoservice.manager;

import org.senlatraining.autoservice.util.*;
import org.senlatraining.autoservice.util.sort.*;
import org.senlatraining.autoservice.entity.*;
import org.senlatraining.autoservice.api.*;
import org.senlatraining.autoservice.util.parsers.*;

public class MasterManager implements IMaster, ICommonEntitiesManagers{
	private final String AMOUNT_OF_MASTERS = "Amount of masters = ";
	private final String path = "src/files/masters.txt";
	private ArrayWorker arrayWorker = new ArrayWorker();
	private FileWorker fileOperator = new FileWorker(path);
	private ParserForMasters parserForMaster = new ParserForMasters();
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
		System.out.println(AMOUNT_OF_MASTERS + arrayWorker.countOfElements(listOfMasters));
	}
//------------------------------------------------------------------------------
	public void sortListBySurName(){
		Sort sort = new Sort();
		sort.sortMastersListBySurName(listOfMasters);
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
