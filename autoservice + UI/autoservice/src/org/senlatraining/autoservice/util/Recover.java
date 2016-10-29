package org.senlatraining.autoservice.util;

import org.senlatraining.autoservice.api.IParser;
import org.senlatraining.autoservice.util.parsers.*;
import org.senlatraining.autoservice.util.Path;

public class Recover {	
	private Path path = new Path(); 
	private FileWorker fileOperator;
	private ParserForMasters parserForMaster = new ParserForMasters();
	private ParserForOrders parserForOrders = new ParserForOrders();
	private ParserForGarages parserForGarages = new ParserForGarages();
	
	public void initRecover(){
		recoverFromFile(path.getPathForGarage(), parserForGarages);
		recoverFromFile(path.getPathForMaster(), parserForMaster);
		recoverFromFile(path.getPathForOrder(), parserForOrders);
	}
//----------------------------------------------------------------------------
	public void recoverFromFile(String path, IParser parser){
		fileOperator = new FileWorker(path);
		parser.parseFromFile(fileOperator.pullFromFile());
	}
}	
