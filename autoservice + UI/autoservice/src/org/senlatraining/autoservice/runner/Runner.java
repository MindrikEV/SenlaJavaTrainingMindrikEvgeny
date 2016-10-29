package org.senlatraining.autoservice.runner;

import org.senlatraining.autoservice.frontage.Service;
import org.senlatraining.autoservice.util.Path;

public class Runner {
	public static void main(String[] args){
		
		/*Path path = new Path();
		path.setPathForMaster(args[0]);
		path.setPathForOrder(args[1]);
		path.setPathForGarage(args[2]); 
 		
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);*/
		
		
		Service service = new Service();
		service.init();
	}
}
