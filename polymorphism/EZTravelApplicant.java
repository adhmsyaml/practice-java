import javax.swing.Icon;

public abstract class EZTravelApplicant {
	private String name;
	private String ICNumber; // e.g:811111-06-5555
	private char flight; // e.g'M' - Malaysian Airline
				// 'A' - AirAsia
	private double deposit;// applicant need to pay deposit to booking

	// normal constructor
	public EZTravelApplicant(String name, String ic, char flight) {
		this.name = name;
		ICNumber = ic;
		this.flight = flight;
	}

	// accessor
	public String getName() {
		return name;
	}

	public String getICNumber() {
		return ICNumber;
	}

	public char getFlight() {
		return flight;
	}

	// mutator
	public void setName(String name) {
		this.name = name;
	}

	public void setICNumber(String ic) {
		ICNumber = ic;
	}

	public void setFlight(char flight) {
		this.flight = flight;
	}

	public abstract double calculateCharge();
}