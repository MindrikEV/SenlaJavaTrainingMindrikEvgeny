package org.senlatraining.autoservice.util.parsers;

import org.senlatraining.autoservice.manager.MasterManager;
import org.senlatraining.autoservice.api.IParser;
import org.senlatraining.autoservice.entity.Master;

public class ParserForMasters implements IParser {
	
	@Override
	public void parseFromFile(String[] array){
		MasterManager masterManager = new MasterManager();
		
		for(int i=0; i < array.length; i++){
			String[] s = array[i].split(SPLITTER); //s[o] - Name  s[1] - SurName //s[2] - Status						
			masterManager.add(s[0],s[1]);	
		}
	}
}
