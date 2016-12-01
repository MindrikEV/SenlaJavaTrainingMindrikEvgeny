package org.senlatraining.autoservice.manager;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.senlatraining.autoservice.util.*;
import org.apache.log4j.Logger;
import org.senlatraining.autoservice.api.*;
import org.senlatraining.autoservice.entity.*;
import org.senlatraining.autoservice.storage.Storage;
import org.senlatraining.autoservice.util.comparators.*;

public class OrderManager implements IOrderManager, ICommonManagers, Serializable{

	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger(OrderManager.class);
	private final String STATUS_ACTIVE = "active";
	private final String STATUS_AT_WORK = "at work";
	private final String ERROR_ORDER_DONT_HAVE_GARAGE = "This order don't have garage";
	private final String ERROR_ORDER_DONT_HAVE_MASTER = "This order don't have master";
	private final String MSG_ORDER_IS_NOT_MOVABLE = "Sorry, but move-function is disabled for Orders!";
	private Path path = new Path();
	private FileWorker fileOperator = new FileWorker(path.getPathForOrder());
	private MasterManager masterManager = new MasterManager();
	private GarageManager garageManager = new GarageManager();
	private Properties properties;
	private Storage storage;

	@Override
	public void add(String description, Double price, String planStartDay, String completeDay) {
		Order order = new Order(description, price, planStartDay, completeDay);
		
		storage.listOfOrders.add(order);
		saveArray();
	}
//------------------------------------------------------------------
	public void copyOrder(Integer index){
		Order tmpOrder = null;
		for(Order o: storage.listOfOrders){
			if(o.getId() == index){
				tmpOrder = o.clone();
			}
		}
		storage.listOfOrders.add(tmpOrder);
		saveArray();
	}
//------------------------------------------------------------------
	@Override
	public Boolean remove(Integer id) {
		Boolean flag = false;
		
		if(properties.getRemovebleOfOrder()){
			for(int i=0; i<storage.listOfOrders.size(); i++){
				if(storage.listOfOrders.get(i).getId().equals(id)){
					storage.listOfOrders.remove(i);
					flag = true;
				}
			}	
			saveArray();
		}
		return flag;
	}
//------------------------------------------------------------------
	@Override
	public Boolean changeStatusOrder(Integer id, String status) {
		Boolean flag = false;
		try{
			for(int i=0; i<storage.listOfOrders.size(); i++){
				if(storage.listOfOrders.get(i).getId().equals(id)){
					storage.listOfOrders.get(i).setStatus(status);
					flag = true;
				}
			}	
		} catch (Exception e){
			log.error(e);
			throw e;
		}
		saveArray();
		return flag;
	}
//------------------------------------------------------------------
	@Override
	public void moveOrder(Integer id, String startDate, String completeDate) {
		if(properties.getMovableOfOrder()){
			for(int i=0; i<storage.listOfOrders.size(); i++){
				if(storage.listOfOrders.get(i).getId().equals(id)){
					storage.listOfOrders.get(i).setDateOfPlanStart(startDate);
					storage.listOfOrders.get(i).setDateOfComplete(completeDate);
				}
			} 
		} else {
			Printer.print(MSG_ORDER_IS_NOT_MOVABLE);
		}
	}		
//------------------------------------------------------------------	
	@Override
	public List<Order> getListOfOrders() {
		return storage.listOfOrders;
	}	
//------------------------------------------------------------------
	@Override
	public List<Order> getListOfExecutableOrders(){
		List<Order> array = new ArrayList<Order>();
		for(int i = 0; i < storage.listOfOrders.size(); i++){
			if(storage.listOfOrders.get(i).getStatus().equals(STATUS_AT_WORK)){
				array.add(storage.listOfOrders.get(i));
			}
		}
		return array;	
	}
//------------------------------------------------------------------
	@Override
	public void showMasterByOrder(Order order){
		if(order.getMaster() != null){
			Printer.print(order.getMaster().toString());
		} else {
			Printer.print(ERROR_ORDER_DONT_HAVE_MASTER);
		}
	}
//------------------------------------------------------------------
	@Override
	public void showGarageByOrder(Order order){
		if(order.getMaster() != null){
			Printer.print(order.getGarage().toString());
		} else {
			Printer.print(ERROR_ORDER_DONT_HAVE_GARAGE);
		}
	}
//------------------------------------------------------------------
	@Override
	public List<Order> getOrdersInInterval(String startDate, String endDate){
		List<Order> array = new ArrayList<Order>();
		
		for(int i = 0; i < storage.listOfOrders.size(); i++){
			if((storage.listOfOrders.get(i).getDateOfComplete().isAfter(LocalDate.parse(startDate))) 
			&& (storage.listOfOrders.get(i).getDateOfComplete().isBefore(LocalDate.parse(endDate)))){
				array.add(storage.listOfOrders.get(i));
			}	
		}
		return array;
	}		
//------------------------------------------------------------------
	@Override
	public void setMasterForOrder(Order order){
		order.setMaster(masterManager.getFreeMaster());
		saveArray();
	}
//-------------------------------------------------------------------
	@Override
	public void setGarageForOrder(Order order, Garage garage){
		order.setGarage(garageManager.getFreeGarage());
		saveArray();
	}
//------------------------------------------------------------------
	@Override
	public void setDateOFComplete(Order order, String newDate){
		order.setDateOfComplete(newDate);
		saveArray();
	}
//------------------------------------------------------------------
	@Override
	public Integer getAmountOfFreeByDate(String date){
		Integer count = 0;
		
		for(int i = 0; i < storage.listOfOrders.size(); i++){
			if(LocalDate.parse(date).isAfter(storage.listOfOrders.get(i).getDateOfRegistration())
			&& (LocalDate.parse(date).isBefore(storage.listOfOrders.get(i).getDateOfComplete())) 
			&& (!storage.listOfOrders.get(i).getGarage().getStatus())
			&& (!storage.listOfOrders.get(i).getMaster().getStatus())){
				count++;	
			}
		}
		return count;
	} 
//------------------------------------------------------------------
	@Override
	public void sort(List<Order> listOfOrders, Comparator comparator){
		Collections.sort(listOfOrders, comparator);	
	}
//------------------------------------------------------------------
	@Override
	public void saveArray(){										
		fileOperator.pushListToFile(storage.listOfOrders);
	}
}
