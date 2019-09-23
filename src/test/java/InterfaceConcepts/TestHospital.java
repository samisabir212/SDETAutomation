package InterfaceConcepts;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fs = new FortisHospital();
		
		fs.ambulanceServices();
		fs.physioServices();
		fs.oncologyServices();
		fs.medicalInsuranceServices();
		fs.display();
		USMedical.sendMail();
		
		USMedical us = new FortisHospital();
		us.ambulanceServices();
		
		System.out.println(USMedical.min_fee);
		
		
			
	}

}
