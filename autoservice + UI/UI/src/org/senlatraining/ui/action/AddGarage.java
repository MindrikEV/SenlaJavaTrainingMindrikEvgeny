package org.senlatraining.ui.action;

import org.senlatraining.autoservice.api.IService;
import org.senlatraining.ui.api.IAction;
import org.senlatraining.ui.util.Printer;
import org.apache.log4j.Logger;

public class AddGarage implements IAction{
	private static final Logger log = Logger.getLogger(AddGarage.class);
	private final String MSG_WAS_ADDED = "New garage was added!";
	private IService service;
	private Printer printer;
	
	@Override
	public void execute() {
		try{
		service.addNewGarage();
		} catch(NullPointerException ne){
			log.error(ne);
		}
		printer.print(MSG_WAS_ADDED);
	}
	
}
