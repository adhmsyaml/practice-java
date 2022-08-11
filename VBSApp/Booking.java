/*****************************
 * PROGRAMMER #1 Name:ADHAM SYAMIL BIN SAIFUL’ANHA Student personID:2020852098
 * Group:CS1102F Phone Number:
 * 
 * PROGRAMMER #2 Name:JOHAN ZAFRI BIN JOHAR Student personID:2020463882
 * Group:CS1102F Phone Number:
 * 
 * PROGRAMMER #3 Name:MUHAMMAD NAZRAN ASHRAF BIN MOHD RAZALI Student
 * personID:2020858726 Group:CS1102F Phone Number:01128791498
 * 
 * PROGRAMMER #4 Name:TENGKU AKMAL HAZIQ BIN TENGKU AMRAN Student
 * personID:2020888038 Group:CS1102F Phone Number:
 * 
 * 
 *****************************/

public class Booking {
    private String type;

    // default constructor
    public Booking() {
        type = " ";
    }

    // normal constructor
    public Booking(String bookingType) {
        this.type = bookingType;
    }

    // setter method
    public void setType(String type) {
        this.type = type;
    }

    // retriever method
    public String getType() {
        return type;
    }
}
