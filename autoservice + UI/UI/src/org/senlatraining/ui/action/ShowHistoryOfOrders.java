package org.senlatraining.ui.action;

import org.senlatraining.autoservice.frontage.Service;
import org.senlatraining.ui.api.IAction;
import org.senlatraining.ui.util.Printer;

public class ShowHistoryOfOrders implements IAction{
	private final String MSG_HISTORY_OF_ORDERS = "History of orders: ";
	private Service service;
	
	@Override
	public void execute() {
		Printer.println(MSG_HISTORY_OF_ORDERS);
		Printer.printList(service.getListOfFreeGarages());

	}
}
