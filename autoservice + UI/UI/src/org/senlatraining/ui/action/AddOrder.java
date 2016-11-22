package org.senlatraining.ui.action;

import java.util.Scanner;

import org.apache.log4j.Logger;
import org.senlatraining.autoservice.frontage.Service;
import org.senlatraining.ui.api.IAction;
import org.senlatraining.ui.util.Printer;

public class AddOrder implements IAction{
	private static final Logger log = Logger.getLogger(AddOrder.class);
	private final String MSG_WAS_ADDED = "New order was added!";
	private final String MSG_ENTER_DESCRIPTION = "Enter description: ";
	private final String MSG_ENTER_PRICE = "Enter price: ";
	private final String MSG_ENTER_START_DAY = "Enter start day: ";
	private final String MSG_ENTER_COMPLETE_DAY = "Enter complete day: ";
	private Service service = new Service();
	private Scanner sc = new Scanner(System.in);
	private Printer printer;
	
	@Override
	public void execute() {
		try{
			printer.println(MSG_ENTER_DESCRIPTION);
			String description = sc.nextLine();
			
			printer.println(MSG_ENTER_PRICE);
			Double price = Double.valueOf(sc.nextLine());
			
			printer.println(MSG_ENTER_START_DAY);
			String planStartDay = sc.nextLine();

			printer.println(MSG_ENTER_COMPLETE_DAY);
			String completeDay = sc.nextLine();
			
		service.addNewOrder(description, price, planStartDay, completeDay);
		} catch(NullPointerException ne){
			log.error(ne);
		}
		printer.print(MSG_WAS_ADDED);
	}

}
