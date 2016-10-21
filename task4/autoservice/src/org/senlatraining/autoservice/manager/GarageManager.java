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
	private ParserForGarages parserForGarages = new ParserForGarages();
	private Garage[] listOfGarages = new Garage[10];
	private Garage garage;

	public void add(Garage garage) {
		arrayWorker.addElement(listOfGarages, garage);
	}
// ----------------------------------------------------------
	public void remove(Garage garage) {
		arrayWorker.removeElement(listOfGarages, garage);
	}
// ----------------------------------------------------------
	public void showListOfGarages() {
		arrayWorker.ShowList(listOfGarages);
	}
// ----------------------------------------------------------
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
//-----------------------------------------------------------
	public void sortListByStatus(){
		Sort sort = new Sort();
		sort.sortGaragesListByStatus(listOfGarages);
	}
//------------------------------------------------------------------
	public String getPath(){
		return this.path;
	}
//------------------------------------------------------------------
	public void saveArray(){										// Save array to file
		fileOperator.pushListToFile(listOfGarages);
	}
//------------------------------------------------------------------
	public void loadArray(){										// Read array from file
		parserForGarages.parseFromFile(fileOperator.pullFromFile());
	}
//-----------------------------------------------------------
}
