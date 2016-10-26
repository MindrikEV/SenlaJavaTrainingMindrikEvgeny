package org.senlatraining.autoservice.util.sort;

import java.util.Arrays;
import org.senlatraining.autoservice.entity.*;
import org.senlatraining.autoservice.util.comparators.*;

public class Sort{
	private final String SORT_BY_SURNAME = "v List sorted by --> surName!";
	private final String SORT_BY_STATUS = "v List sorted by --> status!";
	private final String SORT_BY_PRICE = "v List sorted by --> price!";
	private final String SORT_BY_DATE_REGISTRATION = "v List sorted by --> date of registration!";
	private final String SORT_BY_DATE_COMPLETE = "v List sorted by --> date of complete work!";
	private final String SORT_BY_DATE_PLAN_START = "v List sorted by --> date of plan start of work!";
	
/*	public Object[] sortMastersListBySurName(Object[] array){
		ComparateMastersBySurName comparateMastersBySurName = new ComparateMastersBySurName();
		Arrays.sort(array, comparateMastersBySurName);
		System.out.println(SORT_BY_SURNAME);
		
		return array;
	}*/
//---------------------------------------------------------------------------------------------------	
	public Master[] sortMastersListBySurName(Master[] listOfMasters){
		ComparateMastersBySurName comparateMastersBySurName = new ComparateMastersBySurName();
		Arrays.sort(listOfMasters, comparateMastersBySurName);
		System.out.println(SORT_BY_SURNAME);
		
		return listOfMasters;
	} 
//---------------------------------------------------------------------	
	public Master[] sortMastersListByStatus(Master[] listOfMasters){
		ComparateMastersByStatus comparateMastersByStatus = new ComparateMastersByStatus();
		Arrays.sort(listOfMasters, comparateMastersByStatus);
		System.out.println(SORT_BY_STATUS);	
		
		return listOfMasters;
	}
//------------------------------------------------------------------------------------------------------------------------------------------
	public Garage[] sortGaragesListByStatus(Garage[] listOfGarages){
		ComparateGaragesByStatus compareGarageByStatus = new ComparateGaragesByStatus();
		Arrays.sort(listOfGarages, compareGarageByStatus);
		System.out.println(SORT_BY_STATUS);
		
		return listOfGarages;
	}
//------------------------------------------------------------------------------------------------------------------------------------------
	public Order[] sortOrdersListByPrice(Order[] listOfOrders){
		ComparateOrdersByPrice comparateOrdersByPrice = new ComparateOrdersByPrice();
		Arrays.sort(listOfOrders, comparateOrdersByPrice);
		System.out.println(SORT_BY_PRICE);
		
		return listOfOrders;
	}
//---------------------------------------------------------------------
	public Order[] sortOrdersListByDateRegistration(Order[] listOfOrders){
		ComparateOrdersByDateRegistration comparateOrdersByDateRegistration = new ComparateOrdersByDateRegistration();
		Arrays.sort(listOfOrders, comparateOrdersByDateRegistration);
		System.out.println(SORT_BY_DATE_REGISTRATION);
			
		return listOfOrders;
	}
//---------------------------------------------------------------------
	public Order[] sortOrdersByDateComplete(Order[] listOfOrders){
		ComparateOrdersByDateComplete comparateOrdersByDateComplete = new ComparateOrdersByDateComplete();
		Arrays.sort(listOfOrders, comparateOrdersByDateComplete);
		System.out.println(SORT_BY_DATE_COMPLETE);
				
		return listOfOrders;
	}
//---------------------------------------------------------------------
	public Order[] sortOrdersByDatePlanStart(Order[] listOfOrders){
		ComparateOrdersByDatePlanStart comparateOrdersByDatePlanStart = new ComparateOrdersByDatePlanStart();
		Arrays.sort(listOfOrders, comparateOrdersByDatePlanStart);
		System.out.println(SORT_BY_DATE_PLAN_START);
				
		return listOfOrders;
	}
}
