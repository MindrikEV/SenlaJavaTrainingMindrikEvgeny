package org.senlatraining.autoservice.runner;

import org.senlatraining.autoservice.entity.*;
import org.senlatraining.autoservice.manager.*;
/*
 * This class generate all objects and work with them. Emulate user-operations.  
 */
public class Stuffer {	 
	   public void stuff(){   
		   Recover recover = new Recover();
		   recover.createMastersFromFile();
		   recover.createGaragesFromFile();
		   recover.createOrdersFromFile();	   
//--------------------------------------------  GARAGES  ------------------------------------				
			GarageManager garageManager = new GarageManager();		
			
			garageManager.showListOfFreeGarages();
			System.out.println();
			
			//garageManager.sortListByStatus();
			//garageManager.showListOfFreeGarages();
			//System.out.println();
//-------------------------------------------- MASTERS -------------------------------------------------------------			
			MasterManager masterManager = new MasterManager();
			
			masterManager.sortListBySurName();
			masterManager.showListOfMasters();
			System.out.println();
			
			masterManager.sortListByStatus();
			masterManager.showListOfMasters();
			System.out.println();
//------------------------------------------- ORDERS ----------------------------------------------------------------		
			OrderManager orderManager = new OrderManager();
			
			orderManager.showListOfOrders();
			System.out.println();
			
			orderManager.showListOfExecutableOrders();
			System.out.println();
			
			System.out.println(orderManager.getAmountOfFreeByDate("2016-10-26"));
			
			//orderManager.setGarageForOrder(order4, garage3);
			//orderManager.setMasterForOrder(order4);
			
		//	orderManager.showMasterByOrder(order4);
		//	orderManager.showGarageByOrder(order4);
		
			
			
		//	orderManager.sortListByPrice();
			//orderManager.showListOfOrders();
			//System.out.println();
			
			//orderManager.closeOrder(order4);
			//orderManager.showListOfOrders();
			//System.out.println();
			
			/*orderManager.sortListByDateRegistration();
			orderManager.showListOfOrders();		
			System.out.println();
			
			orderManager.sortListByDatePlanStart();
			orderManager.showListOfOrders();
			System.out.println();
			
			orderManager.sortListByDateComplete();
			orderManager.showListOfOrders();
			System.out.println();	*/
	   }
}