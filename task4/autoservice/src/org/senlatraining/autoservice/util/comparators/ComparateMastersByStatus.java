package org.senlatraining.autoservice.util.comparators;

import java.util.Comparator;
import org.senlatraining.autoservice.entity.Master;

public class ComparateMastersByStatus implements Comparator<Master>{
	
	@Override
	public int compare(Master m1, Master m2){
		return m1.getStatus().compareTo(m2.getStatus());
	}
}
