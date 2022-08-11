public class HajApplicant extends EZTravelApplicant {
	private boolean firstTime;
	private char room; // e.g'A' - 2 person per room
				// 'B' - 4 person per room
				// 'C' - 6 person per room

	// normal constructor
	public HajApplicant(String name, String ic, char flight, boolean firstTime, char room) {
		super(name, ic, flight);
		this.firstTime = firstTime;
		this.room = room;
	}

	// accessor
	public boolean getFirstTime() {
		return firstTime;
	}

	public char getRoom() {
		return room;
	}

	// mutator
	public void setFirstTime(boolean firstTime) {
		this.firstTime = firstTime;
	}

	public void setRoom(char room) {
		this.room = room;
	}

	public double calculateCharge() {
		double roomCharge = 0;
		if (room == 'A') {
			roomCharge = 300;
		} else if (room == 'B') {
			roomCharge = 200;
		} else if (room == 'C') {
			roomCharge = 100;
		}
		return 10000 + roomCharge;
	}
}