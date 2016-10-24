package org.senlatraining.autoservice.runner;

import org.senlatraining.autoservice.manager.Recover;
import org.senlatraining.autoservice.entity.Path;

public class Runner {
	public static void main(String[] args){
		
	/*	Path path = new Path();
		path.setPathForMaster(args[0]);
		path.setPathForOrder(args[1]);
		path.setPathForGarage(args[2]); 
 	*/	
		Stuffer stuffer = new Stuffer();
		stuffer.stuff();
	}
}
