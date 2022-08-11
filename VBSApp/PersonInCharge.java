/*****************************
 * PROGRAMMER #1 Name:ADHAM SYAMIL BIN SAIFUL’ANHA Student ID:2020852098
 * Group:CS1102F Phone Number:
 * 
 * PROGRAMMER #2 Name:JOHAN ZAFRI BIN JOHAR Student ID:2020463882 Group:CS1102F
 * Phone Number:
 * 
 * PROGRAMMER #3 Name:MUHAMMAD NAZRAN ASHRAF BIN MOHD RAZALI Student
 * ID:2020858726 Group:CS1102F Phone Number:01128791498
 * 
 * PROGRAMMER #4 Name:TENGKU AKMAL HAZIQ BIN TENGKU AMRAN Student ID:2020888038
 * Group:CS1102F Phone Number:
 * 
 * 
 *****************************/

public class PersonInCharge {
    private String name;
    private String ID;
    private String address;
    private String contactNumber;
    private Event event;

    // default constructor
    public PersonInCharge() {
        name = " ";
        ID = " ";
        address = " ";
        contactNumber = " ";
        event = new Event();
    }

    // normal constructor
    public PersonInCharge(String name, String ID, String address, String contactNumber, Event event) {
        this.name = name;
        this.ID = ID;
        this.address = address;
        this.contactNumber = contactNumber;
        this.event = event;
    }

    // retriever method
    public String getID() {
        return ID;
    }

    public Event getEvent() {
        return event;
    }

    // toString method
    public String toString() {
        return ("Person in Charge Detail: " + "\nName: " + name + "\nIC Number: " + ID + "\nAddress: " + address
                + "\nContact Number: " + contactNumber + "\n\nEvent Detail: " + event.toString());
    }
}
