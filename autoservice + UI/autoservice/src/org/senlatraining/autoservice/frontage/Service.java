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
	private static Service instance;
	private static GarageManager garageManager  = new GarageManager();
	private static MasterManager masterManager = new MasterManager();
	private static OrderManager orderManager = new OrderManager();
	
	private Service(){
		try{
			Recover recover = new Recover();
			recover.initRecover();
		} catch(Exception e) {
			log.error(e);
			throw(e);
		}
	}
	
	public static Service getInstance(){
		if (instance == null){
			instance = new Service();
		}
		return instance;
	}
//-----------------------------------------------------------------------------------------------------------  GARAGES  -------------------
	@Override
	public List<Garage> getListOfFreeGarages(){
		try{
			return garageManager.getListOfFreeGarages();
		} catch (NullPointerException npe){
			log.error(npe);
			throw(npe);
		}
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
		try{
			return garageManager.remove(number);
		} catch (NullPointerException npe){
			log.error(npe);
			throw(npe);
		}
	}
//-----------------------------------------------------------------------------------------------------------  ORDERS  --------------------
	@Override
	public List<Order> getListOfOrdersSortedByRegistrationDate(){
		try{
			orderManager.sort(orderManager.getListOfOrders(), new ComparateOrdersByDateRegistration());
			return orderManager.getListOfOrders();
		} catch (NullPointerException npe){
			log.error(npe);
			throw(npe);
		}
	}
//-----------------------------------------------------------------	
	@Override
	public List<Order> getListOfOrdersSortedByCompleteDate(){
		try{
			orderManager.sort(orderManager.getListOfOrders(), new ComparateOrdersByDateRegistration());
			return orderManager.getListOfOrders();
		} catch (NullPointerException npe){
			log.error(npe);
			throw(npe);
		}
	}
//-----------------------------------------------------------------
	@Override
	public List<Order> getListOfOrdersSortedByPlanStartDate(){
		try{
			orderManager.sort(orderManager.getListOfOrders(), new ComparateOrdersByDatePlanStart());
			return orderManager.getListOfOrders();
		} catch (NullPointerException npe){
			log.error(npe);
			throw(npe);
		}
	}
//-----------------------------------------------------------------
	@Override
	public List<Order> getListOfOrdersSortedByPrice(){
		try{
			orderManager.sort(orderManager.getListOfOrders(), new ComparateOrdersByPrice());
			return orderManager.getListOfOrders();
		} catch (NullPointerException npe){
			log.error(npe);
			throw(npe);
		}
	}
//-----------------------------------------------------------------
	@Override
	public List<Order> getListOfNowExecutableSortedByRegistrationDate(){
		try{
			orderManager.sort(orderManager.getListOfExecutableOrders(), new ComparateOrdersByDateRegistration());
			return orderManager.getListOfExecutableOrders();
		} catch (NullPointerException npe){
			log.error(npe);
			throw(npe);
		}
	}
//-----------------------------------------------------------------	
	@Override
	public List<Order> getListOfNowExecutableSortedByCompleteDate(){
		try{
			orderManager.sort(orderManager.getListOfExecutableOrders(), new ComparateOrdersByDateComplete());
			return orderManager.getListOfExecutableOrders();
		} catch (NullPointerException npe){
			log.error(npe);
			throw(npe);
		}
	}
//-----------------------------------------------------------------
	@Override
	public List<Order> getListOfNowExecutableSortedByPrice(){
		try{
			orderManager.sort(orderManager.getListOfExecutableOrders(), new ComparateOrdersByPrice());
			return orderManager.getListOfExecutableOrders();
		} catch (NullPointerException npe){
			log.error(npe);
			throw(npe);
		}
	}
//-----------------------------------------------------------------
	@Override
	public List<Order> getOrdersInDateIntervalSortedByRegistrationDate(String startDate, String endDate){
		try{
			//orderManager.sort(orderManager.getOrdersInInterval(startDate, endDate), new ComparateOrdersByDateRegistration());
			orderManager.sort(orderManager.getListOfOrders(), new ComparateOrdersByDateRegistration());
			return orderManager.getOrdersInInterval(startDate, endDate);
		} catch (NullPointerException npe){
			log.error(npe);
			throw(npe);
		}
	}
//-----------------------------------------------------------------
	@Override
	public List<Order> getOrdersInDateIntervalSortedByByCompleteDate(String startDate, String endDate){
		try{
			//orderManager.sort(orderManager.getOrdersInInterval(startDate, endDate), new ComparateOrdersByDateComplete());
			orderManager.sort(orderManager.getListOfOrders(), new ComparateOrdersByDateComplete());
			return orderManager.getOrdersInInterval(startDate, endDate);
		} catch (NullPointerException npe){
			log.error(npe);
			throw(npe);
		}
	}
//-----------------------------------------------------------------
	@Override
	public List<Order> getOrdersInDateIntervalSortedByPrice(String startDate, String endDate){
		try{
			//orderManager.sort(orderManager.getOrdersInInterval(startDate, endDate), new ComparateOrdersByPrice());
			orderManager.sort(orderManager.getListOfOrders(), new ComparateOrdersByPrice());
			return orderManager.getOrdersInInterval(startDate, endDate);
		} catch (NullPointerException npe){
			log.error(npe);
			throw(npe);
		}
	}	
//-----------------------------------------------------------------
	@Override
	public Integer getAmountOfFreePlacesOnDate(String date){
		try{
			return orderManager.getAmountOfFreeByDate(date);
		} catch (NullPointerException npe){
			log.error(npe);
			throw(npe);
		}
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
	public List<Master> sortListOfMastersByAlphabet(){ 
		try{
			masterManager.sort(masterManager.getListOfMasters(), new ComparateMastersBySurName());
			return masterManager.getListOfMasters();
		} catch (NullPointerException npe){
			log.error(npe);
			throw(npe);
		}
	}
//-----------------------------------------------------------------
	@Override
	public List<Master> sortListOfMastersByStatus(){ 
		try{
			masterManager.sort(masterManager.getListOfMasters(), new ComparateMastersByStatus());
			return masterManager.getListOfMasters();
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
		try{
			return masterManager.remove(surName);
		} catch (NullPointerException npe){
			log.error(npe);
			throw(npe);
		}
	}	
}