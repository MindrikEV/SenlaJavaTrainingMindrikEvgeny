package org.senlatraining.autoservice.util.parsers;

import org.senlatraining.autoservice.manager.MasterManager;
import org.senlatraining.autoservice.api.IParser;
import org.senlatraining.autoservice.entity.*;

public class ParserForMasters implements IParser {
	
	@Override
	public void parseFromFile(String[] array){
		MasterManager masterManager = new MasterManager();
		Integer size = array.length;
		
		for(int i=0; i < size; i++){
			String[] s = array[i].split(SPLITTER);
			Master master = new Master(s[0],s[1]);					//s[o] - Name  s[1] - SurName 
			master.setStatus(Boolean.valueOf(s[2]));			//s[2] - Status
			
			System.out.println(master.getName() + master.getSurName() + master.getStatus());
			
			masterManager.add(master);	
		}
	}
}
