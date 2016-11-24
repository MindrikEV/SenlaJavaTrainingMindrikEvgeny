package org.senlatraining.autoservice.util.parsers;

import org.senlatraining.autoservice.api.IParser;
import org.senlatraining.autoservice.manager.OrderManager;


public class ParserForOrders implements IParser{
	
	@Override
	public void parseFromFile(String[] array){
		OrderManager orderManager = new OrderManager();
		
		for(int i = 0; i < array.length; i++){
			String[] s = array[i].split(SPLITTER);
			//s[0] - id
			//s[1] - Description
			//s[2] - Price; 
			//s[3] - Status;
			//s[4] - Date of registration;
			//s[5] - PlanStartDate; 
			//s[6] - DateOFComplete;
			orderManager.add(s[1],Double.valueOf(s[2]),s[5],s[6]);
		}
	}
}
