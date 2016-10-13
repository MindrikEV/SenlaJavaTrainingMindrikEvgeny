package task3_4;

public class Doctor extends Man{
	private String speciality;
	private int position = 0;
	private Patient[] arrOfPatients;
	private static int totalOfPatients = 0;
	
	public Doctor(String name, String surName, String speciality){
		super(name, surName);
		this.speciality = speciality;
		arrOfPatients = new Patient[3];
	}	
//-------------------------------------------------------------------------------
	public void addPatient(Patient patient){
		if (arrOfPatients.length == position){
			arrOfPatients = Array.resize(arrOfPatients);
		}
		arrOfPatients[position] = patient;
		position++;
		this.totalOfPatients++;
	}
//-------------------------------------------------------------------------------
	public void delPatient(Patient patient){
		arrOfPatients = Array.delElement(arrOfPatients, patient);
		totalOfPatients--;
	}
//-------------------------------------------------------------------------------
	public static int getTotalOfPatients(){
		return totalOfPatients;
	}
//-------------------------------------------------------------------------------	
	public void showPatients(){
		System.out.println("Patients in queue to doctor " + super.getSurName() + " = " + Array.getAmountOfElements(arrOfPatients));
		for(int i=0; i < arrOfPatients.length;i++){
			if(arrOfPatients[i] != null){
				System.out.println(arrOfPatients[i].getSurName());
			}
		}
	}
}
