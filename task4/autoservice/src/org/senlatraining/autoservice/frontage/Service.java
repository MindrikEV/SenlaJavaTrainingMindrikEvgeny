package org.senlatraining.autoservice.frontage;

import org.senlatraining.autoservice.api.IService;
import org.senlatraining.autoservice.entity.*;
import org.senlatraining.autoservice.manager.*;
import org.senlatraining.autoservice.util.Recover;
/*
 * This class is facade... 
 */
public class Service implements IService{	 
 	private GarageManager garageManager = new GarageManager();
	private MasterManager masterManager = new MasterManager();
	private OrderManager orderManager = new OrderManager();
	
	public void init(){
		Recover recover = new Recover();
		recover.createMastersFromFile();
		recover.createGaragesFromFile();
		recover.createOrdersFromFile();
	}
//-----------------------------------------------------------------	
	public void stuff(){   	   				
		showListOfFreeGarages();
		
		showListOfOrders();
		showListOfMasters();
		sortListOfMastersByAlphabet();
		sortListOfMastersByStatus();
	}
//-----------------------------------------------------------------------------------------------------------  GARAGES  -------------------
	public void showListOfFreeGarages(){
		garageManager.showListOfFreeGarages();
	}
//-----------------------------------------------------------------	
	public void addNewGarage(Garage garage){ 
		garageManager.add(garage);
	}
//-----------------------------------------------------------------
	public void removeGarage(Garage garage){ 
		garageManager.remove(garage);
	}
//-----------------------------------------------------------------------------------------------------------  ORDERS  --------------------
	public void showListOfOrders(){
		orderManager.showListOfOrders();
	}
//-----------------------------------------------------------------
	public void showListOfOrdersSortedByRegistrationDate(){
		orderManager.sortListByDateRegistration(orderManager.getListOfOrders());
	}
//-----------------------------------------------------------------	
	public void showListOfOrdersSortedByCompleteDate(){
		orderManager.sortListByDateComplete(orderManager.getListOfOrders());
	}
//-----------------------------------------------------------------
	public void showListOfOrdersSortedByPlanStartDate(){
		orderManager.sortListByDatePlanStart(orderManager.getListOfOrders());
	}
//-----------------------------------------------------------------
	public void showListOfOrdersSortedByPrice(){
		orderManager.sortListByPrice(orderManager.getListOfOrders());
	}
//-----------------------------------------------------------------
	public void showListOfNowExecutable(){
		orderManager.showListOfExecutableOrders();
	}
//-----------------------------------------------------------------
	public void showListOfNowExecutableSortedByRegistrationDate(){
		orderManager.sortListByDateRegistration(orderManager.getListOfExecutableOrders());
	}
//-----------------------------------------------------------------	
	public void showListOfNowExecutableSortedByCompleteDate(){
		orderManager.sortListByDateComplete(orderManager.getListOfExecutableOrders());
	}
//-----------------------------------------------------------------
	public void showListOfNowExecutableSortedByPrice(){
		orderManager.sortListByPrice(orderManager.getListOfExecutableOrders());
	}
//-----------------------------------------------------------------
	public void showMasterByOrder(Order order){
		orderManager.showMasterByOrder(order);
	}
//-----------------------------------------------------------------	
	public void showOrdersInDateInterval(String startDate, String endDate){
		orderManager.showOrdersInInterval(startDate, endDate);
	}
//-----------------------------------------------------------------
	public void showOrdersInDateIntervalSortedByRegistrationDate(String startDate, String endDate){
		orderManager.sortListByDateRegistration(orderManager.getOrdersInInterval(startDate, endDate));
	}
//-----------------------------------------------------------------
	public void showOrdersInDateIntervalSortedByByCompleteDate(String startDate, String endDate){
		orderManager.sortListByDateComplete(orderManager.getOrdersInInterval(startDate, endDate));
	}
//-----------------------------------------------------------------
	public void showOrdersInDateIntervalSortedByPrice(String startDate, String endDate){
		orderManager.sortListByPrice(orderManager.getOrdersInInterval(startDate, endDate));
	}	
//-----------------------------------------------------------------
	public void showAmountOfFreePlacesOnDate(String date){
		orderManager.getAmountOfFreeByDate(date);
	}
//-----------------------------------------------------------------
	public void showNearestFreeDate(String date){
		orderManager.getAmountOfFreeByDate(date);
	}
//-----------------------------------------------------------------
	public void addNewOrder(Order order){ 
		orderManager.add(order);
	}
//-----------------------------------------------------------------
	public void removeOrder(Order order){ 
		orderManager.remove(order);
	}
//-----------------------------------------------------------------
	public void closeOrder(Order order){ 
		orderManager.closeOrder(order);
	}	
//-----------------------------------------------------------------
	public void revokeOrder(Order order){ 
		orderManager.revokeOrder(order);
	}	
//-----------------------------------------------------------------
	public void moveOrderDateComplete(Order order, String newDate){ 
		orderManager.setDateOFComplete(order, newDate);
	}	
//-------------------------------------------------------------------------------------------------------------  MASTERS  -------------------
	public void showListOfMasters(){
		masterManager.showListOfMasters();
	}
//-----------------------------------------------------------------
	public void sortListOfMastersByAlphabet(){ 
		masterManager.sortListBySurName();
	}
//-----------------------------------------------------------------
	public void sortListOfMastersByStatus(){ 
		masterManager.sortListByStatus();
	}
//-----------------------------------------------------------------
	public void showOrderOfMaster(Master master){
		masterManager.showOrderOfMaster(master);
	}
//-----------------------------------------------------------------	
	public void addNewMaster(Master master){ 
		masterManager.add(master);
	}
//-----------------------------------------------------------------
	public void removeMaster(Master master){ 
		masterManager.remove(master);
	}
//-----------------------------------------------------------------		
}