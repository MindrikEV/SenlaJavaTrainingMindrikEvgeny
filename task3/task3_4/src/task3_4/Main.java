package task3_4;

public class Main {
	public static void main(String[] args){

		Doctor doctor1 = new Doctor("Bob", "Smith", "surgeon");
		Doctor doctor2 = new Doctor("Stive", "Johnson", "pediatrist");      // Add new doctors
		Doctor doctor3 = new Doctor("Pol", "Williams", "psychiatrist");
		Doctor doctor4 = new Doctor("Jack", "Eaton", "trololoher");
	
		Patient patient1 = new Patient("Jack", "Miller", "hernia");
		Patient patient2 = new Patient("Oliver", "Davis", "alcoholism");
		Patient patient3 = new Patient("Thomas", "Brown", "burn");
		Patient patient4 = new Patient("William", "Taylor", "chickenpox");					// Add new patients
		Patient patient5 = new Patient("Olivia", "Harris", "narcomania");
		Patient patient6 = new Patient("Chloe", "Thompson", "psychosis");
		Patient patient7 = new Patient("Elly", "Clark", "narcomania");
		
		Polyclinic polyclinic = new Polyclinic("Polyclinic 666");	// Create new polyclinic
		polyclinic.addDoctor(doctor1);
		polyclinic.addDoctor(doctor2);
		polyclinic.addDoctor(doctor3);
		polyclinic.addDoctor(doctor4);
		
		polyclinic.showDoctors();
		System.out.println();
		
		doctor1.addPatient(patient1);
		doctor1.addPatient(patient2);
		doctor1.addPatient(patient3);
		doctor1.addPatient(patient7);
		
		doctor1.showPatients();
		System.out.println();
		
		doctor2.addPatient(patient4);
		doctor2.addPatient(patient5);
		doctor2.addPatient(patient6);
		
		doctor2.showPatients();
		System.out.println();
		
		System.out.println("Total of patients = " + Doctor.getTotalOfPatients());
		
		System.out.println();
		
		doctor1.delPatient(patient3);
		System.out.println("List of patients after delete");
		doctor1.showPatients();
		
		System.out.println();
		
		System.out.println("Total of doctors in polyclinic = " + polyclinic.getAmountOfDoctors());
		System.out.println("Total of patients = " + Doctor.getTotalOfPatients());
	}
}
