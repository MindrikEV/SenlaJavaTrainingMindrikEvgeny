package org.senlatraining.autoservice.runner;

import org.senlatraining.autoservice.frontage.Service;
//import org.senlatraining.autoservice.util.Path;

public class Runner {
	public static void main(String[] args){
		
		Service service = new Service();
		service.init();
	}
}
