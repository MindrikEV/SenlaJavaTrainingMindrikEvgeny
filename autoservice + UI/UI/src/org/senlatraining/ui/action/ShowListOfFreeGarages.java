package org.senlatraining.ui.action;

import org.senlatraining.ui.api.*;
import org.senlatraining.ui.util.Printer;
//import org.senlatraining.autoservice.api.IService;
import org.senlatraining.autoservice.frontage.Service;

public class ShowListOfFreeGarages implements IAction{
	private Service service;
	private Printer printer = new Printer();
	
	public void execute() {
		service = new Service();
		printer.printList(service.getListOfFreeGarages());
	}
	
}
