import java.util.*;
public class Question1 {
    public static void main() {
        ArrayList <Integer> number = new ArrayList <Integer> ();
        number.add(6);
        number.add(5);
        number.add(9);
        number.add(0);
        number.add(4);
        number.add(7);
        number.add(2);
        number.add(3);
        number.add(1);
        number.add(8);
        System.out.println(number);
        
        for(int i=0; i<number.size(); i++) {
            for(int j=0; j<number.size()-1; j++) {
                if(number.get(j).compareTo(number.get(j+1)) < 0) { //> is ascending, < is descending
                    Integer temp = number.get(j); //temporary
                    number.set(j, number.get(j+1));
                    number.set(j+1, temp);
                }
            }
        }
        
        System.out.println(number);
        
    }
}