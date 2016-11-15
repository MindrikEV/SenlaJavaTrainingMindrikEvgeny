package org.senlatarining.ui.control;

import org.senlatraining.ui.builder.Builder;
import org.senlatraining.ui.navigator.Navigator;
import org.senlatraining.ui.menu.*;

public class MenuController {
	private Builder builder;
	private Navigator navigator;
	
	public void run(){
		builder.buildMenu();
		navigator.printMenu(builder.getRootMenu());
	}
}
