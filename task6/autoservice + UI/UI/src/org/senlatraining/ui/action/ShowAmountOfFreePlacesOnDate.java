package org.senlatraining.ui.action;

import java.util.Scanner;

import org.apache.log4j.Logger;
import org.senlatraining.autoservice.frontage.Service;
import org.senlatraining.ui.api.IAction;
import org.senlatraining.ui.util.Printer;

public class ShowAmountOfFreePlacesOnDate implements IAction{
	private static final Logger log = Logger.getLogger(ShowAmountOfFreePlacesOnDate.class);
	private final String MSG_ENTER_DATE = "Please, enter date:";
	private final String MSG_AMOUNT_OF_FREE_ON_DATE = "Amount of free places on date:";
	private Service service;
	
	@Override
	public void execute() {
		Printer.println(MSG_AMOUNT_OF_FREE_ON_DATE);
		
		try (Scanner sc = new Scanner(System.in)){
			Printer.println(MSG_ENTER_DATE);
			Printer.println(service.getAmountOfFreePlacesOnDate(sc.nextLine()));
		} catch (NullPointerException npe){
			
		}
	}
}
