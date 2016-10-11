package task3_4;

public class Doctor extends Man{
	private String speciality;
	private Polyclinic polyclinic = new Polyclinic();
	
	public Doctor(String name, String surName, String speciality){
		super(name, surName);
		this.speciality = speciality;
		polyclinic.incOfAmountOfDoctors();
		System.out.println("New doctor added - " + surName);
	}	
//-------------------------------------------------------------------	
	@Override
	public String toString(){
		return super.getSurName();
	}
}
