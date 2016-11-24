package org.senlatraining.ui.action;

import org.senlatraining.ui.api.IAction;
import org.senlatraining.ui.util.Printer;;

public class Exit implements IAction{
	private final String GOOD_BY = "Good buy!";
	
	public void execute(){
		Printer.println(GOOD_BY);
		System.exit(0);
	} 
}
