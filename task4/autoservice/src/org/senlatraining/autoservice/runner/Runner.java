package org.senlatraining.autoservice.runner;

import org.senlatraining.autoservice.entity.*;
import org.senlatraining.autoservice.manager.*;

public class Runner {
	public static void main(String[] args){
		
		Garage garage1 = new Garage();
		Garage garage2 = new Garage();
		Garage garage3 = new Garage();
		Garage garage4 = new Garage();
		Garage garage5 = new Garage();
		
		garage3.setStatus(true);
		
		GarageManager garageWorker = new GarageManager();
		garageWorker.add(garage1);
		garageWorker.add(garage2);
		garageWorker.add(garage3);
		garageWorker.add(garage3);
		garageWorker.add(garage4);
		
		garageWorker.showListOfFreePlaces();
		
		Master master1 = new Master("Givi","Vartanov");
		Master master2 = new Master("Ivan","Grozny");
		Master master3 = new Master("Max","Pax");
		Master master4 = new Master("Tom","Cruse");
		Master master5 = new Master("Elton","John");
		Master master6 = new Master("Jesie","Pinkman");
		
		MasterManager masterManager = new MasterManager();
		masterManager.add(master1);
		masterManager.add(master2);
		masterManager.add(master3);
		masterManager.add(master4);
		masterManager.add(master5);
		masterManager.add(master6);
		
		masterManager.showListOfMasters();				// Show list of masters
		//masterManager.getAmount();			// Show amount of masters
		masterManager.saveArray();			// Save array of masters to file
		//masterWorker.pullListFromFile();	// Load array of masters from file	
	}
}
