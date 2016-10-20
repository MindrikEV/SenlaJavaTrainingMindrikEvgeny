package org.senlatraining.autoservice.util.parsers;

import org.senlatraining.autoservice.manager.MasterManager;
import org.senlatraining.autoservice.util.FileWorker;
import org.senlatraining.autoservice.entity.Master;

public class ParserForMasters {
	public void getFromFile(String[] array){
		MasterManager masterManager = new MasterManager();
		FileWorker fileOperator = new FileWorker(masterManager.getPath());
		Integer size = fileOperator.pullFromFile().length;
		String tempSurName;
		Boolean tempStatus;
		
		for(int i=0; i < size; i++){
			
			tempName =;
			tempSurName =;
			tempStatus =;
			
			Master master = new Master(tempName, tempSurName);
			master.setStatus(tempStatus);
			masterManager.add(master);
		}
	}
}
