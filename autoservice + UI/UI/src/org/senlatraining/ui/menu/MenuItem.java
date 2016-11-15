package org.senlatraining.ui.menu;

import org.senlatraining.ui.api.IAction;

public class MenuItem {
	private String title = new String();
	private IAction action;
	private Menu nextMenu = new Menu();
	
	public MenuItem(String title){ //, IAction action
		this.title = title;
		//this.action = action;
		//this.nextMenu = nextMenu;
	}
//--------------------------------------------------------	
	public void doAction(){
		action.execute();
	}
//--------------------------------------------------------
	@Override
	public String toString(){
		return this.title;
	}
//--------------------------------------------------------
	public Menu getNextMenu(){
		return this.nextMenu;
	}
}
