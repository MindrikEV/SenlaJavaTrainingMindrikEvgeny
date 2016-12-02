package org.senlatraining.ui.runner;

//import org.senlatraining.autoservice.entity.Garage;
import org.senlatraining.autoservice.frontage.Service;
import org.senlatraining.ui.control.MenuController;
//import org.senlatraining.ui.util.Printer;

public class Runner {
public static void main(String[] args){
		
		Service service = null;
		service.addNewGarage();
		service.addNewGarage();
		service.addNewGarage();
		service.addNewGarage();
		service.addNewGarage();
		service.addNewGarage();
		service.addNewGarage();
		service.addNewGarage();
		
		MenuController menuController = new MenuController();	
		menuController.run();
	}
}
