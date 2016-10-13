package task3_4;

public class Polyclinic {
	private String name;
	private  static int amountOfDoctors;
	private Doctor[] arrOfDoctors;
	private int position = 0;
	
	public Polyclinic(String name){
		this.name = name;
		arrOfDoctors = new Doctor[3];
	}
//--------------------------------------------------
	public void addDoctor(Doctor doctor){
		if (arrOfDoctors.length == position){
			arrOfDoctors = Array.resize(arrOfDoctors);
		}
		arrOfDoctors[position] = doctor;
		position++;
	}
//--------------------------------------------------
	public void showDoctors(){
		System.out.println("List of doctors in polyclinic - " + this.name);
		for(int i=0; i < arrOfDoctors.length;i++){
			if(arrOfDoctors[i] != null){
				System.out.println(arrOfDoctors[i].getSurName());
			}
		}
	}
//--------------------------------------------------
	public int getAmountOfDoctors(){
		return Array.getAmountOfElements(arrOfDoctors);
	}
}