package org.senlatraining.autoservice.util.parsers;

import org.senlatraining.autoservice.manager.MasterManager;
import org.senlatraining.autoservice.util.FileWorker;
import org.senlatraining.autoservice.api.IParser;
import org.senlatraining.autoservice.entity.Master;

public class ParserForMasters implements IParser {
	
	@Override
	public void parseFromFile(String[] array){
		MasterManager masterManager = new MasterManager();
		FileWorker fileOperator = new FileWorker(masterManager.getPath());
		Integer size = fileOperator.pullFromFile().length;
		String tempName;
		String tempSurName;
		Boolean tempStatus;
		
		for(int i=0; i < size; i++){
			String[] s = fileOperator.pullFromFile()[i].split(SPLITTER);
			tempName = s[0];
			tempSurName = s[1];
			tempStatus = Boolean.valueOf(s[2]);
			
			Master master = new Master(tempName, tempSurName);
			master.setStatus(tempStatus);
			
			masterManager.add(master);
		}
	}
}
