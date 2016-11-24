package org.senlatraining.autoservice.util.comparators;

import java.util.Comparator;
import org.senlatraining.autoservice.entity.Order;

public class ComparateOrdersByDatePlanStart implements Comparator<Order>{
	
	@Override
	public int compare(Order o1, Order o2){
		return o1.getDateOfPlanStart().compareTo(o2.getDateOfPlanStart());
	}

}
