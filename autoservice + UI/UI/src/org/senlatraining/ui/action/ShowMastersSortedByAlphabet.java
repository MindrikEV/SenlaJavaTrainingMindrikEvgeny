package org.senlatraining.ui.action;

import org.senlatraining.autoservice.frontage.Service;
import org.senlatraining.ui.api.IAction;
import org.senlatraining.ui.util.Printer;

public class ShowMastersSortedByAlphabet implements IAction{
	private final String MSG_MASTERS_ALPH = "Masters sorted by alphabet: ";
	private Service service;
		
	@Override
	public void execute() {
		Printer.println(MSG_MASTERS_ALPH);
		Printer.printList(service.sortListOfMastersByAlphabet());
	}
}