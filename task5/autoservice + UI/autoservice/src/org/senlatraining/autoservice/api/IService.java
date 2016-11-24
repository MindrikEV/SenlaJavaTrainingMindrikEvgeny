package org.senlatraining.autoservice.api;

import java.util.List;

import org.senlatraining.autoservice.entity.*;

public interface IService {
	public List<Garage> getListOfFreeGarages();
	public void addNewGarage();
	public Boolean removeGarage(Integer number);
//---------------------------------------------------------------------------
	public List<Order> getListOfOrdersSortedByRegistrationDate();
	public List<Order> getListOfOrdersSortedByCompleteDate();
	public List<Order> getListOfOrdersSortedByPlanStartDate();
	public List<Order> getListOfOrdersSortedByPrice();
	public List<Order> getListOfNowExecutableSortedByRegistrationDate();
	public List<Order> getListOfNowExecutableSortedByCompleteDate();
	public List<Order> getListOfNowExecutableSortedByPrice();
	//public List<Order> getMasterByOrder(Order order);
	//public void showOrdersInDateInterval(String startDate, String endDate);
	public List<Order> getOrdersInDateIntervalSortedByRegistrationDate(String startDate, String endDate);
	public List<Order> getOrdersInDateIntervalSortedByByCompleteDate(String startDate, String endDate);
	public List<Order> getOrdersInDateIntervalSortedByPrice(String startDate, String endDate);
	public Integer getAmountOfFreePlacesOnDate(String date);
	public void showNearestFreeDate();
	public void addNewOrder(String description, Double price, String planStartDay, String completeDay);
	public Boolean removeOrder(Integer id);
	public Boolean changeStatusOrder(Integer id, String status);
	public void moveOrderDateComplete(Integer id, String startDate, String completeDate);
//-----------------------------------------------------------------------------
	public List<Master> sortListOfMastersByAlphabet();
	public List<Master> sortListOfMastersByStatus();
	//public String getOrderOfMaster(String surName);
	public void addNewMaster(String name, String surName);
	public Boolean removeMaster(String surname);
}
