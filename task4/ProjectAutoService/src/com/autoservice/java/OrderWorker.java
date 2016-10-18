package com.autoservice.java;

public class OrderWorker implements Operation{
	private Order[] listOfOrders = new Order[10];
	private final String path = "Orders.txt";
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
		arrayWorker.Show(listOfOrders);
	}
}
