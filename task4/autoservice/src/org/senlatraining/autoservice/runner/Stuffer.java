package org.senlatraining.autoservice.runner;

import org.senlatraining.autoservice.entity.*;
import org.senlatraining.autoservice.manager.*;
/*
 * This class generate all objects and work with them. Emulate user-operations.  
 */
public class Stuffer {	 
	   public void stuff(){
//---------------------------------------------------------------------------------------  GARAGES  ------------------	   
		   Recover recover = new Recover();
		   recover.createMastersFromFile();
		  // recover.createGaragesFromFile();
		  // recover.createOrdersFromFile();
		   
		   
			//garage3.setStatus(true);								// Change status of garage(now garage is BUSY)
			
		//	GarageManager garageManager = new GarageManager();		
		/*	garageManager.add(garage1);
			garageManager.add(garage2);								 
			garageManager.add(garage3);
			garageManager.add(garage4);
			garageManager.add(garage5); */
			
			//garageManager.showListOfGarages();
			//System.out.println();
			
			//garageManager.sortListByStatus();
			//garageManager.showListOfFreeGarages();
			//System.out.println();
//----------------------------------------------------------------------------------------- MASTERS ---------------
			//master2.setStatus(true);
			//master4.setStatus(true);
			
			MasterManager masterManager = new MasterManager();
		/*	masterManager.add(master1);
			masterManager.add(master2);
			masterManager.add(master3);
			masterManager.add(master4);
			masterManager.add(master5);
			masterManager.add(master6); */
			
			//masterManager.sortListBySurName();
			masterManager.showListOfMasters();
			System.out.println();
			
			//masterManager.sortListByStatus();
			//masterManager.showListOfMasters();
			
			masterManager.getAmountOfMasters();
			//System.out.println();
//------------------------------------------------------------------------------------------------ ORDERS ----------		
		//	OrderManager orderManager = new OrderManager();
		//	orderManager.add(order1);
		//	orderManager.add(order2);
		//	orderManager.add(order3);
		//	orderManager.add(order4);
		//	orderManager.add(order5);
		//	orderManager.add(order6);
		//	orderManager.setGarageForOrder(order4, garage3);
		//	orderManager.setMasterForOrder(order4);
			
		//	orderManager.showMasterByOrder(order4);
		//	orderManager.showGarageByOrder(order4);
		//	System.out.println();
			
			//orderManager.sortListByPrice();
		//	orderManager.showListOfOrders();
			//System.out.println();
			
			//orderManager.closeOrder(order4);
			//orderManager.showListOfOrders();
			//System.out.println();
			
			/*orderManager.sortListByDateRegistration();
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
			System.out.println();	*/
	   }
}