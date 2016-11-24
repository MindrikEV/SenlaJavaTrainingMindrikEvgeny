package org.senlatraining.ui.action;

import java.util.Scanner;

import org.apache.log4j.Logger;
import org.senlatraining.autoservice.frontage.Service;
import org.senlatraining.ui.api.IAction;
import org.senlatraining.ui.constants.Messeges;
import org.senlatraining.ui.util.Printer;

public class RemoveMaster implements IAction{
	private static final Logger log = Logger.getLogger(RemoveGarage.class);
	private final String MSG_NOT_FOUND_MASTER = "Master with this surname not found. Try another!";
	private final String MSG_ENTER_SURNAME = "Enter surname of master -> ";
	private Service service;
	
	@Override
	public void execute() {
		Printer.print(MSG_ENTER_SURNAME);
		try (Scanner sc = new Scanner(System.in)){
			Boolean f = service.removeMaster(sc.nextLine());
			if(!f){
				System.out.print(MSG_NOT_FOUND_MASTER);
			} else {
				Printer.print(sc.nextLine() + Messeges.Removed.toString());
			}
		} catch(NullPointerException ne){
			log.error(ne);
			throw(ne);
		}	
	}
}
