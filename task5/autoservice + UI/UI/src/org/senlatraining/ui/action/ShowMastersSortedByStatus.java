package org.senlatraining.ui.action;

import org.senlatraining.autoservice.frontage.Service;
import org.senlatraining.ui.api.IAction;
import org.senlatraining.ui.util.Printer;

public class ShowMastersSortedByStatus implements IAction{
	private final String MSG_MASTERS_STATUS = "Masters sorted by status: ";
	private Service service;
		
	@Override
	public void execute() {
		Printer.println(MSG_MASTERS_STATUS);
		Printer.printList(service.sortListOfMastersByStatus());
	}
}
