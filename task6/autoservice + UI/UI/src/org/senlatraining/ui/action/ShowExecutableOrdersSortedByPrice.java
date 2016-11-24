package org.senlatraining.ui.action;

import org.apache.log4j.Logger;
import org.senlatraining.autoservice.frontage.Service;
import org.senlatraining.ui.api.IAction;
import org.senlatraining.ui.util.Printer;

public class ShowExecutableOrdersSortedByPrice implements IAction{
	private static final Logger log = Logger.getLogger(ShowExecutableOrdersSortedByPrice.class);
	private final String MSG_EXECUTABLE_ORDERS_SORT_BY_PRICE = "Executable orders sorted by price: ";
	private Service service;
	
	@Override
	public void execute() {
		try{
			Printer.println(MSG_EXECUTABLE_ORDERS_SORT_BY_PRICE);
			Printer.printList(service.getListOfNowExecutableSortedByPrice());
		} catch (NullPointerException npe){
			log.error(npe);
			throw(npe);
		}
	}
	
}
