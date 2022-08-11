public class UmrahApplicant extends EZTravelApplicant {
	private char umrahPackage; // e.g: '1' - UmrahDirectFlight
					// '2' - UmrahRamadan
					// '3' - UmrahSchoolHoliday

	// normal constructor
	public UmrahApplicant(String name, String ic, char flight, char umrahPackage) {
		super(name, ic, flight);
		this.umrahPackage = umrahPackage;
	}

	// accessor
	public char getUmrahPackage() {
		return umrahPackage;
	}

	// mutator
	public void setUmrahPackage(char umrahPackage) {
		this.umrahPackage = umrahPackage;
	}

	public double calculateCharge() {
		double charge = 0;
		if (umrahPackage == 1) {
			charge = 8000;
		} else if (umrahPackage == 2) {
			charge = 9000;
		} else if (umrahPackage == 3) {
			charge = 10000;
		}
		return charge;
	}
}