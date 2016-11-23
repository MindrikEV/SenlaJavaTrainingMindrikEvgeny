package org.senlatraining.autoservice.api;

import java.util.List;

import org.senlatraining.autoservice.entity.*;

public interface IService {
	//public void initService();
	public List<Garage> getListOfFreeGarages();
	public void addNewGarage();
	public Boolean removeGarage(Integer number);
//---------------------------------------------------------------------------
	//public void showListOfOrders();
	public void showListOfOrdersSortedByRegistrationDate();
	public void showListOfOrdersSortedByCompleteDate();
	public void showListOfOrdersSortedByPlanStartDate();
	public void showListOfOrdersSortedByPrice();
	//public void showListOfNowExecutable();
	public void showListOfNowExecutableSortedByRegistrationDate();
	public void showListOfNowExecutableSortedByCompleteDate();
	public void showListOfNowExecutableSortedByPrice();
	public void showMasterByOrder(Order order);
	//public void showOrdersInDateInterval(String startDate, String endDate);
	public void showOrdersInDateIntervalSortedByRegistrationDate(String startDate, String endDate);
	public void showOrdersInDateIntervalSortedByByCompleteDate(String startDate, String endDate);
	public void showOrdersInDateIntervalSortedByPrice(String startDate, String endDate);
	public void showAmountOfFreePlacesOnDate(String date);
	public void showNearestFreeDate();
	public void addNewOrder(String description, Double price, String planStartDay, String completeDay);
	public Boolean removeOrder(Integer id);
	public Boolean changeStatusOrder(Integer id, String status);
	public void moveOrderDateComplete(Integer id, String startDate, String completeDate);
//-----------------------------------------------------------------------------
	public List<Master> getListOfMasters();
	public void sortListOfMastersByAlphabet();
	public void sortListOfMastersByStatus();
	//public String getOrderOfMaster(String surName);
	public void addNewMaster(String name, String surName);
	public Boolean removeMaster(String surname);
}
