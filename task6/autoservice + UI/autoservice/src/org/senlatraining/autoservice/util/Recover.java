package org.senlatraining.autoservice.util;

import org.apache.log4j.Logger;
import org.senlatraining.autoservice.api.IParser;
import org.senlatraining.autoservice.util.parsers.*;
import org.senlatraining.autoservice.util.Path;

public class Recover {	
	private static final Logger log = Logger.getLogger(Recover.class);
	private Path path = new Path(); 
	private FileWorker fileOperator;
	private ParserForMasters parserForMaster = new ParserForMasters();
	private ParserForOrders parserForOrders = new ParserForOrders();
	private ParserForGarages parserForGarages = new ParserForGarages();
	
	public void initRecover(){
		try{
			recoverFromFile(path.getPathForGarage(), parserForGarages);
			recoverFromFile(path.getPathForMaster(), parserForMaster);
			recoverFromFile(path.getPathForOrder(), parserForOrders);
		} catch (Exception e){
			log.error(e);
			throw(e);
		}
	}
//----------------------------------------------------------------------------
	public void recoverFromFile(String path, IParser parser){
		try{
			fileOperator = new FileWorker(path);
			parser.parseFromFile(fileOperator.pullFromFile());
		} catch (NullPointerException npe){
			log.error(npe);
			throw(npe);
		}
	}
}	
