package task3_4;

public class Queue {
	private Doctor doctor;
	private int amountOfPatientsInQueue;
	private StringBuffer sb;
	//private String[] listOfPatients;
	
	public Queue(Doctor doctor){
		this.doctor = doctor;
		amountOfPatientsInQueue = 0;
		sb = new StringBuffer();
		//listOfPatients = new String();
	}
//---------------------------------------------------------
	public void addPatient(Patient patient){
		this.amountOfPatientsInQueue++;
		
		
	}	
//---------------------------------------------------------
	public void delPatient(Patient patient){
		this.amountOfPatientsInQueue--;
	}
//---------------------------------------------------------
	public int getAmountOfPatientsInQueue(){
		return amountOfPatientsInQueue;
	}
//---------------------------------------------------------	
	public Doctor getNameOfDoctor(){
		return this.doctor;
	}	
	public String showQueue(){	
		sb.append(amountOfPatientsInQueue);
		sb.append(" patients in queue to doctor - ");
		sb.append(this.doctor);
		return sb.toString();
	}
}
