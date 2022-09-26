package Clinic;

public class TreatmentPlan {

	int key;

	public TreatmentPlan(int key) {
		this.key = key;
	}

	public static void toTreat(int key) {
		if (key == 1) {
			System.out.println("Surgeon");
			Surgeon.toTreat();
		} else if (key == 2) {
			System.out.println("Dentist");
			Dentist.toTreat();
		} else {
			System.out.println("Therapist");
			Therapist.toTreat();
		}
	}

//	public enum key {
//		K1, K2
//	}
}
