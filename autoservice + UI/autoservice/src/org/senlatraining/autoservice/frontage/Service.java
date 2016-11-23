package org.senlatraining.autoservice.frontage;

import java.util.List;

import org.apache.log4j.Logger;
import org.senlatraining.autoservice.api.IService;
import org.senlatraining.autoservice.entity.*;
import org.senlatraining.autoservice.manager.*;
import org.senlatraining.autoservice.util.comparators.*;
import org.senlatraining.autoservice.util.Recover;

public class Service implements IService{	
	private static final Logger log = Logger.getLogger(Service.class);
	private static GarageManager garageManager  = new GarageManager();
	private static MasterManager masterManager = new MasterManager();
	private static OrderManager orderManager = new OrderManager();
	
	public Service(){	
		try{
			Recover recover = new Recover();
			recover.initRecover();
		} catch(Exception e) {
			log.error(e);
			throw(e);
		}
	}
//-----------------------------------------------------------------------------------------------------------  GARAGES  -------------------
	@Override
	public List<Garage> getListOfFreeGarages(){
		return garageManager.getListOfFreeGarages();
	}
//-----------------------------------------------------------------	
	@Override
	public void addNewGarage(){ 
		try{
			garageManager.add();
		} catch (NullPointerException npe) {
			log.error(npe);
			throw(npe);
		}
	}
//-----------------------------------------------------------------
	@Override
	public Boolean removeGarage(Integer number){ 
		return garageManager.remove(number);
	}
//-----------------------------------------------------------------------------------------------------------  ORDERS  --------------------
/*	@Override
	public void showListOfOrders(){
		try{
			orderManager.showListOfOrders();
		} catch(NullPointerException npe) {
			log.error(npe);
			throw(npe);
		}
	}*/
//-----------------------------------------------------------------
	@Override
	public void showListOfOrdersSortedByRegistrationDate(){
		orderManager.sort(orderManager.getListOfOrders(), new ComparateOrdersByDateRegistration());
		orderManager.showListOfOrders();
	}
//-----------------------------------------------------------------	
	@Override
	public void showListOfOrdersSortedByCompleteDate(){
		orderManager.sort(orderManager.getListOfOrders(), new ComparateOrdersByDateComplete());
		orderManager.showListOfOrders();
	}
//-----------------------------------------------------------------
	@Override
	public void showListOfOrdersSortedByPlanStartDate(){
		orderManager.sort(orderManager.getListOfOrders(), new ComparateOrdersByDatePlanStart());
		orderManager.showListOfOrders();
	}
//-----------------------------------------------------------------
	@Override
	public void showListOfOrdersSortedByPrice(){
		orderManager.sort(orderManager.getListOfOrders(), new ComparateOrdersByPrice());
		orderManager.showListOfOrders();
	}
//-----------------------------------------------------------------
/*	@Override
	public void showListOfNowExecutable(){
		orderManager.showListOfExecutableOrders();
	}*/
//-----------------------------------------------------------------
	@Override
	public void showListOfNowExecutableSortedByRegistrationDate(){
		orderManager.sort(orderManager.getListOfExecutableOrders(), new ComparateOrdersByDateRegistration());
		orderManager.showListOfExecutableOrders();
	}
//-----------------------------------------------------------------	
	@Override
	public void showListOfNowExecutableSortedByCompleteDate(){
		orderManager.sort(orderManager.getListOfExecutableOrders(), new ComparateOrdersByDateComplete());
		orderManager.showListOfExecutableOrders();
	}
//-----------------------------------------------------------------
	@Override
	public void showListOfNowExecutableSortedByPrice(){
		orderManager.sort(orderManager.getListOfExecutableOrders(), new ComparateOrdersByPrice());
		orderManager.showListOfExecutableOrders();
	}
//-----------------------------------------------------------------
	@Override
	public void showOrdersInDateIntervalSortedByRegistrationDate(String startDate, String endDate){
		orderManager.sort(orderManager.getOrdersInInterval(startDate, endDate), new ComparateOrdersByDateRegistration());
		orderManager.showOrdersInInterval(startDate, endDate);
	}
//-----------------------------------------------------------------
	@Override
	public void showOrdersInDateIntervalSortedByByCompleteDate(String startDate, String endDate){
		orderManager.sort(orderManager.getOrdersInInterval(startDate, endDate), new ComparateOrdersByDateComplete());
		orderManager.showOrdersInInterval(startDate, endDate);
	}
//-----------------------------------------------------------------
	@Override
	public void showOrdersInDateIntervalSortedByPrice(String startDate, String endDate){
		orderManager.sort(orderManager.getOrdersInInterval(startDate, endDate), new ComparateOrdersByPrice());
		orderManager.showOrdersInInterval(startDate, endDate);
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
	public void addNewOrder(String description, Double price, String planStartDay, String completeDay){ 
		try{
			orderManager.add(description, price, planStartDay, completeDay);
		} catch (Exception e){
			log.error(e);
			throw(e);
		}
	}
//-----------------------------------------------------------------
	@Override
	public Boolean removeOrder(Integer id){ 
		try{
			return orderManager.remove(id);
		} catch (NullPointerException npe){
			log.error(npe);
			throw(npe);
		}
	}
//-----------------------------------------------------------------
	@Override
	public Boolean changeStatusOrder(Integer id, String status){ 
		try{
			return orderManager.changeStatusOrder(id, status);
		} catch (NullPointerException npe){
			log.error(npe);
			throw(npe);
		}
	}	
//-----------------------------------------------------------------
	@Override
	public void moveOrderDateComplete(Integer id, String dateStart, String dateComplete){ 
		try{
			orderManager.moveOrder(id, dateStart, dateComplete);
		} catch (NullPointerException npe){
			log.error(npe);
			throw(npe);
		}
	}	
//-------------------------------------------------------------------------------------------------------------  MASTERS  -------------------
	@Override
	public List<Master> getListOfMasters(){
			return masterManager.getListOfMasters();
	}
//-----------------------------------------------------------------
	@Override
	public void sortListOfMastersByAlphabet(){ 
		try{
			masterManager.sort(masterManager.getListOfMasters(), new ComparateMastersBySurName());
			masterManager.getListOfMasters();
		} catch (NullPointerException npe){
			log.error(npe);
			throw(npe);
		}
	}
//-----------------------------------------------------------------
	@Override
	public void sortListOfMastersByStatus(){ 
		try{
			masterManager.sort(masterManager.getListOfMasters(), new ComparateMastersByStatus());
			masterManager.getListOfMasters();
		} catch (NullPointerException npe){
			log.error(npe);
			throw(npe);
		}
	}
//-----------------------------------------------------------------
	/*	@Override
public String getOrderOfMaster(String surName){
		masterManager.getOrderOfMaster(surName);
	}*/
//-----------------------------------------------------------------	
	@Override
	public void addNewMaster(String name, String surName){ 
		try{
			masterManager.add(name, surName);
		} catch (NullPointerException npe){
			log.error(npe);
			throw(npe);
		}	
	}
//-----------------------------------------------------------------
	@Override
	public Boolean removeMaster(String surName){ 
		return masterManager.remove(surName);
	}	
}