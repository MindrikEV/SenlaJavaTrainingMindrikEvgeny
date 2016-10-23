package org.senlatraining.autoservice.manager;

import org.senlatraining.autoservice.util.*;
import org.senlatraining.autoservice.util.sort.Sort;
import org.senlatraining.autoservice.api.*;
import org.senlatraining.autoservice.entity.*;
import org.senlatraining.autoservice.util.parsers.*;

public class OrderManager implements IOrder, ICommonEntitiesManagers{
	private final String STATUS_CLOSE = "closed";
	private final String STATUS_REVOKE = "revoked";
	private final String STATUS_ACTIVE = "active";
	private final String STATUS_AT_WORK = "at work";
	private final String path = "src/files/orders.txt";
	private FileWorker fileOperator = new FileWorker(path);
	private ArrayWorker arrayWorker = new ArrayWorker();
	private ParserForOrders parserForOrders = new ParserForOrders();
	private Order[] listOfOrders = new Order[10];
	private MasterManager masterManager = new MasterManager();
	private GarageManager garageManager = new GarageManager();
		
	//@Override
	public void add(Order order) {
		arrayWorker.addElement(listOfOrders, order);
		saveArray();
	}
//------------------------------------------------------------------
	public void remove(Order order) {
		arrayWorker.removeElement(listOfOrders, order);
		saveArray();
	}
//------------------------------------------------------------------
	public void closeOrder(Order order) {
		order.setStatus(STATUS_CLOSE);
		order.getMaster().setStatus(false);
		order.getGarage().setStatus(false);
		saveArray();
	}
//------------------------------------------------------------------
	public void revokeOrder(Order order) {
		order.setStatus(STATUS_REVOKE);
		order.getMaster().setStatus(false);
		order.getGarage().setStatus(false);
		saveArray();
	}
//------------------------------------------------------------------
	public void showListOfOrders() {
		arrayWorker.ShowList(listOfOrders);
	}
//------------------------------------------------------------------
	public void showListOfExecutableOrders(){
		for(int i = 0; i < listOfOrders.length; i++){
			if(listOfOrders[i] != null && listOfOrders[i].getStatus().equals(STATUS_AT_WORK)){
				System.out.println(listOfOrders[i].toString());
			}
		}
	}
//------------------------------------------------------------------
	public void showMasterByOrder(Order order){
		System.out.println(order.getMaster().getSurName());
	}
//-----------------------------------------------------------
	public void sortListByPrice(){
		Sort sort = new Sort();
		sort.sortOrdersListByPrice(listOfOrders);
	}
//-----------------------------------------------------------
//	public void setMasterForOrder(Order order){
//		order.setMaster(masterManager.getFreeMaster());
//		saveArray();
//	}
//-------------------------------------------------------------------
	public void setGarageForOrder(Order order, Garage garage){
		order.setGarage(garageManager.getFreeGarage());
		saveArray();
	}
//-------------------------------------------------------------------	
	public void sortListByDateRegistration(){
		Sort sort = new Sort();
		sort.sortOrdersListByDateRegistration(listOfOrders);
	}
//-----------------------------------------------------------
	public void sortListByDateComplete(){
		Sort sort = new Sort();
		sort.sortOrdersByDateComplete(listOfOrders);
	}
//-----------------------------------------------------------
	public void sortListByDatePlanStart(){
		Sort sort = new Sort();
		sort.sortOrdersByDatePlanStart(listOfOrders);
	}
//------------------------------------------------------------------
/*	public void moveDateOFComplete(Order order){
		 order.setDateOfComplete(getDateOfComplete());
	}*/
//------------------------------------------------------------------
	public String getPath(){
		return this.path;
	}
//------------------------------------------------------------------
	public void saveArray(){										// Write array to file
		fileOperator.pushListToFile(listOfOrders);
	}
//------------------------------------------------------------------
	public void loadArray(){										// Read array from file
		parserForOrders.parseFromFile(fileOperator.pullFromFile());
	}
//------------------------------------------------------------------
}
