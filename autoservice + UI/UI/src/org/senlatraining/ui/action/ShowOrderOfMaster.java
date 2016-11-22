package org.senlatraining.ui.action;

import java.util.Scanner;

import org.senlatraining.autoservice.api.IService;
import org.senlatraining.autoservice.frontage.Service;
import org.senlatraining.ui.api.IAction;
import org.senlatraining.ui.util.Printer;

public class ShowOrderOfMaster implements IAction{
	private Service service = new Service();
	private Scanner sc = new Scanner(System.in);
	private Printer printer = new Printer();
	
	@Override
	public void execute() {
		String surName = sc.nextLine();
		printer.print(service.getOrderOfMaster(surName));
	}

}
