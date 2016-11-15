package org.senlatraining.ui.builder;

import org.senlatraining.ui.constants.Titles;
import org.senlatraining.ui.menu.*;

public class Builder {
	private Menu rootMenu;
	
	public void buildMenu(){
		MenuItem item1 = MenuItem(Titles.GarageMenu.toString(),);
		rootMenu.addMenuItem(menuItem);
	}
//-----------------------------------------------
	public Menu getRootMenu(){
		return rootMenu;
	}
}
