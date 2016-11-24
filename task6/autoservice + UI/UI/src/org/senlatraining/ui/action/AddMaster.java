package org.senlatraining.ui.action;

import java.util.Scanner;

import org.apache.log4j.Logger;
//import org.senlatraining.autoservice.api.IService;
import org.senlatraining.autoservice.frontage.Service;
import org.senlatraining.ui.api.IAction;
import org.senlatraining.ui.constants.Messeges;
import org.senlatraining.ui.util.Printer;

public class AddMaster implements IAction{
	private static final Logger log = Logger.getLogger(AddGarage.class);
	private final String MSG_ENTER_NAME = "Please, enter name -> ";
	private final String MSG_ENTER_SURNAME = "Please, enter surname -> ";
	//private final String ERR_NOT_ADDED = "Master didn't add. Try again!";
	//private final String MSG_MASTER = "Master is ";
	private Service service;

	@Override
	public void execute() {
		try (Scanner sc = new Scanner(System.in)){
			Printer.print(MSG_ENTER_NAME);
			String tmpName = sc.nextLine();
			Printer.print(MSG_ENTER_SURNAME);
			String tmpSurName = sc.nextLine();
		
			service.addNewMaster(tmpName, tmpSurName);
			//if(!f){
			//	printer.print(ERR_NOT_ADDED);
			//} else {
				Printer.print(tmpSurName + Messeges.Added);
			//}
		} catch (Exception e){
			log.error(e);
			throw(e);
		}
	}

}