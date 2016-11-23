package org.senlatraining.ui.action;

import java.util.Scanner;

import org.apache.log4j.Logger;
import org.senlatraining.autoservice.frontage.Service;
import org.senlatraining.ui.api.IAction;
import org.senlatraining.ui.constants.Messeges;
import org.senlatraining.ui.util.Printer;

public class CloseOrder implements IAction{
	private static final Logger log = Logger.getLogger(CloseOrder.class);
	private final String MSG_NOT_FOUND_ORDER = "Order with this ID not found. Try another!";
	private final String MSG_ENTER_ID = "Enter ID of order -> ";
	private Service service = new Service();
	private Printer printer = new Printer(); 
		
	@Override
	public void execute() {
		printer.print(MSG_ENTER_ID);
		try (Scanner sc = new Scanner(System.in)){
			Boolean f = service.closeOrder(sc.nextInt());
			if(!f){
				System.out.print(MSG_NOT_FOUND_ORDER);
			} else {
				printer.print(sc.nextInt() + Messeges.Closed.toString());
			}
		} catch(NullPointerException ne){
			log.error(ne);
			throw(ne);
		}	
	}
}
