package org.senlatraining.autoservice.api;

import org.senlatraining.autoservice.entity.*;

public interface IService {
	public void init();
	public void showListOfFreeGarages();
	public void addNewGarage(Garage garage);
	public void removeGarage(Garage garage);
	public void showListOfOrders();
	public void showListOfOrdersSortedByRegistrationDate();
	public void showListOfOrdersSortedByCompleteDate();
	public void showListOfOrdersSortedByPlanStartDate();
	public void showListOfOrdersSortedByPrice();
	public void showListOfNowExecutable();
	public void showListOfNowExecutableSortedByRegistrationDate();
	public void showListOfNowExecutableSortedByCompleteDate();
	public void showListOfNowExecutableSortedByPrice();
	public void showMasterByOrder(Order order);
	public void showOrdersInDateInterval(String startDate, String endDate);
	public void showOrdersInDateIntervalSortedByRegistrationDate(String startDate, String endDate);
	public void showOrdersInDateIntervalSortedByByCompleteDate(String startDate, String endDate);
	public void showOrdersInDateIntervalSortedByPrice(String startDate, String endDate);
	public void showAmountOfFreePlacesOnDate(String date);
	public void showNearestFreeDate();
	public void addNewOrder(Order order);
	public void removeOrder(Order order);
	public void closeOrder(Order order);
	public void revokeOrder(Order order);
	public void moveOrderDateComplete(Order order, String newDate);
	public void showListOfMasters();
	public void sortListOfMastersByAlphabet();
	public void sortListOfMastersByStatus();
	public void showOrderOfMaster(Master master);
	public void addNewMaster(Master master);
	public void removeMaster(Master master);
}
