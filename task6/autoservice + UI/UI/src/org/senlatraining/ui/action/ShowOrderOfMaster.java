package org.senlatraining.ui.action;

import java.util.Scanner;

import org.senlatraining.autoservice.api.IService;
import org.senlatraining.autoservice.frontage.Service;
import org.senlatraining.ui.api.IAction;
import org.senlatraining.ui.util.Printer;

public class ShowOrderOfMaster implements IAction{
	private Service service;
	private Scanner sc = new Scanner(System.in);
	
	@Override
	public void execute() {
		String surName = sc.nextLine();
		Printer.print(service.getOrderOfMaster(surName));
	}

}
