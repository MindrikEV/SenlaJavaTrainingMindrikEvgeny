package org.senlatraining.autoservice.util.parsers;

import org.senlatraining.autoservice.entity.Garage;
import org.senlatraining.autoservice.manager.GarageManager;
import org.senlatraining.autoservice.util.FileWorker;

public class ParserForGarages {
	public void getFromFile(String[] array){
		GarageManager garageManager = new GarageManager();
		FileWorker fileOperator = new FileWorker(garageManager.getPath());
		Integer size = fileOperator.pullFromFile().length;
		//Integer tempId;
		Boolean tempStatus;
		
		for(int i=0; i < size; i++){
			String[] s = fileOperator.pullFromFile()[i].split("|");
			//tempId = s[0];
			tempStatus = Boolean.valueOf(s[1]);
			
			Garage garage = new Garage();
			garage.setStatus(tempStatus);
		}
	}
}
