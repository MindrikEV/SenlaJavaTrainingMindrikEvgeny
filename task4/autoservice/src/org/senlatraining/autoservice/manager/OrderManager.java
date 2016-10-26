package org.senlatraining.autoservice.manager;

import java.time.LocalDate;
import org.senlatraining.autoservice.util.*;
import org.senlatraining.autoservice.util.sort.Sort;
import org.senlatraining.autoservice.api.*;
import org.senlatraining.autoservice.entity.*;
import org.senlatraining.autoservice.util.Printer;

public class OrderManager implements IOrderManager, ICommonManagers {
	private final String STATUS_CLOSE = "closed";
	private final String STATUS_REVOKE = "revoked";
	private final String STATUS_ACTIVE = "active";
	private final String STATUS_AT_WORK = "at work";
	private final String ERROR_ORDER_DONT_HAVE_GARAGE = "This order don't have garage";
	private final String ERROR_ORDER_DONT_HAVE_MASTER = "This order don't have master";
	private static Order[] listOfOrders = new Order[10];
	private Sort sort = new Sort();
	private Path path = new Path();
	private Printer printer = new Printer();
	private ArrayWorker arrayWorker = new ArrayWorker();
	private FileWorker fileOperator = new FileWorker(path.getPathForOrder());
	private MasterManager masterManager = new MasterManager();
	private GarageManager garageManager = new GarageManager();
		
	@Override
	public void add(Order order) {
		arrayWorker.addElement(listOfOrders, order);
		saveArray();
	}
//------------------------------------------------------------------
	@Override
	public void remove(Order order) {
		arrayWorker.removeElement(listOfOrders, order);
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
		printer.printArray(listOfOrders);
	}
//------------------------------------------------------------------	
	public Order[] getListOfOrders() {
		return listOfOrders;
	}	
//------------------------------------------------------------------
	@Override
	public void showListOfExecutableOrders(){
		for(int i = 0; i < listOfOrders.length; i++){
			if(listOfOrders[i] != null && listOfOrders[i].getStatus().equals(STATUS_AT_WORK)){
				System.out.println(listOfOrders[i].toString());
			}
		}
	}
//------------------------------------------------------------------
	public Order[] getListOfExecutableOrders(){
		Integer k = 0;
		Order[] array = new Order[arrayWorker.countOfElements(listOfOrders)];
		for(int i = 0; i < listOfOrders.length; i++){
			if(listOfOrders[i] != null && listOfOrders[i].getStatus().equals(STATUS_AT_WORK)){
				array[k] = listOfOrders[i];
				k++;
			}
		}
		return array;	
	}
//------------------------------------------------------------------
	@Override
	public void showMasterByOrder(Order order){
		if(order.getMaster() != null){
			System.out.println(order.getMaster().toString());
		} else {
			printer.printMessage(ERROR_ORDER_DONT_HAVE_MASTER);
		}
	}
//------------------------------------------------------------------
	public void showGarageByOrder(Order order){
		if(order.getMaster() != null){
			System.out.println(order.getGarage().toString());
		} else {
			printer.printMessage(ERROR_ORDER_DONT_HAVE_GARAGE);
		}
	}
//------------------------------------------------------------------
	public void showOrdersInInterval(String startDate, String endDate){
		for(int i = 0; i < listOfOrders.length; i++){
			if((listOfOrders[i] != null) 
			&& (listOfOrders[i].getDateOfComplete().isAfter(LocalDate.parse(startDate))) 
			&& (listOfOrders[i].getDateOfComplete().isBefore(LocalDate.parse(endDate)))){
				System.out.println(listOfOrders[i].toString());
			}	
		}	
	}	
//------------------------------------------------------------------
	public Object[] getOrdersInInterval(String startDate, String endDate){
		Order[] array = new Order[10];
		Integer k = 0;
		
		if(arrayWorker.countOfElements(array) == array.length){
			arrayWorker.resize(array);
		}
		
		for(int i = 0; i < listOfOrders.length; i++){
			if((listOfOrders[i] != null) 
			&& (listOfOrders[i].getDateOfComplete().isAfter(LocalDate.parse(startDate))) 
			&& (listOfOrders[i].getDateOfComplete().isBefore(LocalDate.parse(endDate)))){
				array[k] = listOfOrders[i];
				k++;
			}	
		}
		return arrayWorker.getListOfNotNull(array);
	}		
//------------------------------------------------------------------
	public void setMasterForOrder(Order order){
		order.setMaster(masterManager.getFreeMaster());
		saveArray();
	}
//-------------------------------------------------------------------
	public void setGarageForOrder(Order order, Garage garage){
		order.setGarage(garageManager.getFreeGarage());
		saveArray();
	}
//------------------------------------------------------------------
	public void setDateOFComplete(Order order, String newDate){
		order.setDateOfComplete(newDate);
		saveArray();
	}
//------------------------------------------------------------------
	public Integer getAmountOfFreeByDate(String date){
		Integer count = 0;
		Boolean f = false;
		
		for(int i = 0; i < listOfOrders.length; i++){
			if((listOfOrders[i] != null) 
			&& (LocalDate.parse(date).isAfter(listOfOrders[i].getDateOfRegistration()))
			&& (LocalDate.parse(date).isBefore(listOfOrders[i].getDateOfComplete())) 
			&& (listOfOrders[i].getGarage().getStatus() == f)
			&& (listOfOrders[i].getMaster().getStatus() == f)){
				count++;	
			}
		}
		return count;
	} 
//------------------------------------------------------------------
	public void sortListByPrice(Order[] listOfOrders){
		sort.sortOrdersListByPrice(listOfOrders);
		printer.printArray(listOfOrders);
	}
//------------------------------------------------------------------	
	public void sortListByDateRegistration(Order[] listOfOrders){
		sort.sortOrdersListByDateRegistration(listOfOrders);
		printer.printArray(listOfOrders);
	}
//------------------------------------------------------------------
	public void sortListByDateComplete(Order[] listOfOrders){
		sort.sortOrdersByDateComplete(listOfOrders);
		printer.printArray(listOfOrders);
	}
//------------------------------------------------------------------
	public void sortListByDatePlanStart(Order[] listOfOrders){
		sort.sortOrdersByDatePlanStart(listOfOrders);
		printer.printArray(listOfOrders);
	}
//------------------------------------------------------------------
	@Override
	public void saveArray(){										
		fileOperator.pushListToFile(listOfOrders);
	}
}
