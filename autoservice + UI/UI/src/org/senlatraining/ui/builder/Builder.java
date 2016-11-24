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
	private Menu  sortOrdersMenu = new Menu(Titles.SortOrders.toString());
	private Menu  sortExecutableOrdersMenu = new Menu(Titles.SortExecutableOrders.toString());
	
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
			mastersMenu.addMenuItem(new MenuItem(Titles.SortByAlpabet.toString(), new ShowMastersSortedByAlphabet()));
			mastersMenu.addMenuItem(new MenuItem(Titles.SortByStatus.toString(), new ShowMastersSortedByStatus()));
			mastersMenu.addMenuItem(new MenuItem(Titles.Add.toString(), new AddMaster()));
			mastersMenu.addMenuItem(new MenuItem(Titles.Remove.toString(), new RemoveGarage()));
			mastersMenu.addMenuItem(new MenuItem("Exit", new Exit()));
		//--------------------------------------------------------------------------------------------
			ordersMenu.addMenuItem(new MenuItem(Titles.ShowListOfOrders.toString(), new JumpMenu(sortOrdersMenu)));
			ordersMenu.addMenuItem(new MenuItem(Titles.Add.toString(), new AddOrder()));
			ordersMenu.addMenuItem(new MenuItem(Titles.Remove.toString(), new RemoveOrder()));
			ordersMenu.addMenuItem(new MenuItem(Titles.Close.toString(), new CloseOrder()));
			ordersMenu.addMenuItem(new MenuItem(Titles.Revoke.toString(), new RevokeOrder()));
			ordersMenu.addMenuItem(new MenuItem(Titles.Move.toString(), new MoveOrder()));
			ordersMenu.addMenuItem(new MenuItem(Titles.ShowAmountOfFreePlacesOnDate.toString(), new ShowAmountOfFreePlacesOnDate()));
			ordersMenu.addMenuItem(new MenuItem("Exit", new Exit()));		
		//--------------------------------------------------------------------------------------------
			sortOrdersMenu.addMenuItem(new MenuItem(Titles.SortByDateRegistration.toString(), new ShowOrdersSortedByDateRegistration()));
			sortOrdersMenu.addMenuItem(new MenuItem(Titles.SortByDateComplete.toString(), new ShowOrdersSortedByDateComplete()));
			sortOrdersMenu.addMenuItem(new MenuItem(Titles.SortByDatePlanStart.toString(), new ShowOrdersSortedByDatePlanStart()));
			sortOrdersMenu.addMenuItem(new MenuItem(Titles.SortByDatePrice.toString(), new ShowListOfOrdersSortedByPrice()));
		//--------------------------------------------------------------------------------------------
			sortExecutableOrdersMenu.addMenuItem(new MenuItem(Titles.SortByDateRegistration.toString(), new ShowExecutableOrdersSortedByDateRegistration()));
			sortExecutableOrdersMenu.addMenuItem(new MenuItem(Titles.SortByDateComplete.toString(), new ShowExecutableOrdersSortedByDateComplete()));
			sortExecutableOrdersMenu.addMenuItem(new MenuItem(Titles.SortByDatePlanStart.toString(), new ShowExecutableOrdersSortedByPrice()));
		} catch (RuntimeException e) {
			log.error(e);
		}	
	}
//-----------------------------------------------
	public Menu getRootMenu(){
		return rootMenu;
	}
}
