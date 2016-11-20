package org.senlatraining.ui.action;

import org.apache.log4j.Logger;
import org.senlatraining.autoservice.api.IService;
import org.senlatraining.ui.api.IAction;
import org.senlatraining.ui.builder.Builder;
import org.senlatraining.ui.constants.Messeges;
import org.senlatraining.ui.navigator.Navigator;
import org.senlatraining.ui.util.Printer;

public class RemoveGarage implements IAction{
	private static final Logger log = Logger.getLogger(RemoveGarage.class);
	private final String MSG_TYPE_NUM = "Type number -> ";
	private IService service;
	private Navigator navigator = new Navigator();
	private Printer printer = new Printer(); 
		
	@Override
	public void execute() {
		printer.print(MSG_TYPE_NUM);
		try{
			Integer number = Integer.valueOf(navigator.scanValue());
			
			service.removeGarage(number);
			printer.print(Messeges.Removed.toString());
		} catch(NullPointerException ne){
			log.error(ne);
		}	
	}
	
	
}
