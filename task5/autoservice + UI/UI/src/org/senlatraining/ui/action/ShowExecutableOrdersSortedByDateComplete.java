package org.senlatraining.ui.action;

import org.apache.log4j.Logger;
import org.senlatraining.autoservice.frontage.Service;
import org.senlatraining.ui.api.IAction;
import org.senlatraining.ui.util.Printer;

public class ShowExecutableOrdersSortedByDateComplete implements IAction{
	private static final Logger log = Logger.getLogger(ShowExecutableOrdersSortedByDateComplete.class);
	private final String MSG_EXECUTABLE_ORDERS_SORT_BY_DATE_COM = "Executable orders sorted by date of complete: ";
	private Service service;
	
	@Override
	public void execute() {
		try{
			Printer.println(MSG_EXECUTABLE_ORDERS_SORT_BY_DATE_COM);
			Printer.printList(service.getListOfNowExecutableSortedByCompleteDate());
		} catch (NullPointerException npe){
			log.error(npe);
			throw(npe);
		}
	}
	
}
