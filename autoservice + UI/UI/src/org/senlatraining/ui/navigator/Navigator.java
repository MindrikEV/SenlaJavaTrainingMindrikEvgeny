package org.senlatraining.ui.navigator;

import org.senlatraining.ui.menu.*;
import org.senlatraining.ui.util.Printer;
import org.apache.log4j.Logger;
import org.senlatraining.ui.builder.Builder;
import org.senlatraining.ui.constants.*;

public class Navigator {
	private final String MSG_MENU = "Menu: ";
	private final String MSG_ENT_CMD = "Enter the command > ";
	private static final Logger log = Logger.getLogger(Builder.class);
	private Menu currentMenu = new Menu();
	private Printer printer = new Printer();
	
	public void setCurrenMenu(Menu currentMenu){
		this.currentMenu = currentMenu;
	}
//---------------------------------------------------------------
	public Menu getCurrentMenu(){
		return currentMenu;
	}
//---------------------------------------------------------------	
	public void printMenu(){
		try {
			printer.print(Titles.A_U_T_O_S_E_R_V_I_C_E.toString());
			printer.print(MSG_MENU + currentMenu.getMenuName());
			printer.printStick();
			printer.printMenu(currentMenu.getMenuItems());
			printer.printStick();
			printer.print(MSG_ENT_CMD);
		} catch (NullPointerException e){
			log.error(e);
		}
	}
//---------------------------------------------------------------
	public void navigate(Integer index){
		currentMenu.getMenuItems().get(index - 1).doAction();;	
	}
}
