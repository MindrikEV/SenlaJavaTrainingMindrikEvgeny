package org.senlatraining.autoservice.util.parsers;

import org.senlatraining.autoservice.api.IParser;
import org.senlatraining.autoservice.entity.Order;
import org.senlatraining.autoservice.manager.OrderManager;


public class ParserForOrders implements IParser{
	
	@Override
	public void parseFromFile(String[] array){
		OrderManager orderManager = new OrderManager();
		
		for(int i = 0; i < array.length; i++){
			String[] s = array[i].split(SPLITTER);
			//Order order = new Order(s[1],Double.valueOf(s[2]),s[5],s[6]); 		//s[2] - Price; s[5] - PlanStartDate; s[6] - DateOFComplete; 
			//order.setStatus(s[3]);												//s[3] - Status;
			//order.setDateOfRegistration(s[4]);									//s[4] - Date of registration;
			
			orderManager.add(s[1],Double.valueOf(s[2]),s[5],s[6]);
		}
	}
}
