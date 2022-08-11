import java.util.*;
import java.io.*;
import java.lang.*;
public class MyAss2QApp {
    public static void main(String[] args) throws Exception 
    {
        
        try
        {
            BufferedReader br = new BufferedReader (new FileReader ("cakeOrder.txt"));
            PrintWriter pickOut = new PrintWriter (new FileWriter ("pickup.txt"));
            PrintWriter delOut = new PrintWriter (new FileWriter ("delivery.txt"));
            Queue cakeQ=new Queue();
            Queue tempQ=new Queue();
            
            //a)b)c)read the data from cakeOrder.txt and insert into cakeQ
           
            String b = null;
            b = br.readLine();
            while(b!=null)
            {
                StringTokenizer st = new StringTokenizer(b,"*");//to separate each data type using the token "*"
                
                //place the separate data into each variables
                String custID=st.nextToken();//variable for customer ID 
                String cakeType=st.nextToken();//variable for cake type
                int qty = Integer.parseInt(st.nextToken());//variable for quantity
                
                Cake cakeOrder= new Cake(custID,cakeType,qty);//store in object
                cakeQ.enqueue(cakeOrder);//store in queue 
                b = br.readLine();//read the next line of text from cakeOrder.txt
            }
            
            //d)display the data in the cakeQ
           
            while(!cakeQ.isEmpty())
            {
                Cake c = cakeQ.dequeue();// Cake c will be empty at end of operation
                
                System.out.println(c.toString());//display the data in the current object
                
                tempQ.enqueue(c);//data in Cake c is sent to tempQ. It is same as original order
            }
            
            while(!tempQ.isEmpty())
            {
                cakeQ.enqueue(tempQ.dequeue());//to remove the data in tempQ 
            }
            
            //e)The first character of custID is based on the delivery type. if the first character is 'P' 
            //mean the customer choose to pickup the cake and if the first character is 'D', the customer 
            //choose to have delivery service. Example of custID are P002,D112 and etc. Write the data for delivery 
            //into delivery.txt output file and the data for customer that choose self pick up into pickup.txt. 
            
           while( !cakeQ.isEmpty())
            {
                Cake c =cakeQ.dequeue();
                
                if(c.getCustID().substring(0,1).equalsIgnoreCase("P")) //see if the customer want to choose self pick up
                {
                    pickOut.println(c.toString());
                }
                else //see if customer want to choose for  delivery
                {
                    delOut.println(c.toString());
                }
                
                tempQ.enqueue(c);
            }
            
            while(!tempQ.isEmpty())
            {
                cakeQ.enqueue(tempQ.dequeue());
            }
            
            //f)Display the total quantity order for each cake type and display the cake name of the highest total order
            
            int D24=0,RV=0,BCC=0,BFC=0; //the declaration of quantity order for each cake
            while(!cakeQ.isEmpty())
            {
                Cake cake =cakeQ.dequeue();
                
                if(cake.getCakeType().equalsIgnoreCase("D24 Chocolate Cake"))//count of D24 Chocolate Cake
                {
                    D24=D24 + cake.getQty();
                }
                
                else if(cake.getCakeType().equalsIgnoreCase("Red Velvet"))//count of Red Velvet cake
                {
                    RV=RV + cake.getQty();
                }
                
                else if(cake.getCakeType().equalsIgnoreCase("Burnt Cheese Cake"))//count of Burnt Cheese Cake
                {
                    BCC=BCC + cake.getQty();
                }
                
                else//count of Black Forest Cake
                {
                    BFC=BFC + cake.getQty();
                }
                
                tempQ.enqueue(cake);
            }
            
    
            while(!tempQ.isEmpty())
            {
                cakeQ.enqueue(tempQ.dequeue());
            }
            
            System.out.println("\nTotal quantity of D24 Chocolate Cake : "+D24);//display total quantity of D24 Chocolate Cake
            System.out.println("Total quantity of Red Velvet Cake : "+RV);//display total quantity of Red Velvet Cake
            System.out.println("Total quantity of Burnt Cheese Cake : "+BCC);//display total quantity of Burnt Cheese Cake
            System.out.println("Total quantity of Black Forest : "+BFC);//display total quantity of Black Forest Cake
            
            int highestQ=0;//declaring a variable datatype int for the highest quantity
            String highestQName=null;//declaring a variable dataype String for the cake that has the highest quantity
            
            if(highestQ < D24)//if the highest quantity of the cake is less than D24 Chocolate Cake quantity
            { 
                highestQ=D24;//HighestQ equal tu D24 Chocolate Cake
                highestQName="D24 Chocolate Cake";//the name of cake that has the highest quantity
            }
            
            if(highestQ < RV)//if the highest quantity of the cake is less than Red Velvet Cake quantity
            {
                highestQ=RV;//HighestQ equal to Red Velvet Cake
                highestQName="Red Velvet";//the name of cake that has the highest quantity
            }
            
            if(highestQ < BCC)//if the highest quantity of the cake is less than Burnt Cheese Cake quantity
            {
                highestQ=BCC;//HighestQ equal to Burnt Cheese Cake
                highestQName="Burnt Cheese Cake";//the name of cake that has the highest quantity
            }
            
            if(highestQ < BFC)//if the highest quantity of the cake is less than Black Forest quantity
            {
                highestQ=BFC;//HighestQ equal to Black Forest Cake
                highestQName="Black Forest";//the name of cake that has the highest quantity
            }
            
            System.out.println("\nHighest total order is "+highestQ+" for "+highestQName);//Display the highest quantity order and the cake name(with the highest quantity)
            
            /*g)Display the receipt that displays the custID, cakeType, price(using detPrice() method), qty, 
            payment for each order. To calculate the payment for each order you need to multiply quantity 
            with the cake price and extra charge of RM 5.00 for delivery service. Lastly, display the total 
            payment for all the orders.*/
            
            int i=1; //declaration to see the sequece of customer
            double totalPayment = 0;
            double totalCharge = 0;
            while(!cakeQ.isEmpty())
            {
                Cake cake2 = cakeQ.dequeue();
                
                System.out.println("++++++++++++++++++++++++++++++++++");//For the interface
                System.out.println("Customer no: "+i);//Display sequence of customer
                System.out.println("++++++++++++++++++++++++++++++++++");//For the interface
                System.out.println("Customer ID: "+cake2.getCustID());//Display the customerid
                System.out.println("Cake Name: "+cake2.getCakeType());//Display the cake name
                System.out.println("Price: RM"+String.format("%.2f",cake2.detPrice()));//Display the cake price
                System.out.println("Quantity: "+cake2.getQty());//Display the quantity
                
                double charge = 0.00;
                if(cake2.getCustID().substring(0,1).equalsIgnoreCase("D"))//if the first character of customerid is "D"
                {
                    charge = 5.00;//the charge will be count as RM5.00
                    System.out.println("Delivery/Self Pick-Up: Delivery");//Display the customer choose delivery
                }
                else
                {
                    System.out.println("Delivery/Self Pick-Up: Self Pick-Up");//Display the customer choose self pick-up
                }
                
                double Payment = cake2.getQty() * cake2.detPrice();//calculate the payment of the each cake
                System.out.println("Payment: RM "+String.format("%.2f",Payment)+"\n");//display payment
                
                totalPayment = totalPayment + Payment;//cCalculate the total payment
                totalCharge = totalCharge + charge;//Calculate the total charge
                i++; //Incrementing customer sequence
                tempQ.enqueue(cake2);
            }
            
            System.out.println("\nTotal payment: RM "+String.format("%.2f",totalPayment+totalCharge));//Display the total payment of the customers
            
                
            br.close();
            pickOut.close();
            delOut.close();
        }
        catch(Exception e) {System.err.println(e.getMessage());}
        
    } /***End of main() Method***/   
}/***End of Application Class***/