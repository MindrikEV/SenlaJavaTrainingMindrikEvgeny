package org.senlatraining.ui.action;

import org.senlatraining.ui.api.*;
import org.senlatraining.ui.util.Printer;
import org.senlatraining.autoservice.frontage.Service;

public class ShowListOfFreeGarages implements IAction{
	private final String MSG_FREE_GARAGES = "Free garages:";
	private Service service;
	
	@Override
	public void execute() {
		Printer.println(MSG_FREE_GARAGES);
		Printer.printList(service.getListOfFreeGarages());

	}
	
}
