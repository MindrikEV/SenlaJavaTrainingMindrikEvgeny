package org.senlatraining.autoservice.util.sort;

import java.util.Arrays;
import org.senlatraining.autoservice.entity.*;
import org.senlatraining.autoservice.util.Printer;
import org.senlatraining.autoservice.util.comparators.*;

public class Sort{
	private final String SORT_BY_SURNAME = "v List sorted by --> surName!";
	private final String SORT_BY_STATUS = "v List sorted by --> status!";
	private final String SORT_BY_PRICE = "v List sorted by --> price!";
	private final String SORT_BY_DATE = "v List sorted by --> date!";
	private Printer printer = new Printer();
	
	public Master[] sortMastersListBySurName(Master[] listOfMasters){
		ComparateMastersBySurName comparateMastersBySurName = new ComparateMastersBySurName();
		Arrays.sort(listOfMasters, comparateMastersBySurName);
		printer.printString(SORT_BY_SURNAME);
		
		return listOfMasters;
	} 
//---------------------------------------------------------------------	
	public Master[] sortMastersListByStatus(Master[] listOfMasters){
		ComparateMastersByStatus comparateMastersByStatus = new ComparateMastersByStatus();
		Arrays.sort(listOfMasters, comparateMastersByStatus);
		printer.printString(SORT_BY_STATUS);	
		
		return listOfMasters;
	}
//---------------------------------------------------------------------
	public Garage[] sortGaragesListByStatus(Garage[] listOfGarages){
		ComparateGaragesByStatus compareGarageByStatus = new ComparateGaragesByStatus();
		Arrays.sort(listOfGarages, compareGarageByStatus);
		printer.printString(SORT_BY_STATUS);
		
		return listOfGarages;
	}
//---------------------------------------------------------------------
	public Order[] sortOrdersListByPrice(Order[] listOfOrders){
		ComparateOrdersByPrice comparateOrdersByPrice = new ComparateOrdersByPrice();
		Arrays.sort(listOfOrders, comparateOrdersByPrice);
		printer.printString(SORT_BY_PRICE);
		
		return listOfOrders;
	}
}
