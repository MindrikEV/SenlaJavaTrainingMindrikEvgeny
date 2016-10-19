package org.senlatraining.autoservice.util;

import java.util.Comparator;
import org.senlatraining.autoservice.entity.*;

public class CompByNameAndStatus implements Comparator<Master>{
	
	//public Comparator<Master> masterComparator = new Comparator<Master>(){
		@Override
		public int compare(Master m1, Master m2){
		int f = m1.getName() - m2.getSurName();
		if(f == 0){
			f = m1.getSurName().compareTo(m2.getSurName());
			return f;
		}
	}; 
}
