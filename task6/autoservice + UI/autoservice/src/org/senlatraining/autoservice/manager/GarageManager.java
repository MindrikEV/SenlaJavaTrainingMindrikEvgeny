package org.senlatraining.autoservice.manager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.senlatraining.autoservice.api.*;
import org.senlatraining.autoservice.entity.*;
import org.senlatraining.autoservice.util.*;
import org.apache.log4j.Logger;
import org.senlatraining.property.worker.ConfigWorker;

public class GarageManager implements IGarageManager, ICommonManagers, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger(GarageManager.class);
	private final String GARAGE = "Garage ";
	private final String STATUS_FREE_MESSEGE = " is FREE";
	private final String MSG_GARAGE_IS_NOT_ADDEBLE = "Sorry, but add-function is disabled for Garages!";
	private final String MSG_GARAGE_IS_NOT_REMOVEBLE = "Sorry, but remove-function is disabled for Garages!";
	private List<Garage> listOfGarages = new ArrayList<Garage>();
	private Path path = new Path();
	private FileWorker fileOperator = new FileWorker(path.getPathForGarage());
	private Properties properties;
	private Printer printer;
	
//-------------------------------------------------------------------	
	@Override
	public void add(){
		if(properties.getAddebleOfGarage()){
			try{	
				Garage garage = new Garage();
				listOfGarages.add(garage);
			} catch (Exception e){
				log.error(e.getMessage());		
			}
			saveArray();
		} else {
			printer.print(MSG_GARAGE_IS_NOT_ADDEBLE);
		}
	}
//-------------------------------------------------------------------
	@Override
	public Boolean remove(Integer number){
		Boolean flag = false;
		
		if(properties.getRemovebleOfGarage()){
			for(int i=0; i < listOfGarages.size(); i++){
				if(listOfGarages.get(i).getNumberOfGarage().equals(number)){
					listOfGarages.remove(i);
					flag = true;
				}	
			}
			saveArray();
		}
		return flag;
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
	public List<Garage> getListOfFreeGarages() {	
		List<Garage> tmp = new ArrayList<Garage>();
			
		for (int i = 0; i < listOfGarages.size(); i++) {
			if (!listOfGarages.get(i).getStatus()) {
				tmp.add(listOfGarages.get(i));
			}
		}
		return tmp;
	}
//------------------------------------------------------------------
	@Override
	public void saveArray(){	
		fileOperator.pushListToFile(listOfGarages);
	}
}
