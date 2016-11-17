package org.senlatraining.ui.action;

import org.senlatraining.ui.api.IAction;
import org.senlatraining.ui.util.Printer;;

public class Exit implements IAction{
	private Printer printer = new Printer();
	private final String MSG_ABOUT_EXIT = "Good buy!";
	
	public void execute(){
		printer.println(MSG_ABOUT_EXIT);
		System.exit(0);
	} 
}
