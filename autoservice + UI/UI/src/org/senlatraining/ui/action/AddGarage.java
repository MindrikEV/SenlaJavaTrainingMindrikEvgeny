package org.senlatraining.ui.action;

import org.senlatraining.autoservice.api.IService;
import org.senlatraining.ui.api.IAction;

public class AddGarage implements IAction{
	private IService service;
	
	@Override
	public void execute() {
		service.addNewGarage();
	}
	
}
