package org.senlatraining.ui.action;

import org.senlatraining.ui.api.IAction;
import org.senlatraining.ui.navigator.Navigator;
import org.senlatraining.ui.menu.*;

public class JumpMenu implements IAction{
	private Menu menu = new Menu();
	
	public JumpMenu(Menu menu){
		this.menu = menu;
	}
//---------------------------------------------------	
	@Override
	public void execute() {
		Navigator navigator = new Navigator();
		navigator.setCurrenMenu(this.menu);
		//System.console().flush();
		navigator.printMenu();
	}

}
