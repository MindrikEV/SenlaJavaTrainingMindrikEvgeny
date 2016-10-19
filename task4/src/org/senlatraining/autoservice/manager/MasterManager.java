package org.senlatraining.autoservice.manager;

public class MasterManager {
	private final String path = "Masters.txt";
	private ArrayWorker arrayWorker = new ArrayWorker();
	private FileOperator fileOperator = new FileOperator(path);
	private Master[] listOfMasters = new Master[5];
		
	public void add(Master master){
		arrayWorker.addElement(listOfMasters, master);
	}
//------------------------------------------------------------------------------
	public void remove(Master master){
		arrayWorker.removeElement(listOfMasters, master);
	}
//------------------------------------------------------------------------------	
	public void show(){
		arrayWorker.Show(listOfMasters);
	}
//------------------------------------------------------------------------------
	public void getAmount(){
		System.out.println(arrayWorker.countOfElements(this.listOfMasters));
	}
//------------------------------------------------------------------------------
	public void saveArray(){
		fileOperator.pushListToFile(listOfMasters);
	}
}
