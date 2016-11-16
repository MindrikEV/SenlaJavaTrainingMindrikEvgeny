package org.senlatraining.ui.builder;

import org.apache.log4j.Logger;
import org.senlatraining.ui.action.AddGarage;
import org.senlatraining.ui.action.Exit;
import org.senlatraining.ui.action.JumpMenu;
import org.senlatraining.ui.action.RemoveGarage;
import org.senlatraining.ui.action.ShowListOfFreeGarages;
import org.senlatraining.ui.action.ShowMastersSortedByAlphabet;
import org.senlatraining.ui.action.ShowMastersSortedByStatus;
import org.senlatraining.ui.action.ShowOrderOfMaster;
import org.senlatraining.ui.constants.Titles;
import org.senlatraining.ui.menu.MenuItem;
import org.senlatraining.ui.menu.Menu;
import org.senlatraining.ui.api.*;

public class Builder {
	private static final Logger log = Logger.getLogger(Builder.class);
	private Menu  rootMenu = new Menu(Titles.Root.toString());
	private Menu  garagesMenu = new Menu(Titles.Garages.toString());
	private Menu  mastersMenu = new Menu(Titles.Masters.toString());
	private Menu  ordersMenu = new Menu(Titles.Orders.toString());
	private Menu  sortMasterMenu = new Menu(Titles.SortMaters.toString());
	
	public void buildMenu(){	
		try{
			rootMenu.addMenuItem(new MenuItem(Titles.Garages.toString(), new JumpMenu(garagesMenu)));
			rootMenu.addMenuItem(new MenuItem(Titles.Masters.toString(), new JumpMenu(mastersMenu)));
			rootMenu.addMenuItem(new MenuItem(Titles.Orders.toString(), new JumpMenu(ordersMenu)));
			rootMenu.addMenuItem(new MenuItem("Exit", new Exit()));
		//--------------------------------------------------------------------------------------------
			garagesMenu.addMenuItem(new MenuItem(Titles.ShowList.toString(), new ShowListOfFreeGarages()));
			garagesMenu.addMenuItem(new MenuItem(Titles.Add.toString(), new AddGarage()));
			garagesMenu.addMenuItem(new MenuItem(Titles.Remove.toString(), new RemoveGarage()));
			garagesMenu.addMenuItem(new MenuItem("Exit", new Exit()));
		//--------------------------------------------------------------------------------------------
			mastersMenu.addMenuItem(new MenuItem(Titles.ShowSorted.toString(), new JumpMenu(sortMasterMenu)));
			mastersMenu.addMenuItem(new MenuItem(Titles.ShowOrder.toString(), new ShowOrderOfMaster()));
			mastersMenu.addMenuItem(new MenuItem(Titles.Add.toString(), new AddGarage()));
			mastersMenu.addMenuItem(new MenuItem(Titles.Remove.toString(), new RemoveGarage()));
			mastersMenu.addMenuItem(new MenuItem("Exit", new Exit()));
		//--------------------------------------------------------------------------------------------
			ordersMenu.addMenuItem(new MenuItem(Titles.ShowList.toString(), new ShowListOfFreeGarages()));
			ordersMenu.addMenuItem(new MenuItem(Titles.Add.toString(), new AddGarage()));
			ordersMenu.addMenuItem(new MenuItem(Titles.Remove.toString(), new RemoveGarage()));
			ordersMenu.addMenuItem(new MenuItem("Exit", new Exit()));
		//--------------------------------------------------------------------------------------------
			sortMasterMenu.addMenuItem(new MenuItem(Titles.SortByAlpabet.toString(), new ShowMastersSortedByAlphabet()));
			sortMasterMenu.addMenuItem(new MenuItem(Titles.SortByStatus.toString(), new ShowMastersSortedByStatus()));
			sortMasterMenu.addMenuItem(new MenuItem("Exit", new Exit()));
			
		} catch (RuntimeException e) {
			log.error(e);
		}
		
	}
//-----------------------------------------------
	public Menu getRootMenu(){
		return rootMenu;
	}
//-----------------------------------------------
}
