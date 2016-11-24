package org.senlatraining.ui.action;

import org.apache.log4j.Logger;
import org.senlatraining.autoservice.frontage.Service;
import org.senlatraining.ui.api.IAction;
import org.senlatraining.ui.util.Printer;

public class ShowOrdersSortedByDatePlanStart implements IAction{
	private static final Logger log = Logger.getLogger(ShowOrdersSortedByDatePlanStart.class);
	private final String MSG_ORDERS_SORT_BY_DATE_START = "Orders sorted by date plan start: ";
	private Service service;
	
	@Override
	public void execute() {
		try{
			Printer.println(MSG_ORDERS_SORT_BY_DATE_START);
			Printer.printList(service.getListOfOrdersSortedByPlanStartDate());
		} catch (NullPointerException npe){
			log.error(npe);
			throw(npe);
		}
	}
	
}
