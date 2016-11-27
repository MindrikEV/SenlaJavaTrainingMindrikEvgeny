package org.senlatraining.ui.navigator;

import java.util.Scanner;
import org.apache.log4j.Logger;
import org.senlatraining.ui.menu.*;
import org.senlatraining.ui.util.Printer;
import org.senlatraining.ui.builder.Builder;
import org.senlatraining.ui.constants.*;

public class Navigator {
	private static final Logger log = Logger.getLogger(Builder.class);
	private final String MSG_MENU = "Menu: ";
	private final String MSG_ENT_NUM_ITEM = "Enter the number of item > ";
	private Menu currentMenu = new Menu();
	
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
			Printer.println(Titles.A_U_T_O_S_E_R_V_I_C_E.toString());
			Printer.println(MSG_MENU + currentMenu.getMenuName());
			Printer.printStick();
			Printer.printMenu(currentMenu.getMenuItems());
			Printer.printStick();
			Printer.print(MSG_ENT_NUM_ITEM);
			
			scanItemNumber();
		} catch (NullPointerException e){
			log.error(e);
		}
	}
//---------------------------------------------------------------
	public void navigate(Integer index){
		currentMenu.getMenuItems().get(index - 1).doAction();
	}
//---------------------------------------------------------------
	public void scanItemNumber(){
		try (Scanner sc = new Scanner(System.in)){
			navigate(sc.nextInt());
			
		} catch(Exception e){
			log.error(e);
		}	
	}
}