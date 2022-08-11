
/**
 *
 * Group members name and matric number:
 * 1) ADHAM SYAMIL BIN SAIFUL ANHA (2020852098)
 * 2) MUHAMMAD IZHAM NAQIS BIN MOHD JALANI (2020895706)
 * 3) MUHAMMAD FARIS BIN ZAINUDDIN (2020463554)
 * 4) ANAS IKMAL BIN ABDUL RAHMAN (2020877992)
 * Class: CS1103F
 */
import java.lang.*;
public class Cake
{
   private String custID; //D001, P003
   private String cakeType; //D24 Chocolate Cake,Red Velvet,Burnt Cheese Cake,Black Forest
   private int qty;
   private double price;
   
   public Cake(String ID,String cakeType, int qty)
   {    this.custID=ID;
        this.cakeType=cakeType;
        this.qty=qty;
   }
   
   public void setID(String ID){this.custID=ID;}
   public void setCakeType(String cakeType){this.cakeType=cakeType;}
   public void setQty(int qty){this.qty=qty;}
   
   //2.a)Write the retriever method for custID, cakeType and qty
   public String getCustID() {return custID;}
   public String getCakeType() { return cakeType;}
   public int getQty() {return qty;}
  
   //2.b)Write the detPrice() method that will return the price of cake based on cakeType.Refer 2_GroupProject.docx
   public double detPrice() {
       if (cakeType.equalsIgnoreCase("D24 Chocolate Cake")) {price = 120.00;}
        else if (cakeType.equalsIgnoreCase("Burnt Cheese Cake")) {price = 100.00;}
        //red velvet and black forest have the same price
        else if (cakeType.equalsIgnoreCase("Red Velvet") | cakeType.equalsIgnoreCase("Black Forest")) {price = 80.00;}
       return price;
    }
    
   //2.c)Write the toString method that will return the output look like as below:
   //Customer ID:XXXX    Cake Type:XXXXXXX            Price: RM XX.XX         Quantity:XX
   public String toString() {
       return ("Customer ID:" + custID + "\tCake Type:" + cakeType + "\tPrice:RM " + detPrice() + "\tQuantity:" + qty);
       //detPrice() used to determine the price
    }
      
}
