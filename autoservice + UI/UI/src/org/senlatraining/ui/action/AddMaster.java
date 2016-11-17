package org.senlatraining.ui.action;

import org.senlatraining.autoservice.api.IService;
import org.senlatraining.ui.api.IAction;
import org.senlatraining.ui.util.Printer;
//import org.senlatraining.ui.util.Reader;

public class AddMaster implements IAction{
	private final String MSG_TYPE_NAME = "Please, type name -> ";
	private final String MSG_TYPE_SURNAME = "Please, type surname -> ";
	private Printer printer = new Printer();
	//private Reader reader = new Reader();
	private IService service;

	@Override
	public void execute() {
		//printer.print(MSG_TYPE_NAME);
		//String tmpName = reader.scanValue();
		//printer.print(MSG_TYPE_SURNAME);
		//String tmpSurName = reader.scanValue();
		
		//service.addNewMaster(tmpName, tmpSurName);
	}

}
