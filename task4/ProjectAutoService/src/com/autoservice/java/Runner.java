package com.autoservice.java;

public class Runner {
	public static void main(String[] args){
		Garage serviceStation = new Garage("Bosch-service", 10);		// Name + Amount of Places
		
		Master master1 = new Master("Givi","Vartanov");
		Master master2 = new Master("Ivan","Grozny");
		Master master3 = new Master("Max","Pax");
		
		MasterWorker masterWorker = new MasterWorker();
		masterWorker.add(master1);
		masterWorker.add(master2);
		masterWorker.add(master3);
		
		masterWorker.show();
		masterWorker.getAmount();
		
		FileOperator fileOperator = new FileOperator("Masters.txt");
		fileOperator.pushToFile();
		
	}
}
