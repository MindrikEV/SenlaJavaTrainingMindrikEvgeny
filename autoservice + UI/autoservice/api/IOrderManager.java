package org.senlatraining.autoservice.api;

import org.senlatraining.autoservice.entity.Garage;
import org.senlatraining.autoservice.entity.Order;

public interface IOrderManager {
	
	public void add(Order order);
	public void remove(Order order);
	public void closeOrder(Order order);
	public void revokeOrder(Order order);
	public void showMasterByOrder(Order order);
	public void showListOfExecutableOrders();
	public Order[] getListOfExecutableOrders();
	public void showListOfOrders();
	public void showGarageByOrder(Order order);
	public void showOrdersInInterval(String startDate, String endDate);
	public Object[] getOrdersInInterval(String startDate, String endDate);
	public void setMasterForOrder(Order order);
	public void setGarageForOrder(Order order, Garage garage);
	public void setDateOFComplete(Order order, String newDate);
	public Integer getAmountOfFreeByDate(String date);
	public void sortOrdersListByPrice(Order[] listOfOrders);
	public void sortOrdersListByDateRegistration(Order[] listOfOrders);
	public void sortOrdersByDateComplete(Order[] listOfOrders);
	public void sortOrdersByDatePlanStart(Order[] listOfOrders);
}
