package org.senlatraining.autoservice.util.parsers;

import org.senlatraining.autoservice.manager.MasterManager;
import org.senlatraining.autoservice.api.IParser;
import org.senlatraining.autoservice.entity.Master;

public class ParserForMasters implements IParser {
	
	@Override
	public void parseFromFile(String[] array){
		MasterManager masterManager = new MasterManager();
		
		for(int i=0; i < array.length; i++){
			String[] s = array[i].split(SPLITTER);
			Master master = new Master(s[0],s[1]);					//s[o] - Name  s[1] - SurName 
			master.setStatus(Boolean.valueOf(s[2]));				//s[2] - Status
			
			masterManager.add(master);	
		}
	}
}
