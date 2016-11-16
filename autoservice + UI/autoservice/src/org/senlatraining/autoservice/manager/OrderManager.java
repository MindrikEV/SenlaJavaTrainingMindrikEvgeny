package org.senlatraining.autoservice.manager;

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
import org.senlatraining.autoservice.util.comparators.*;

public class OrderManager implements IOrderManager, ICommonManagers {
	private final String STATUS_CLOSE = "closed";
	private final String STATUS_REVOKE = "revoked";
	private final String STATUS_ACTIVE = "active";
	private final String STATUS_AT_WORK = "at work";
	private final String ERROR_ORDER_DONT_HAVE_GARAGE = "This order don't have garage";
	private final String ERROR_ORDER_DONT_HAVE_MASTER = "This order don't have master";
	private static final Logger log = Logger.getLogger(OrderManager.class);
	private List<Order> listOfOrders = new ArrayList<Order>();
	private Path path = new Path();
	private Printer printer = new Printer();
	private FileWorker fileOperator = new FileWorker(path.getPathForOrder());
	private MasterManager masterManager = new MasterManager();
	private GarageManager garageManager = new GarageManager();
		
	@Override
	public void add(Order order) {
		listOfOrders.add(order);
		saveArray();
	}
//------------------------------------------------------------------
	@Override
	public void remove(Order order) {
		listOfOrders.remove(listOfOrders.indexOf(order));
		saveArray();
	}
//------------------------------------------------------------------
	@Override
	public void closeOrder(Order order) {
		order.setStatus(STATUS_CLOSE);
		order.getMaster().setStatus(false);
		order.getGarage().setStatus(false);
		saveArray();
	}
//------------------------------------------------------------------
	@Override
	public void revokeOrder(Order order) {
		order.setStatus(STATUS_REVOKE);
		order.getMaster().setStatus(false);
		order.getGarage().setStatus(false);
		saveArray();
	}
//------------------------------------------------------------------
	@Override
	public void showListOfOrders() {
		printer.printList(listOfOrders);
	}
//------------------------------------------------------------------	
	@Override
	public List<Order> getListOfOrders() {
		return listOfOrders;
	}	
//------------------------------------------------------------------
	@Override
	public void showListOfExecutableOrders(){
		for(int i = 0; i < listOfOrders.size(); i++){
			if(listOfOrders.get(i).getStatus().equals(STATUS_AT_WORK)){
				printer.print(listOfOrders.get(i).toString());
			}
		}
	}
//------------------------------------------------------------------
	@Override
	public List<Order> getListOfExecutableOrders(){
		List<Order> array = new ArrayList<Order>();
		for(int i = 0; i < listOfOrders.size(); i++){
			if(listOfOrders.get(i).getStatus().equals(STATUS_AT_WORK)){
				array.add(listOfOrders.get(i));
			}
		}
		return array;	
	}
//------------------------------------------------------------------
	@Override
	public void showMasterByOrder(Order order){
		if(order.getMaster() != null){
			printer.print(order.getMaster().toString());
		} else {
			printer.print(ERROR_ORDER_DONT_HAVE_MASTER);
		}
	}
//------------------------------------------------------------------
	@Override
	public void showGarageByOrder(Order order){
		if(order.getMaster() != null){
			printer.print(order.getGarage().toString());
		} else {
			printer.print(ERROR_ORDER_DONT_HAVE_GARAGE);
		}
	}
//------------------------------------------------------------------
	@Override
	public void showOrdersInInterval(String startDate, String endDate){
		for(int i = 0; i < listOfOrders.size(); i++){
			if((listOfOrders.get(i).getDateOfComplete().isAfter(LocalDate.parse(startDate))) 
			&& (listOfOrders.get(i).getDateOfComplete().isBefore(LocalDate.parse(endDate)))){
				printer.print(listOfOrders.get(i).toString());
			}	
		}	
	}	
//------------------------------------------------------------------
	@Override
	public List<Order> getOrdersInInterval(String startDate, String endDate){
		List<Order> array = new ArrayList<Order>();
		
		for(int i = 0; i < listOfOrders.size(); i++){
			if((listOfOrders.get(i).getDateOfComplete().isAfter(LocalDate.parse(startDate))) 
			&& (listOfOrders.get(i).getDateOfComplete().isBefore(LocalDate.parse(endDate)))){
				array.add(listOfOrders.get(i));
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
		
		for(int i = 0; i < listOfOrders.size(); i++){
			if(LocalDate.parse(date).isAfter(listOfOrders.get(i).getDateOfRegistration())
			&& (LocalDate.parse(date).isBefore(listOfOrders.get(i).getDateOfComplete())) 
			&& (!listOfOrders.get(i).getGarage().getStatus())
			&& (!listOfOrders.get(i).getMaster().getStatus())){
				count++;	
			}
		}
		return count;
	} 
//------------------------------------------------------------------
	@Override
	public void sort(List<Order> listOfOrders, Comparator comparator){
		Collections.sort(listOfOrders, comparator);	
		printer.printList(listOfOrders);
	}
//------------------------------------------------------------------
	@Override
	public void saveArray(){										
		fileOperator.pushListToFile(listOfOrders);
	}
}
