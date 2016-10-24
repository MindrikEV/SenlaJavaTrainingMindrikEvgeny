package org.senlatraining.autoservice.runner;

import org.senlatraining.autoservice.manager.Recover;

public class Runner {
	public static void main(String[] args){
		
		//Stuffer stuffer = new Stuffer();
		//stuffer.stuff();
		
		Recover recover = Recover();
		recover.createEntityFromFile(masterPath, parserForMaster);
		recover.createEntityFromFile(masterPath, parserForMaster);
		recover.createEntityFromFile(masterPath, parserForMaster);
	}
}
