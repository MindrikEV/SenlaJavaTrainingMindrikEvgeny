package task3_4;

public class Polyclinic {
	private String name;
	private  static int amountOfDoctors;
	private  static int amountOfPatients;
	
	public Polyclinic(String name){
		this.name = name;
	}
//--------------------------------------------------	
	public Polyclinic(){}
//--------------------------------------------------	
	public void incOfAmountOfPatients(){
		this.amountOfPatients++;
	}
//--------------------------------------------------
	public int getOfAmountOfPatients(){
		return this.amountOfPatients;
	}
//--------------------------------------------------
	public void incOfAmountOfDoctors(){
		this.amountOfDoctors++;
	}
//--------------------------------------------------
	public int getOfAmountOfDoctors(){
		return this.amountOfDoctors;
	}	
}