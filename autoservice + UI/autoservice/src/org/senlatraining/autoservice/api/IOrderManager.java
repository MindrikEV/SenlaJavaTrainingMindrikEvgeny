package org.senlatraining.autoservice.api;

import java.util.List;

import org.senlatraining.autoservice.entity.Garage;
import org.senlatraining.autoservice.entity.Order;
import java.util.Comparator;

public interface IOrderManager {
	
	public void add(Order order);
	public void remove(Order order);
	public void closeOrder(Order order);
	public void revokeOrder(Order order);
	public void moveOrder();
	public void showMasterByOrder(Order order);
	public void showListOfExecutableOrders();
	public List<Order> getListOfExecutableOrders();
	public void showListOfOrders();
	public List<Order> getListOfOrders();
	public void showGarageByOrder(Order order);
	public void showOrdersInInterval(String startDate, String endDate);
	public List<Order> getOrdersInInterval(String startDate, String endDate);
	public void setMasterForOrder(Order order);
	public void setGarageForOrder(Order order, Garage garage);
	public void setDateOFComplete(Order order, String newDate);
	public Integer getAmountOfFreeByDate(String date);
	public void sort(List<Order> listOfOrders, Comparator comparator);
}
