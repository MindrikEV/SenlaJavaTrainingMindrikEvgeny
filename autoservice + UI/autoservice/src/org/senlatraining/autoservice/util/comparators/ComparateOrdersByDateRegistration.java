package org.senlatraining.autoservice.util.comparators;

import java.util.Comparator;
import org.senlatraining.autoservice.entity.Order;

public class ComparateOrdersByDateRegistration implements Comparator<Order>{
		
		@Override
		public int compare(Order o1, Order o2){
			return o1.getDateOfRegistration().compareTo(o2.getDateOfRegistration());
		}
}
