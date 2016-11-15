package org.senlatraining.autoservice.frontage;

import org.senlatraining.autoservice.api.IService;
import org.senlatraining.autoservice.entity.*;
import org.senlatraining.autoservice.manager.*;
import org.senlatraining.autoservice.util.*;
import org.senlatraining.autoservice.util.comparators.*;
/*
 * This class is facade... 
 */
public class Service implements IService{	
	//private Printer printer = new Printer();
 	private GarageManager garageManager = new GarageManager();
	private MasterManager masterManager = new MasterManager();
	private OrderManager orderManager = new OrderManager();
	
	@Override
	public void init(){
/*		Recover recover = new Recover();
		recover.initRecover();
		
		Garage garage1 = new Garage();
		Garage garage2 = new Garage();
		
		Master master2 = new Master("Mister","Been");
		Master master3 = new Master("Kurt","Russel");
		
		Order order1 = new Order("Change driver",95.2,"2016-10-31","2016-11-08");
		Order order2 = new Order("Change oil",32.2,"2016-11-02","2016-11-17");
		Order order3 = new Order("Change wife of driver",22.2,"2016-11-23","2016-11-25");
		Order order4 = new Order("Change tutu",31.2,"2016-11-02","2016-11-17");
		Order order5 = new Order("Bi-bi",43.2,"2016-11-02","2016-11-17");
		
		addNewMaster(master2);
		addNewMaster(master3);
		removeMaster(master2);
		order3.setMaster(master3);
		order3.setGarage(garage2);
		showOrderOfMaster(master2);
		printer.printStick();
		showMasterByOrder(order3);
		printer.printStick();
		
		addNewGarage(garage1);
		addNewGarage(garage2);
		removeGarage(garage1);
		
		addNewOrder(order1);
		addNewOrder(order2);
		addNewOrder(order3);
		addNewOrder(order4);
		addNewOrder(order5);
		removeOrder(order1);
		//closeOrder(order2);
		//revokeOrder(order2);
		moveOrderDateComplete(order4, "2016-11-27");
		
		garageManager.showListOfGarages();
		printer.printStick();
		showListOfFreeGarages();
		printer.printStick();
		showListOfOrders();
		printer.printStick();
		showListOfOrdersSortedByRegistrationDate();
		printer.printStick();
		showListOfOrdersSortedByCompleteDate();
		printer.printStick();
		showListOfOrdersSortedByPlanStartDate();
		printer.printStick();
		showListOfOrdersSortedByPrice();
		printer.printStick();
		showListOfMasters();
		printer.printStick();
		sortListOfMastersByAlphabet();
		printer.printStick();
		sortListOfMastersByStatus();
		printer.printStick();
		showListOfNowExecutable();
		printer.printStick();
		showListOfNowExecutableSortedByRegistrationDate();
		printer.printStick();
		showListOfNowExecutableSortedByCompleteDate();
		printer.printStick();
		showListOfNowExecutableSortedByPrice();
		printer.printStick();
		
		showOrdersInDateInterval("2016-11-02", "2016-11-20");
		printer.printStick();
		showOrdersInDateIntervalSortedByRegistrationDate("2016-11-02", "2016-11-20");
		printer.printStick();
		showOrdersInDateIntervalSortedByPrice("2016-11-02", "2016-11-20");
		printer.printStick();
		//showAmountOfFreePlacesOnDate("2016-11-02");
		//printer.printStick();
		showNearestFreeDate(); */
	}
//-----------------------------------------------------------------------------------------------------------  GARAGES  -------------------
	@Override
	public void showListOfFreeGarages(){
		garageManager.showListOfFreeGarages();
	}
//-----------------------------------------------------------------	
	@Override
	public void addNewGarage(Garage garage){ 
		garageManager.add(garage);
	}
//-----------------------------------------------------------------
	@Override
	public void removeGarage(Garage garage){ 
		garageManager.remove(garage);
	}
//-----------------------------------------------------------------------------------------------------------  ORDERS  --------------------
	@Override
	public void showListOfOrders(){
		orderManager.showListOfOrders();
	}
//-----------------------------------------------------------------
	@Override
	public void showListOfOrdersSortedByRegistrationDate(){
		orderManager.sort(orderManager.getListOfOrders(), new ComparateOrdersByDateRegistration());
	}
//-----------------------------------------------------------------	
	@Override
	public void showListOfOrdersSortedByCompleteDate(){
		orderManager.sort(orderManager.getListOfOrders(), new ComparateOrdersByDateComplete());
	}
//-----------------------------------------------------------------
	@Override
	public void showListOfOrdersSortedByPlanStartDate(){
		orderManager.sort(orderManager.getListOfOrders(), new ComparateOrdersByDatePlanStart());
	}
//-----------------------------------------------------------------
	@Override
	public void showListOfOrdersSortedByPrice(){
		orderManager.sort(orderManager.getListOfOrders(), new ComparateOrdersByPrice());
	}
//-----------------------------------------------------------------
	@Override
	public void showListOfNowExecutable(){
		orderManager.showListOfExecutableOrders();
	}
//-----------------------------------------------------------------
	@Override
	public void showListOfNowExecutableSortedByRegistrationDate(){
		orderManager.sort(orderManager.getListOfExecutableOrders(), new ComparateOrdersByDateRegistration());
	}
//-----------------------------------------------------------------	
	@Override
	public void showListOfNowExecutableSortedByCompleteDate(){
		orderManager.sort(orderManager.getListOfExecutableOrders(), new ComparateOrdersByDateComplete());
	}
//-----------------------------------------------------------------
	@Override
	public void showListOfNowExecutableSortedByPrice(){
		orderManager.sort(orderManager.getListOfExecutableOrders(), new ComparateOrdersByPrice());
	}
//-----------------------------------------------------------------
	@Override
	public void showMasterByOrder(Order order){
		orderManager.showMasterByOrder(order);
	}
//-----------------------------------------------------------------	
	@Override
	public void showOrdersInDateInterval(String startDate, String endDate){
		orderManager.showOrdersInInterval(startDate, endDate);
	}
//-----------------------------------------------------------------
	@Override
	public void showOrdersInDateIntervalSortedByRegistrationDate(String startDate, String endDate){
		orderManager.sort(orderManager.getOrdersInInterval(startDate, endDate), new ComparateOrdersByDateRegistration());
	}
//-----------------------------------------------------------------
	@Override
	public void showOrdersInDateIntervalSortedByByCompleteDate(String startDate, String endDate){
		orderManager.sort(orderManager.getOrdersInInterval(startDate, endDate), new ComparateOrdersByDateComplete());
	}
//-----------------------------------------------------------------
	@Override
	public void showOrdersInDateIntervalSortedByPrice(String startDate, String endDate){
		orderManager.sort(orderManager.getOrdersInInterval(startDate, endDate), new ComparateOrdersByPrice());
	}	
//-----------------------------------------------------------------
	@Override
	public void showAmountOfFreePlacesOnDate(String date){
		orderManager.getAmountOfFreeByDate(date);
	}
//-----------------------------------------------------------------
	@Override
	public void showNearestFreeDate(){
		//orderManager.getAmountOfFreeByDate();
	}
//-----------------------------------------------------------------
	@Override
	public void addNewOrder(Order order){ 
		orderManager.add(order);
	}
//-----------------------------------------------------------------
	@Override
	public void removeOrder(Order order){ 
		orderManager.remove(order);
	}
//-----------------------------------------------------------------
	@Override
	public void closeOrder(Order order){ 
		orderManager.closeOrder(order);
	}	
//-----------------------------------------------------------------
	@Override
	public void revokeOrder(Order order){ 
		orderManager.revokeOrder(order);
	}	
//-----------------------------------------------------------------
	@Override
	public void moveOrderDateComplete(Order order, String newDate){ 
		orderManager.setDateOFComplete(order, newDate);
	}	
//-------------------------------------------------------------------------------------------------------------  MASTERS  -------------------
	@Override
	public void showListOfMasters(){
		masterManager.showListOfMasters();
	}
//-----------------------------------------------------------------
	@Override
	public void sortListOfMastersByAlphabet(){ 
		masterManager.sort(masterManager.getListOfMasters(), new ComparateMastersBySurName());
	}
//-----------------------------------------------------------------
	@Override
	public void sortListOfMastersByStatus(){ 
		masterManager.sort(masterManager.getListOfMasters(), new ComparateMastersByStatus());
	}
//-----------------------------------------------------------------
	@Override
	public void showOrderOfMaster(Master master){
		masterManager.showOrderOfMaster(master);
	}
//-----------------------------------------------------------------	
	@Override
	public void addNewMaster(Master master){ 
		masterManager.add(master);
	}
//-----------------------------------------------------------------
	@Override
	public void removeMaster(Master master){ 
		masterManager.remove(master);
	}	
}