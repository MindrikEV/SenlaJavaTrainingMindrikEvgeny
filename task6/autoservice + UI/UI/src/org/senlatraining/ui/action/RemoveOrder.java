package org.senlatraining.ui.action;

import java.util.Scanner;

import org.apache.log4j.Logger;
import org.senlatraining.autoservice.frontage.Service;
import org.senlatraining.ui.api.IAction;
import org.senlatraining.ui.constants.Messeges;
import org.senlatraining.ui.util.Printer;

public class RemoveOrder implements IAction{
	private static final Logger log = Logger.getLogger(RemoveOrder.class);
	private final String MSG_NOT_FOUND_ORDER = "Order with this ID not found or remove-function is disabled in config! Try another!";
	private final String MSG_ENTER_ID = "Enter ID of order -> ";
	private Service service;
	
	@Override
	public void execute() {
		Printer.print(MSG_ENTER_ID);
		try (Scanner sc = new Scanner(System.in)){
			Boolean f = service.removeOrder(sc.nextInt());
			if(!f){
				System.out.print(MSG_NOT_FOUND_ORDER);
			} else {
				Printer.print(sc.nextInt() + Messeges.Removed.toString());
			}
		} catch(NullPointerException ne){
			log.error(ne);
			throw(ne);
		}	
	}
}
