package org.senlatraining.autoservice.util.parsers;

import org.senlatraining.autoservice.entity.Order;
import org.senlatraining.autoservice.manager.OrderManager;
import org.senlatraining.autoservice.util.FileWorker;

public class ParserForOrders {
	private final String SPLITER = "|";
	public void parseFromFile(String[] array){
		OrderManager orderManager = new OrderManager();
		FileWorker fileOperator = new FileWorker(orderManager.getPath());
		Integer size = fileOperator.pullFromFile().length;
		String tempDescription;
		Double tempPrice;
		String tempStatus;
		
		for(int i=0; i < size; i++){
			String[] s = fileOperator.pullFromFile()[i].split(SPLITER);
			tempDescription = s[0];
			tempPrice = Double.valueOf(s[1]);
			tempStatus = s[2];
			
			Order order = new Order(tempDescription, tempPrice);
			order.setStatus(tempStatus);
			orderManager.add(order);
		}
	}
}
