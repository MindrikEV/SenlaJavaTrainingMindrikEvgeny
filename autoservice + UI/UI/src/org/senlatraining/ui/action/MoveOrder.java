package org.senlatraining.ui.action;

import java.util.Scanner;

import org.apache.log4j.Logger;
import org.senlatraining.autoservice.frontage.Service;
import org.senlatraining.ui.api.IAction;
import org.senlatraining.ui.constants.Messeges;
import org.senlatraining.ui.util.Printer;

public class MoveOrder implements IAction{
	private static final Logger log = Logger.getLogger(MoveOrder.class);
	private final String MSG_WAS = "Order was ";
	private final String MSG_ENTER_ID = "Enter ID: ";
	private final String MSG_ENTER_NEW_PLAN_DATE = "Enter new plan start date (yyyy-mm-dd): ";
	private final String MSG_ENTER_NEW_COMPLETE_DATE = "Enter new complete day: ";
	private Service service;
	
	@Override
	public void execute() {
		try (Scanner sc = new Scanner(System.in)){
			Printer.println(MSG_ENTER_ID);
			Integer tmpId = sc.nextInt();
			
			Printer.println(MSG_ENTER_NEW_PLAN_DATE);
			String tmpStartDate = sc.nextLine();
			
			Printer.println(MSG_ENTER_NEW_COMPLETE_DATE);
			String tmpCompleteDate = sc.nextLine();
			
			service.moveOrderDateComplete(tmpId, tmpStartDate, tmpCompleteDate);
			Printer.print(MSG_WAS + Messeges.Moved);
		} catch(Exception e){
			log.error(e);
			throw(e);
		}
	}

}
