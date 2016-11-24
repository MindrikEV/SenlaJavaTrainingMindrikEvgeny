package org.senlatraining.autoservice.util.parsers;

import org.senlatraining.autoservice.api.IParser;
import org.senlatraining.autoservice.manager.GarageManager;
import org.senlatraining.autoservice.entity.Garage;

public class ParserForGarages implements IParser{
	
	@Override
	public void parseFromFile(String[] array){
		GarageManager garageManager = new GarageManager();
		
		for(int i=0; i < array.length; i++){
			garageManager.add();
		}
	}
}