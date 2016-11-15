package org.senlatraining.ui.builder;

import org.senlatraining.ui.constants.Titles;
import org.senlatraining.ui.menu.MenuItem;
import org.senlatraining.ui.menu.Menu;
//import org.senlatraining.ui.api.*;

public class Builder {
	private Menu rootMenu;
	//private IAction action;
	
	public void buildMenu(){
		try{
			MenuItem item1 = new MenuItem(Titles.GarageMenu.toString()); //,action.execute() 
			rootMenu.addMenuItem(item1);
		} catch (RuntimeException e) {
			throw e;
		}
	}
//-----------------------------------------------
	public Menu getRootMenu(){
		return rootMenu;
	}
}
