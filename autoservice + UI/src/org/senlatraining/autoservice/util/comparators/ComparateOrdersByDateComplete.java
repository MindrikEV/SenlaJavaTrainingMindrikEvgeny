package org.senlatraining.autoservice.util.comparators;

import java.util.Comparator;
import org.senlatraining.autoservice.entity.Order;

public class ComparateOrdersByDateComplete implements Comparator<Order>{
	
	@Override
	public int compare(Order o1, Order o2){
		return o1.getDateOfComplete().compareTo(o2.getDateOfComplete());
	}
}
