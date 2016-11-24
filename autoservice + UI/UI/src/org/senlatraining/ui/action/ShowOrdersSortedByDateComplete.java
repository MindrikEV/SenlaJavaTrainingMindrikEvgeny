package org.senlatraining.ui.action;

import org.apache.log4j.Logger;
import org.senlatraining.autoservice.frontage.Service;
import org.senlatraining.ui.api.IAction;
import org.senlatraining.ui.util.Printer;

public class ShowOrdersSortedByDateComplete implements IAction{
	private static final Logger log = Logger.getLogger(ShowOrdersSortedByDateComplete.class);
	private final String MSG_ORDERS_SORT_BY_DATE_COM = "Orders sorted by date of complete: ";
	private Service service;
	
	@Override
	public void execute() {
		try{
			Printer.println(MSG_ORDERS_SORT_BY_DATE_COM);
			Printer.printList(service.getListOfOrdersSortedByCompleteDate());
		} catch (NullPointerException npe){
			log.error(npe);
			throw(npe);
		}
	}
	
}