package org.senlatraining.autoservice.frontage;

import java.util.List;

import org.senlatraining.autoservice.api.IService;
import org.senlatraining.autoservice.entity.*;
import org.senlatraining.autoservice.manager.*;
import org.senlatraining.autoservice.util.comparators.*;
import org.senlatraining.autoservice.util.Recover;

public class Service implements IService{	
	//private static Service service;
	private static GarageManager garageManager  = new GarageManager();
	private static MasterManager masterManager = new MasterManager();
	private static OrderManager orderManager = new OrderManager();
	
	public Service(){	
		Recover recover = new Recover();
		recover.initRecover();
	}
//-----------------------------------------------------------------------------------------------------------  GARAGES  -------------------
	@Override
	public List<Garage> getListOfFreeGarages(){
		return garageManager.getListOfFreeGarages();
	}
//-----------------------------------------------------------------	
	@Override
	public void addNewGarage(){ 
		garageManager.add();
	}
//-----------------------------------------------------------------
	@Override
	public Boolean removeGarage(Integer number){ 
		return garageManager.remove(number);
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
	public List<Master> getListOfMasters(){
		return masterManager.getListOfMasters();
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
	public void addNewMaster(String name, String surName){ 
		masterManager.add(name, surName);
	}
//-----------------------------------------------------------------
	@Override
	public void removeMaster(Master master){ 
		masterManager.remove(master);
	}	
}