package org.senlatraining.autoservice.manager;

import org.senlatraining.autoservice.util.*;
import org.senlatraining.autoservice.entity.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
import org.apache.log4j.Logger;
import org.senlatraining.autoservice.api.*;
import org.senlatraining.autoservice.util.Printer;
import org.senlatraining.autoservice.util.comparators.*;

public class MasterManager implements IMasterManager, ICommonManagers{  
	private final String ORDER_NOT_FOUND = "Master don't have order now!";
	private static final Logger log = Logger.getLogger(MasterManager.class);
	private List<Master> listOfMasters = new ArrayList<Master>();
	private Path path = new Path();
	private Printer printer = new Printer();
	private FileWorker fileOperator = new FileWorker(path.getPathForMaster());
		
	@Override
	public void add(String name, String surName){
		Master master = new Master(name, surName);
		listOfMasters.add(master);
		saveArray();
	}
//------------------------------------------------------------------------------
	@Override
	public void remove(Master master){
		listOfMasters.remove(listOfMasters.indexOf(master));
		saveArray();
	}
//------------------------------------------------------------------------------	
	@Override
	public List<Master> getListOfMasters(){
		return listOfMasters;	
	}	
//------------------------------------------------------------------------------
	@Override
	public Master getFreeMaster(){
		Integer position = 0;
		position = listOfMasters.indexOf(false);
		listOfMasters.get(position).setStatus(true);
		
		saveArray();
		return	listOfMasters.get(position);
	}
//------------------------------------------------------------------------------
	@Override
	public void showOrderOfMaster(Master master){
		if (master.getOrder() != null){
			printer.print(master.getOrder().toString());
		} else {
			printer.print(ORDER_NOT_FOUND);
		}
	}
//------------------------------------------------------------------------------
	@Override
	public void sort(List<Master> listOfMasters, Comparator comparator){
		Collections.sort(listOfMasters, comparator);	
		printer.printList(listOfMasters);
	}
//------------------------------------------------------------------------------
	@Override
	public void saveArray(){
		fileOperator.pushListToFile(listOfMasters);
	}
}
