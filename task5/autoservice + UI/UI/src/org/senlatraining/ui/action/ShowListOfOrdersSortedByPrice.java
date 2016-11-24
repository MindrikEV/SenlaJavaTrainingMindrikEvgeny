package org.senlatraining.ui.action;

import org.apache.log4j.Logger;
import org.senlatraining.autoservice.frontage.Service;
import org.senlatraining.ui.api.IAction;
import org.senlatraining.ui.util.Printer;

public class ShowListOfOrdersSortedByPrice implements IAction{
	private static final Logger log = Logger.getLogger(ShowListOfOrdersSortedByPrice.class);
	private final String MSG_ORDERS_SORT_BY_PRICE = "Orders sorted by price: ";
	private Service service;
	
	@Override
	public void execute() {
		try{
			Printer.println(MSG_ORDERS_SORT_BY_PRICE);
			Printer.printList(service.getListOfOrdersSortedByPrice());
		} catch (NullPointerException npe){
			log.error(npe);
			throw(npe);
		}
	}
	
}
