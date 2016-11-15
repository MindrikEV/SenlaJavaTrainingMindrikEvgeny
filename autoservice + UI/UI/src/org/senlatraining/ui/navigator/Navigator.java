package org.senlatraining.ui.navigator;

import org.senlatraining.ui.menu.Menu;
import org.senlatraining.ui.util.Printer;
import org.senlatraining.ui.constants.*;

public class Navigator {
	private Menu currentMenu = new Menu();
	private Printer printer = new Printer();
	
	public void printMenu(Menu menu){
		printer.printStick();
		printer.print(Titles.AUTOSERVICE.toString());
		printer.printStick();
		printer.print(menu.getMenuName());
		printer.printStick();
		printer.printList(menu.getMenuItems());
		printer.printStick();
	}
//---------------------------------------------------------------
	/*public void navigate(Integer index){
		
	}*/
}
