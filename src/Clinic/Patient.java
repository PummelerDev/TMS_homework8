package Clinic;

public class Patient {
	String name;
	int key;

	public Patient(String name, int key) {
		this.name = name;
		this.key = key;
		System.out.println("Patient: " + name);
		TreatmentPlan.toTreat(key);
	}

}
