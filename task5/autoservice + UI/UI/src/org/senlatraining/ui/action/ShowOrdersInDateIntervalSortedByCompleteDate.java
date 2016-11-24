package org.senlatraining.ui.action;

import java.util.Scanner;

import org.apache.log4j.Logger;
import org.senlatraining.autoservice.frontage.Service;
import org.senlatraining.ui.api.IAction;
import org.senlatraining.ui.util.Printer;

public class ShowOrdersInDateIntervalSortedByCompleteDate implements IAction{
	private static final Logger log = Logger.getLogger(ShowOrdersInDateIntervalSortedByCompleteDate.class);
	private final String MSG_ORDERS_IN_INTERVAL_SORT_BY_DATE_COM = "Orders in date-interval sorted by date of complete: ";
	private final String MSG_ENTER_START_DATE = "Please, enter start-date of interval (yyyy-mm-dd): ";
	private final String MSG_ENTER_END_DATE = "Please, enter end-date of interval (yyyy-mm-dd): ";
	private Service service;
	
	@Override
	public void execute() {
		try (Scanner sc = new Scanner(System.in)){
			
			Printer.print(MSG_ENTER_START_DATE);
			String tmpStartDate = sc.nextLine();
			Printer.print(MSG_ENTER_END_DATE);
			String tmpEndDate = sc.nextLine();
			
			Printer.println(MSG_ORDERS_IN_INTERVAL_SORT_BY_DATE_COM);
			Printer.printList(service.getOrdersInDateIntervalSortedByByCompleteDate(tmpStartDate, tmpEndDate));
		} catch (NullPointerException npe){
			log.error(npe);
			throw(npe);
		}
	}
}
