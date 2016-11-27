package org.senlatraining.autoservice.api;

import java.util.List;

import org.senlatraining.autoservice.entity.Garage;
import org.senlatraining.autoservice.entity.Order;
import java.util.Comparator;

public interface IOrderManager {
	
	public void add(String description, Double price, String planStartDay, String completeDay);
	public void copyOrder(Integer index);
	public Boolean remove(Integer id);
	public Boolean changeStatusOrder(Integer id, String status);
	public void moveOrder(Integer id, String startDate, String completeDate);
	public void showMasterByOrder(Order order);
	public List<Order> getListOfExecutableOrders();
	public List<Order> getListOfOrders();
	public void showGarageByOrder(Order order);
	public List<Order> getOrdersInInterval(String startDate, String endDate);
	public void setMasterForOrder(Order order);
	public void setGarageForOrder(Order order, Garage garage);
	public void setDateOFComplete(Order order, String newDate);
	public Integer getAmountOfFreeByDate(String date);
	public void sort(List<Order> listOfOrders, Comparator comparator);
}
