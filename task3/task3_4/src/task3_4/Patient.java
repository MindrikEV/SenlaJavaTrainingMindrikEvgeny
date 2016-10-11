package task3_4;

public class Patient extends Man{
	private String illness;
	private Polyclinic polyclinic = new Polyclinic();
	
	public Patient(String name, String surName, String illness){
		super(name, surName);
		this.illness = illness;
		polyclinic.incOfAmountOfPatients();
		System.out.println("New patient added - " + surName);
	}
//-------------------------------------------------------------------	
	@Override
	public String toString(){
		return super.getSurName();
	}
}
