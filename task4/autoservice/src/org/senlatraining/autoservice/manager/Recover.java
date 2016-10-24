package org.senlatraining.autoservice.manager;

import org.senlatraining.autoservice.api.IParser;
import org.senlatraining.autoservice.util.ArrayWorker;
import org.senlatraining.autoservice.util.FileWorker;
import org.senlatraining.autoservice.util.parsers.*;
import org.senlatraining.autoservice.manager.*;

public class Recover {
	private  String masterPath = "src/files/masters.txt";
	private  String orderPath = "src/files/orders.txt";
	private  String garagePath = "src/files/garages.txt";
	
	private ArrayWorker arrayWorker = new ArrayWorker();
	private FileWorker fileOperator;
	private ParserForMasters parserForMaster = new ParserForMasters();
	private ParserForOrders parserForOrders = new ParserForOrders();
	private ParserForGarages parserForGarages = new ParserForGarages();
		
	
	
/*	public void createEntityFromFile(String path, IParser parser){
		fileOperator = new FileWorker(path);
		parser.parseFromFile(fileOperator.pullFromFile());
	}
*/	
	
	//createEntityFromFile(masterPath, parserForMaster);
	
	public void createMastersFromFile(){													
		parserForMaster.parseFromFile(fileOperator.pullFromFile());
	}

	
	public void createOrdersFromFile(){										
		parserForOrders.parseFromFile(fileOperator.pullFromFile());
	}
	OrderManager orderManager = new OrderManager();
	
	public void createGaragesFromFile(){										
		parserForGarages.parseFromFile(fileOperator.pullFromFile());
	}
	GarageManager garageManager = new GarageManager();
}
