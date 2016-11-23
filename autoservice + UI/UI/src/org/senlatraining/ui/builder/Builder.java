package org.senlatraining.ui.builder;

import org.apache.log4j.Logger;
import org.senlatraining.ui.action.*;
import org.senlatraining.ui.constants.Titles;
import org.senlatraining.ui.menu.*;
//import org.senlatraining.ui.api.*;

public class Builder {
	private static final Logger log = Logger.getLogger(Builder.class);
	private Menu  rootMenu = new Menu(Titles.Root.toString());
	private Menu  garagesMenu = new Menu(Titles.Garages.toString());
	private Menu  mastersMenu = new Menu(Titles.Masters.toString());
	private Menu  ordersMenu = new Menu(Titles.Orders.toString());
//	private Menu  sortMasterMenu = new Menu(Titles.SortMaters.toString());
	
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
			//mastersMenu.addMenuItem(new MenuItem(Titles.ShowSorted.toString(), new new ShowMastersSortedByAlphabet()));
			//mastersMenu.addMenuItem(new MenuItem(Titles.ShowOrder.toString(), new ShowMastersSortedByStatus()));
			mastersMenu.addMenuItem(new MenuItem(Titles.Add.toString(), new AddMaster()));
			mastersMenu.addMenuItem(new MenuItem(Titles.Remove.toString(), new RemoveGarage()));
			mastersMenu.addMenuItem(new MenuItem("Exit", new Exit()));
		//--------------------------------------------------------------------------------------------
			//ordersMenu.addMenuItem(new MenuItem(Titles.ShowList.toString(), new ShowListOfFreeGarages()));
			ordersMenu.addMenuItem(new MenuItem(Titles.Add.toString(), new AddOrder()));
			ordersMenu.addMenuItem(new MenuItem(Titles.Remove.toString(), new RemoveOrder()));
			ordersMenu.addMenuItem(new MenuItem(Titles.Close.toString(), new CloseOrder()));
			ordersMenu.addMenuItem(new MenuItem(Titles.Revoke.toString(), new RevokeOrder()));
			ordersMenu.addMenuItem(new MenuItem(Titles.Move.toString(), new MoveOrder()));
			ordersMenu.addMenuItem(new MenuItem("Exit", new Exit()));			
		} catch (RuntimeException e) {
			log.error(e);
		}	
	}
//-----------------------------------------------
	public Menu getRootMenu(){
		return rootMenu;
	}
}
