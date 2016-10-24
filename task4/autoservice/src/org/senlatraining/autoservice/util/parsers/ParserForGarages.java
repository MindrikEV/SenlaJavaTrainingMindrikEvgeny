package org.senlatraining.autoservice.util.parsers;

import org.senlatraining.autoservice.api.IParser;
import org.senlatraining.autoservice.entity.Garage;
import org.senlatraining.autoservice.manager.GarageManager;
import org.senlatraining.autoservice.util.FileWorker;
import org.senlatraining.autoservice.entity.Path;

public class ParserForGarages implements IParser{
	
	@Override
	public void parseFromFile(String[] array){
		GarageManager garageManager = new GarageManager();
		Path path = new Path();
		FileWorker fileOperator = new FileWorker(path.getPathForGarage());
		Integer size = fileOperator.pullFromFile().length;
		Boolean tempStatus;
		
		for(int i=0; i < size; i++){
			String[] s = fileOperator.pullFromFile()[i].split(SPLITTER);
			tempStatus = Boolean.valueOf(s[1]);
			
			Garage garage = new Garage();
			garage.setStatus(tempStatus);
			
			garageManager.add(garage);
		}
	}
}
