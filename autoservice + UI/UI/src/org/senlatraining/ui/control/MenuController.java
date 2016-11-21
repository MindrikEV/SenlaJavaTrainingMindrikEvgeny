package org.senlatraining.ui.control;

import org.senlatraining.autoservice.api.IService;
//import org.senlatraining.ui.action.AddGarage;
import org.senlatraining.ui.builder.Builder;
import org.senlatraining.ui.navigator.Navigator;

public class MenuController {
	private IService service; 
	private Builder builder = new Builder();
	private Navigator navigator = new Navigator();
	
	public void run(){
		
		builder.buildMenu();
		navigator.setCurrenMenu(builder.getRootMenu());
		navigator.printMenu();
	}
}
