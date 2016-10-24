package org.senlatraining.autoservice.util.parsers;

import org.senlatraining.autoservice.api.IParser;
import org.senlatraining.autoservice.entity.*;
import org.senlatraining.autoservice.manager.OrderManager;
import org.senlatraining.autoservice.util.FileWorker;

public class ParserForOrders implements IParser{
	
	@Override
	public void parseFromFile(String[] array){
		OrderManager orderManager = new OrderManager();
		Path path = new Path();
		FileWorker fileOperator = new FileWorker(path.getPathForOrder());
		Integer size = fileOperator.pullFromFile().length;
		String tempDescription;
		Double tempPrice;
		String tempStatus;
		String tempRegistrationDate;
		String tempPlanStartDate;
		String tempCompleteDate;
		
		for(int i=0; i < size; i++){
			String[] s = fileOperator.pullFromFile()[i].split(SPLITTER);
			tempDescription = s[1];
			tempPrice = Double.valueOf(s[2]);
			tempStatus = s[3];
			tempRegistrationDate = s[4];
			tempPlanStartDate = s[5];
			tempCompleteDate = s[6];
			
			
			Order order = new Order(tempDescription, tempPrice, 1, tempPlanStartDate);
			order.setStatus(tempStatus);
			order.setDateOfRegistration(tempRegistrationDate);
			//order.setDateOfComplete(daysOnWork);
			
			orderManager.add(order);
		}
	}
}
