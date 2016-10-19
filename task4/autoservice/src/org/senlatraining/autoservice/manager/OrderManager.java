package org.senlatraining.autoservice.manager;

import org.senlatraining.autoservice.util.*;
import org.senlatraining.autoservice.entity.*;

public class OrderManager{
	private Order[] listOfOrders = new Order[10];
	private final String path = "src/files/orders.txt";
	private ArrayWorker arrayWorker = new ArrayWorker();	
		
	public void add(Order order) {
		arrayWorker.addElement(listOfOrders, order);
	}
//------------------------------------------------------------------
	public void remove(Order order) {
		arrayWorker.removeElement(listOfOrders, order);
	}
//------------------------------------------------------------------
	public void show() {
		arrayWorker.ShowList(listOfOrders);
	}
}
