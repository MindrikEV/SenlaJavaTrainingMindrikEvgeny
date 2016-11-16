package org.senlatraining.ui.builder;

import org.apache.log4j.Logger;
import org.senlatraining.ui.action.Exit;
import org.senlatraining.ui.action.JumpMenu;
import org.senlatraining.ui.constants.Titles;
import org.senlatraining.ui.menu.MenuItem;
import org.senlatraining.ui.menu.Menu;
//import org.senlatraining.ui.api.*;

public class Builder {
	private static final Logger log = Logger.getLogger(Builder.class);
	private Menu rootMenu, ordersMenu, mastersMenu, garagesMenu;
	//private JumpMenu;
	//private IAction action;
	
	public Menu buildMenu(){
		
		Menu menu = new Menu(Titles.Root.toString());	
		try{
			menu.addMenuItem(new MenuItem(Titles.Garages.toString(), new JumpMenu(menu)));
			menu.addMenuItem(new MenuItem(Titles.Masters.toString(), new JumpMenu(menu)));
			menu.addMenuItem(new MenuItem(Titles.Orders.toString(), new JumpMenu(menu)));
			menu.addMenuItem(new MenuItem("Exit", new Exit()));
		} catch (RuntimeException e) {
			log.error(e);
		}
		return menu;
	}
//-----------------------------------------------
	public Menu getRootMenu(){
		return rootMenu;
	}
//-----------------------------------------------
}
