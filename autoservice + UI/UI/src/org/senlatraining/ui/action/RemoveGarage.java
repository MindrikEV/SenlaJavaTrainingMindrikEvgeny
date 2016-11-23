package org.senlatraining.ui.action;

import java.util.Scanner;

import org.apache.log4j.Logger;
import org.senlatraining.autoservice.api.IService;
import org.senlatraining.autoservice.frontage.Service;
import org.senlatraining.ui.api.IAction;
import org.senlatraining.ui.builder.Builder;
import org.senlatraining.ui.constants.Messeges;
import org.senlatraining.ui.navigator.Navigator;
import org.senlatraining.ui.util.Printer;

public class RemoveGarage implements IAction{
	private static final Logger log = Logger.getLogger(RemoveGarage.class);
	private final String MSG_NOT_FOUND_GARAGE = "Garage with this number not found. Try another!";
	private final String MSG_ENTER_NUM = "Type number -> ";
	private final String MSG_GARAGE = "Garage number - ";
	private Service service = new Service();
	private Printer printer = new Printer(); 
		
	@Override
	public void execute() {
		printer.print(MSG_ENTER_NUM);
		try (Scanner sc = new Scanner(System.in)){
			Integer number = Integer.valueOf(sc.nextLine());
		
			Boolean f = service.removeGarage(number);
			if(!f){
				System.out.print(MSG_NOT_FOUND_GARAGE);
			} else {
				printer.print(MSG_GARAGE + number + Messeges.Removed.toString());
			}
		} catch(NullPointerException ne){
			log.error(ne);
			throw(ne);
		}	
	}
}
