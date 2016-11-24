package org.senlatraining.ui.action;

import org.apache.log4j.Logger;
import org.senlatraining.autoservice.frontage.Service;
import org.senlatraining.ui.api.IAction;
import org.senlatraining.ui.util.Printer;

public class getOrdersInDateIntervalSortedByRegistrationDate implements IAction{
	private static final Logger log = Logger.getLogger(getOrdersInDateIntervalSortedByRegistrationDate.class);
	private final String MSG_ORDERS_IN_INTERVAL_SORT_BY_DATE_REG = "Orders in date-interval sorted by date of registration: ";
	private Service service;
	
	@Override
	public void execute() {
		try{
			Printer.println(MSG_ORDERS_IN_INTERVAL_SORT_BY_DATE_REG);
			Printer.printList(service.getOrdersInDateIntervalSortedByRegistrationDate(String startDate, String endDate));
		} catch (NullPointerException npe){
			log.error(npe);
			throw(npe);
		}
	}
	
}
