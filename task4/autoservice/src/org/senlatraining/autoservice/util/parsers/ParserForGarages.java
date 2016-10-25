package org.senlatraining.autoservice.util.parsers;

import org.senlatraining.autoservice.api.IParser;
import org.senlatraining.autoservice.manager.GarageManager;
import org.senlatraining.autoservice.entity.*;

public class ParserForGarages implements IParser{
	
	@Override
	public void parseFromFile(String[] array){
		GarageManager garageManager = new GarageManager();
		Integer size = array.length;
		
		for(int i=0; i < size; i++){
			String[] s = array[i].split(SPLITTER);
			Garage garage = new Garage();
			garage.setStatus(Boolean.valueOf(s[1]));
			
			garageManager.add(garage);
		}
	}
}