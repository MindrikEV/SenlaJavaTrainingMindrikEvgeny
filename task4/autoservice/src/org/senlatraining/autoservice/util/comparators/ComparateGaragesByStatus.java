package org.senlatraining.autoservice.util.comparators;

import org.senlatraining.autoservice.entity.Garage;
import java.util.Comparator;

public class ComparateGaragesByStatus implements Comparator<Garage>{
	
	@Override
	public int compare(Garage g1, Garage g2){
		return g1.getStatus().compareTo(g2.getStatus());
	}
}
