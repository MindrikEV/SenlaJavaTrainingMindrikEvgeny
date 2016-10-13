package task3_4;

public class Queue {
	private Doctor doctor;
	private Patient patient;
	private int amountOfPatientsInQueue;
	private StringBuffer sb;
	private String[] oldListOfPatients;
	private String[] newListOfPatients;
	
	
	public Queue(Doctor doctor){
		this.doctor = doctor;
		amountOfPatientsInQueue = 0;
		oldListOfPatients = new String[1];
	}
//---------------------------------------------------------
	public void addPatient(Patient patient){
		this.patient = patient;
		
		newListOfPatients = new String[oldListOfPatients.length + 1];
		for(int i=0; i < oldListOfPatients.length; i++){
			newListOfPatients[i] = oldListOfPatients[i];
		}
		newListOfPatients[oldListOfPatients.length + 1] = this.patient.toString();
		this.amountOfPatientsInQueue++;		
	}	
//---------------------------------------------------------
	public void delPatient(Patient patient){
		//for(int i=0; i < listOfPatients.length();i++){
			
		//}
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
		sb = new StringBuffer();
		sb.append(amountOfPatientsInQueue);
		sb.append(" patients in queue to doctor - ");
		sb.append(this.doctor);
		return sb.toString();
	}
	public void getListOfPatients(){
		for(int i=0;i<newListOfPatients.length;i++){
			System.out.println(newListOfPatients[i]);
		}
		
	}
}
