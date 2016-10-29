package org.senlatraining.autoservice.manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.senlatraining.autoservice.api.*;
import org.senlatraining.autoservice.entity.*;
import org.senlatraining.autoservice.util.*;

public class GarageManager implements IGarageManager, ICommonManagers {
	private final String GARAGE = "Garage ";
	private final String STATUS_FREE_MESSEGE = " is FREE";
	//private static Garage[] listOfGarages = new Garage[10];
	List<Garage> listOfGarages = new ArrayList<Garage>();
	private Path path = new Path();
	private Printer printer = new Printer();
	private ArrayWorker arrayWorker = new ArrayWorker();
	private FileWorker fileOperator = new FileWorker(path.getPathForGarage());
	
	@Override
	public void add(Garage garage) {
		//arrayWorker.addElement(listOfGarages, garage);
		listOfGarages.add(garage);
		//saveArray();
	}
// -----------------------------------------------------------------
	@Override
	public void remove(Garage garage) {
		//arrayWorker.removeElement(listOfGarages, garage);
		//listOfGarages.remo
		//saveArray();
	}
// -----------------------------------------------------------------
	@Override
	public void showListOfGarages() {
		printer.printList(listOfGarages);
	}
// -----------------------------------------------------------------
	@Override
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
	@Override
	public void saveArray(){	
		fileOperator.pushListToFile(listOfGarages);
	}
}
