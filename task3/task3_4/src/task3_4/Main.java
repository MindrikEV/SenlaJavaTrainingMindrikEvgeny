package task3_4;

public class Main {
	public static void main(String[] args){

		Polyclinic polyclinic = new Polyclinic("Polyclinic number 666");	// Create new polyclinic
		
		Doctor doctor1 = new Doctor("Bob", "Smith", "surgeon");
		Doctor doctor2 = new Doctor("Stive", "Johnson", "pediatrist");      // Add new doctors
		Doctor doctor3 = new Doctor("Pol", "Williams", "psychiatrist");
		
		System.out.println();
	
		Patient patient1 = new Patient("Jack", "Miller", "hernia");
		Patient patient2 = new Patient("Oliver", "Davis", "alcoholism");
		Patient patient3 = new Patient("Thomas", "Brown", "burn");
		Patient patient4 = new Patient("William", "Taylor", "chickenpox");					// Add new patients
		Patient patient5 = new Patient("Olivia", "Harris", "narcomania");
		Patient patient6 = new Patient("Chloe", "Thompson", "psychosis");
		Patient patient7 = new Patient("Elly", "Clark", "narcomania");
		
		System.out.println();
	
		Queue queue1 = new Queue(doctor1); 				// Add new queue
		queue1.addPatient(patient1);				
		queue1.addPatient(patient3);				// Add patients to the queue
	
		Queue queue2 = new Queue(doctor2);
		queue2.addPatient(patient4);
	
		Queue queue3 = new Queue(doctor3);
		queue3.addPatient(patient2);
		queue3.addPatient(patient5);
		queue3.addPatient(patient6);
		queue3.addPatient(patient7);
		
		System.out.println();
		
		System.out.println(queue1.showQueue());
		System.out.println(queue2.showQueue());			// Print amount of patients in queues to each doctor
		System.out.println(queue3.showQueue());
		
		System.out.println();
		
		System.out.println("Total of patients in polyclinic = " + polyclinic.getOfAmountOfPatients()); 			// Total of patients
		System.out.println("Total of doctors in polyclinic = " 	+ polyclinic.getOfAmountOfDoctors());
	}
}
