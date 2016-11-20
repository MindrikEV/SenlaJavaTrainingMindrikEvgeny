package org.senlatraining.ui.action;

import org.senlatraining.ui.api.*;
import org.senlatraining.ui.util.Printer;
import org.senlatraining.autoservice.api.IService;

public class ShowListOfFreeGarages implements IAction{
	//private IService service;
	private Printer printer = new Printer();
	
	public void execute() {
		IService service = Service();
		printer.printList(service.getListOfFreeGarages());
	}
	
}
