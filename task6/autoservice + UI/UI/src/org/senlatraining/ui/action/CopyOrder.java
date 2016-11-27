package org.senlatraining.ui.action;

import java.util.Scanner;

import org.apache.log4j.Logger;
import org.senlatraining.autoservice.frontage.Service;
import org.senlatraining.ui.api.IAction;
import org.senlatraining.ui.util.Printer;

public class CopyOrder implements IAction{
	private static final Logger log = Logger.getLogger(CopyOrder.class);
	private final String MSG_ENTER_INDEX = "Enter the index of order: ";
	private Service service;
	
	@Override
	public void execute() {
		try (Scanner sc = new Scanner(System.in)){
			Printer.println(MSG_ENTER_INDEX);
			service.copyOrder(sc.nextInt());
		} catch(Exception e){
			log.error(e);
			throw(e);
		}
	}

}
