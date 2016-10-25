package org.senlatraining.autoservice.api;

import org.senlatraining.autoservice.entity.Order;

public interface IOrder {
	
	public void add(Order order);
	public void remove(Order order);
	public void closeOrder(Order order);
	public void revokeOrder(Order order);
	public void showListOfOrders();
}
