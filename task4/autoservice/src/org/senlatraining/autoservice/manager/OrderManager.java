package org.senlatraining.autoservice.manager;

import org.senlatraining.autoservice.util.*;
import org.senlatraining.autoservice.util.sort.Sort;
import org.senlatraining.autoservice.api.*;
import org.senlatraining.autoservice.entity.*;

public class OrderManager implements IOrder, ICommonEntitiesManagers{
	private final String STATUS_CLOSE = "closed";
	private final String STATUS_REVOKE = "revoked";
	private final String STATUS_ACTIVE = "active";
	private final String path = "src/files/orders.txt";
	private FileWorker fileOperator = new FileWorker(path);
	private ArrayWorker arrayWorker = new ArrayWorker();
	private Order[] listOfOrders = new Order[10];
		
	public void add(Order order) {
		arrayWorker.addElement(listOfOrders, order);
	}
//------------------------------------------------------------------
	public void remove(Order order) {
		arrayWorker.removeElement(listOfOrders, order);
	}
//------------------------------------------------------------------
	public void closeOrder(Order order) {
		order.setStatus(STATUS_CLOSE);
	}
//------------------------------------------------------------------
	public void revokeOrder(Order order) {
		order.setStatus(STATUS_REVOKE);
	}
//------------------------------------------------------------------
	public void showListOfOrders() {
		arrayWorker.ShowList(listOfOrders);
	}
//-----------------------------------------------------------
	public void sortListByPrice(){
		Sort sort = new Sort();
		sort.sortOrdersListByPrice(listOfOrders);
	}
//------------------------------------------------------------------
	public void saveArray(){
		fileOperator.pushListToFile(listOfOrders);
	}
//------------------------------------------------------------------
}
