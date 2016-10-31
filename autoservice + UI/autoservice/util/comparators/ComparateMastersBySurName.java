package org.senlatraining.autoservice.util.comparators;

import org.senlatraining.autoservice.entity.Master;
import java.util.Comparator;

public class ComparateMastersBySurName implements Comparator<Master>{
	
	@Override
	public int compare(Master m1, Master m2){
		return m1.getSurName().compareTo(m2.getSurName());
	}
}
