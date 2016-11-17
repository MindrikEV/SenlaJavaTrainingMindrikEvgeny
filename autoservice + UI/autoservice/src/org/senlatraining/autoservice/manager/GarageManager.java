package org.senlatraining.autoservice.manager;

import java.util.ArrayList;
import java.util.List;
import org.senlatraining.autoservice.api.*;
import org.senlatraining.autoservice.entity.*;
import org.senlatraining.autoservice.util.*;
import org.apache.log4j.Logger;

public class GarageManager implements IGarageManager, ICommonManagers {
	private final String GARAGE = "Garage ";
	private final String STATUS_FREE_MESSEGE = " is FREE";
	private static final Logger log = Logger.getLogger(GarageManager.class);
	private List<Garage> listOfGarages = new ArrayList<Garage>();
	private Path path = new Path();
	private Printer printer = new Printer();
	private FileWorker fileOperator = new FileWorker(path.getPathForGarage());
	
	@Override
	public void add(){
		try{	
			Garage garage = new Garage();
			listOfGarages.add(garage);
		} catch (NullPointerException e){
			//throw e.getMessage();
			log.error(e.getMessage());		}
		saveArray();
	}
// -----------------------------------------------------------------
	@Override
	public void remove(Integer number){ // throws Exception 
		//try{
			for(int i=0; i < listOfGarages.size(); i++){
				if (listOfGarages.get(i).getNumberOfGarage() == number){
					listOfGarages.remove(i);
				}	
			}	
		//} catch (NullPointerException e){
		//	throw new Exception(e.getMessage());
		//}
		saveArray();
		//log.error("Hueston we have problem!");
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
		
		position = listOfGarages.indexOf(false);
		listOfGarages.get(position).setStatus(true);

		saveArray();
		return	listOfGarages.get(position);
	}
//------------------------------------------------------------------
	@Override
	public List getListOfFreeGarages() {
		List tmp = new ArrayList();
			
		for (int i = 0; i < listOfGarages.size(); i++) {
			if (!listOfGarages.get(i).getStatus()) {
				tmp.add(listOfGarages.get(i));
			}
		}
		return tmp;
	}

//------------------------------------------------------------------
	@Override
	public void showListOfFreeGarages() {
		StringBuilder s = new StringBuilder();
		
		for (int i = 0; i < listOfGarages.size(); i++) {
			if (!listOfGarages.get(i).getStatus()) {
				s.append(GARAGE);
				s.append(listOfGarages.get(i).getNumberOfGarage());
				s.append(STATUS_FREE_MESSEGE);
				printer.print(s.toString());
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
