package org.senlatraining.autoservice.util.parsers;

import org.senlatraining.autoservice.api.IParser;
import org.senlatraining.autoservice.manager.GarageManager;
import org.senlatraining.autoservice.entity.Garage;

public class ParserForGarages implements IParser{
	
	@Override
	public void parseFromFile(String[] array){
		GarageManager garageManager = new GarageManager();
		
		for(int i=0; i < array.length; i++){
			//String[] s = array[i].split(SPLITTER);
			//Garage garage = new Garage();
			//garage.setNumberOfGarage(Integer.valueOf(s[0]));
			//garage.setStatus(Boolean.valueOf(s[1]));
			
			garageManager.add();
		}
	}
}