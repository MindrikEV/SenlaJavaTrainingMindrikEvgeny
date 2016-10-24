package org.senlatraining.autoservice.runner;

import org.senlatraining.autoservice.entity.*;
import org.senlatraining.autoservice.manager.*;
/*
 * This class generate all objects and work with them. Emulate user-operations.  
 */
public class Stuffer {	 
	   public void stuff(){
//---------------------------------------------------------------------------------------  GARAGES  ------------------	   
		   	Garage garage1 = new Garage();
			Garage garage2 = new Garage();							
			Garage garage3 = new Garage();
			Garage garage4 = new Garage();
			Garage garage5 = new Garage();
			
			garage3.setStatus(true);								// Change status of garage(now garage is BUSY)
			
			GarageManager garageManager = new GarageManager();		
			garageManager.add(garage1);
			garageManager.add(garage2);								 
			garageManager.add(garage3);
			garageManager.add(garage4);
			garageManager.add(garage5);
			
			garageManager.showListOfGarages();
			System.out.println();
			
			garageManager.sortListByStatus();
			garageManager.showListOfFreeGarages();
			System.out.println();
//----------------------------------------------------------------------------------------- MASTERS ---------------
			Master master1 = new Master("Givi","Vartanov");
			Master master2 = new Master("Ivan","Grozny");
			Master master3 = new Master("Max","Crazy");
			Master master4 = new Master("Tom","Cruse");
			Master master5 = new Master("Elton","John");
			Master master6 = new Master("Jesie","Pinkman");
			master2.setStatus(true);
			master4.setStatus(true);
			
			MasterManager masterManager = new MasterManager();
			masterManager.add(master1);
			masterManager.add(master2);
			masterManager.add(master3);
			masterManager.add(master4);
			masterManager.add(master5);
			masterManager.add(master6);
			
			masterManager.sortListBySurName();
			masterManager.showListOfMasters();
			System.out.println();
			
			masterManager.sortListByStatus();
			masterManager.showListOfMasters();
			
			masterManager.getAmountOfMasters();
			System.out.println();
			
			masterManager.showOrderOfMaster(master1);
//------------------------------------------------------------------------------------------------ ORDERS ----------		
			Order order1 = new Order("Paint a door", 85.2, 7, "2016-10-24");
			Order order2 = new Order("Clean glasses", 25.4, 1, "2016-10-25");
			Order order3 = new Order("Change oil and filters", 65.0, 1, "2016-10-27");
			Order order4 = new Order("Change full",999.9, 14, "2016-10-24");
			Order order5 = new Order("Change wheels",120.2, 1, "2016-10-25");
			Order order6 = new Order("Repair of engine",274.9, 10, "2016-10-28");
			
			OrderManager orderManager = new OrderManager();
			orderManager.add(order1);
			orderManager.add(order2);
			orderManager.add(order3);
			orderManager.add(order4);
			orderManager.add(order5);
			orderManager.add(order6);
			
			orderManager.sortListByPrice();
			orderManager.showListOfOrders();
			System.out.println();
			
			orderManager.sortListByDateRegistration();
			orderManager.showListOfOrders();
			orderManager.showListOfExecutableOrders();
			System.out.println();
			
			orderManager.sortListByDatePlanStart();
			orderManager.showListOfOrders();
			orderManager.showListOfExecutableOrders();
			System.out.println();
			
			orderManager.sortListByDateComplete();
			orderManager.showListOfOrders();
			orderManager.showListOfExecutableOrders();
			System.out.println();
			
			
	   }
}