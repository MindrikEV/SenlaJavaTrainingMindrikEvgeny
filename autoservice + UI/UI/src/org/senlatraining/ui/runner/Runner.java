package org.senlatraining.ui.runner;

import org.senlatraining.autoservice.entity.Garage;
import org.senlatraining.autoservice.frontage.Service;
import org.senlatraining.autoservice.manager.GarageManager;
import org.senlatraining.autoservice.util.FileWorker;
import org.senlatraining.autoservice.util.Path;
import org.senlatraining.ui.control.MenuController;
import org.senlatraining.ui.util.Printer;

public class Runner {
public static void main(String[] args){
		
		//------------------------------------------------------------------------------
		Service ser = new Service();
		
		
		//------------------------------------------------------------------------------
	
	
		Path path = new Path();
		
		//System.out.println(path.getPathForGarage());
		try{
		FileWorker fw = new FileWorker(path.getPathForGarage());
		fw.pullFromFile();
		
		//GarageManager gm = new GarageManager();
		Printer printer = new Printer();
		printer.printList(ser.getListOfFreeGarages());
		
		} catch (Exception e){
			System.out.print(e.getMessage().toString());
		}
		//MenuController menuController = new MenuController();	
		//menuController.run();
	}
}
