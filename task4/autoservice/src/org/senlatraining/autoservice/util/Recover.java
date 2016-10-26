package org.senlatraining.autoservice.util;

import org.senlatraining.autoservice.api.IParser;
import org.senlatraining.autoservice.util.parsers.*;
import org.senlatraining.autoservice.manager.*;
import org.senlatraining.autoservice.util.Path;

public class Recover {	
	private ArrayWorker arrayWorker = new ArrayWorker();
	private Path path = new Path(); 
	private FileWorker fileOperator;
	private ParserForMasters parserForMaster = new ParserForMasters();
	private ParserForOrders parserForOrders = new ParserForOrders();
	private ParserForGarages parserForGarages = new ParserForGarages();
	
/*	public void recoverFromFile(Path path){
		fileOperator = new FileWorker(path.);
		parserForMaster.parseFromFile(fileOperator.pullFromFile());
	}*/
	
	public void createMastersFromFile(){
		fileOperator = new FileWorker(path.getPathForMaster());
		parserForMaster.parseFromFile(fileOperator.pullFromFile());
	}
//----------------------------------------------------------------------------	
	public void createOrdersFromFile(){
		fileOperator = new FileWorker(path.getPathForOrder());
		parserForOrders.parseFromFile(fileOperator.pullFromFile());
	}
//----------------------------------------------------------------------------	
	public void createGaragesFromFile(){	
		fileOperator = new FileWorker(path.getPathForGarage());
		parserForGarages.parseFromFile(fileOperator.pullFromFile());
	}
}