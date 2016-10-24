package org.senlatraining.autoservice.api;

public interface IOrder {
	
	public void closeOrder(Order order);
	public void revokeOrder(Order order);
	public void showListOfOrders();
}
