package InterfaceConcepts;

public class FortisHospital implements USMedical, UKMedical, IndiaMedical {

	@Override
	public void cardioServices() {
		System.out.println("FortisHospital - cardio");
	}

	@Override
	public void ambulanceServices() {
		System.out.println("FortisHospital - ambulance");
	}

	@Override
	public void childCareServices() {
		System.out.println("FortisHospital - child care");
	}

	@Override
	public void OutPatientServices() {
		System.out.println("FortisHospital -- outpatient");
	}

	@Override
	public void physioServices() {
		System.out.println("FortisHospital -- physioServices");
	}

	@Override
	public void mentalHealthServices() {
		System.out.println("FortisHospital -- mentalHealthServices");
	}

	@Override
	public void icuServices() {
		System.out.println("FortisHospital -- icuServices");
	}

	@Override
	public void dentalServices() {
		System.out.println("FortisHospital -- dentalServices");
	}

	@Override
	public void oncologyServices() {
		System.out.println("FortisHospital -- oncologyServices");
	}
	
	public void medicalInsuranceServices(){
		System.out.println("FortisHospital -- medicalInsuranceServices");
	}
	
	public void heartTransplant(){
		System.out.println("FortisHospital -- heartTransplant");
	}
	
	
	

}
