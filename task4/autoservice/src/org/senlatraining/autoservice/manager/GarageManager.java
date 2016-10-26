package org.senlatraining.autoservice.manager;

import java.util.Arrays;

import org.senlatraining.autoservice.api.*;
import org.senlatraining.autoservice.entity.*;
import org.senlatraining.autoservice.util.*;
import org.senlatraining.autoservice.util.sort.Sort;
import org.senlatraining.autoservice.util.parsers.*;
import org.senlatraining.autoservice.util.Printer;
import org.senlatraining.autoservice.util.comparators.ComparateGaragesByStatus;

public class GarageManager implements IGarageManager, ICommonManagers {
	private final String GARAGE = "Garage ";
	private final String STATUS_FREE_MESSEGE = " is FREE";
	private final String STATUS_BUSY = "busy";
	private final String STATUS_FREE = " - free";
	private static Garage[] listOfGarages = new Garage[10];
	private Sort sort = new Sort();
	private Path path = new Path();
	private Printer printer = new Printer();
	private ArrayWorker arrayWorker = new ArrayWorker();
	private FileWorker fileOperator = new FileWorker(path.getPathForGarage());
	
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
	@Override
	public void showListOfGarages() {
		printer.printArray(listOfGarages);
	}
// -----------------------------------------------------------------
	public Garage getFreeGarage(){
		Integer position = 0;
		
		for(int i = 0; i < listOfGarages.length; i++){
			if((listOfGarages[i] != null)
			&&(!listOfGarages[i].getStatus())){
				listOfGarages[i].setStatus(true);
				position = i;
				break;
			}
		} 
		saveArray();
		return	listOfGarages[position];
	}
//------------------------------------------------------------------
	@Override
	public void showListOfFreeGarages() {
		StringBuilder s = new StringBuilder();
		
		for (int i = 0; i < listOfGarages.length; i++) {
			if ((listOfGarages[i] != null)
			&& (!listOfGarages[i].getStatus())) {
				s.append(GARAGE);
				s.append(listOfGarages[i].getNumberOfGarage());
				s.append(STATUS_FREE_MESSEGE);
				System.out.println(s.toString());
				s.setLength(0);
			}
		}
	}
//------------------------------------------------------------------
/*	public void sortListByStatus(){
		sort.sortGaragesListByStatus(arrayWorker.getListOfNotNull(listOfGarages));  //arrayWorker.getListOfNotNull(listOfGarages)
	} */
//------------------------------------------------------------------
	public Garage[] sortGaragesListByStatus(Garage[] listOfGarages){
		ComparateGaragesByStatus compareGarageByStatus = new ComparateGaragesByStatus();
		Arrays.sort(listOfGarages, compareGarageByStatus);
		System.out.println(SORT_BY_STATUS);
		
		return listOfGarages;
	}
	
//------------------------------------------------------------------
	@Override
	public void saveArray(){	
		fileOperator.pushListToFile(listOfGarages);
	}
}
