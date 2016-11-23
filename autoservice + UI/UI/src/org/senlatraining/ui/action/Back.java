package org.senlatraining.ui.action;

import org.senlatraining.ui.api.IAction;
import org.senlatraining.ui.menu.Menu;
import org.senlatraining.ui.navigator.Navigator;

public class Back implements IAction{
	private Navigator navigator;
	private JumpMenu jm;
	private Menu lastMenu = new Menu();;
	
	@Override
	public void execute() {
	
		jm = new JumpMenu(Menu lastMenu);
	}
	
}
