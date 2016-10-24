package org.senlatraining.autoservice.manager;

import org.senlatraining.autoservice.api.*;
import org.senlatraining.autoservice.entity.*;
import org.senlatraining.autoservice.util.*;
import org.senlatraining.autoservice.util.sort.Sort;
import org.senlatraining.autoservice.util.parsers.*;

public class GarageManager implements IGarage, ICommonEntitiesManagers{
	private final String GARAGE = "Garage ";
	private final String STATUS_MESSEGE = " status is ";
	private final String STATUS_TRUE = "busy";
	private final String STATUS_FALSE = "free";
	private final String path = "src/files/garages.txt";
	
	private ArrayWorker arrayWorker = new ArrayWorker();
	private FileWorker fileOperator = new FileWorker(path);
	private Garage[] listOfGarages = new Garage[10];
	//private Garage garage;
	
	@Override
	public void add(Garage garage) {
		arrayWorker.addElement(listOfGarages, garage);
		saveArray();
	}
// -----------------------------------------------------------------
	@Override
	public void remove(Garage garage) {
		arrayWorker.removeElement(listOfGarages, garage);
		saveArray();
	}
// -----------------------------------------------------------------
	public void showListOfGarages() {
		arrayWorker.ShowList(listOfGarages);
	}
// -----------------------------------------------------------------
	public Garage getFreeGarage(){
		Integer position = 0;
		
		for(int i = 0; i < listOfGarages.length; i++){
			if(listOfGarages[i] != null){
				if(listOfGarages[i].getStatus().toString() == "false"){
					listOfGarages[i].setStatus(true);
					position = i;
					break;
				}
			}
		} 
		saveArray();
		return	listOfGarages[position];
	}
//------------------------------------------------------------------
	public void showListOfFreeGarages() {
		StringBuilder s = new StringBuilder();
		
		for (int i = 0; i < listOfGarages.length; i++) {
			if (listOfGarages[i] != null) {
				if (listOfGarages[i].getStatus() == false) {
					s.append(GARAGE);
					s.append(listOfGarages[i].getIdOfGarage());
					s.append(STATUS_MESSEGE);
					s.append(listOfGarages[i].getStatus());
					System.out.println(s.toString());
					s.setLength(0);
				}
			} else {
				continue;
			}
		}
	}
//------------------------------------------------------------------
	public void sortListByStatus(){
		Sort sort = new Sort();
		sort.sortGaragesListByStatus(listOfGarages);
	}
//------------------------------------------------------------------
	public void saveArray(){	
		@Override
		fileOperator.pushListToFile(listOfGarages);
	}
}
