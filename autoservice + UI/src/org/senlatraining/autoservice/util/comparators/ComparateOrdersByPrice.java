package org.senlatraining.autoservice.util.comparators;

import java.util.Comparator;
import org.senlatraining.autoservice.entity.Order;

public class ComparateOrdersByPrice implements Comparator<Order>{
	
	@Override
	public int compare(Order o1, Order o2){
		return o1.getPrice().compareTo(o2.getPrice());
	}
}
