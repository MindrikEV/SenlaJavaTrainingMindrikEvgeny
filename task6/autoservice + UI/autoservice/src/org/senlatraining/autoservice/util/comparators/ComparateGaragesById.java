package org.senlatraining.autoservice.util.comparators;

import java.util.Comparator;
import org.senlatraining.autoservice.entity.Garage;

public class ComparateGaragesById implements Comparator<Garage>{
	@Override
	public int compare(Garage g1, Garage g2){
		return g1.getId().compareTo(g2.getId());
	}
}
