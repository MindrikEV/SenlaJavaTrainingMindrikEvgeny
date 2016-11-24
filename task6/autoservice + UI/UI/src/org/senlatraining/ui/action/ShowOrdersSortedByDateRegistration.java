package org.senlatraining.ui.action;

import org.apache.log4j.Logger;
import org.senlatraining.autoservice.frontage.Service;
import org.senlatraining.ui.api.IAction;
import org.senlatraining.ui.util.Printer;

public class ShowOrdersSortedByDateRegistration implements IAction{
	private static final Logger log = Logger.getLogger(ShowOrdersSortedByDateRegistration.class);
	private final String MSG_ORDERS_SORT_BY_DATE_REG = "Orders sorted by date registration: ";
	private Service service;
	
	@Override
	public void execute() {
		try{
			Printer.println(MSG_ORDERS_SORT_BY_DATE_REG);
			Printer.printList(service.getListOfOrdersSortedByRegistrationDate());
		} catch (NullPointerException npe){
			log.error(npe);
			throw(npe);
		}
	}
	
}
