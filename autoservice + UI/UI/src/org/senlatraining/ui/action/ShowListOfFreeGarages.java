package org.senlatraining.ui.action;

import org.senlatraining.ui.api.*;
import org.senlatraining.autoservice.api.IService;

public class ShowListOfFreeGarages implements IAction{
	private IService service;
	
	@Override
	public void execute() {
		service.showListOfFreeGarages();
	}
	
}
