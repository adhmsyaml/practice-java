import java.util.*;
public class CompareToExercise {
    public static void main() {
        ArrayList <String> name = new ArrayList <String> ();
        name.add("Ali");
        name.add("Abu");
        name.add("Siti");
        name.add("Bibi");
        name.add("Siti");
        System.out.println(name);
        for(int i=0; i<name.size(); i++) {
            for(int j=0; j<name.size()-1; j++) {
                if(name.get(j).compareTo(name.get(j+1)) == 0) { // if elements are the same/equal then do whatever in the below.
                    name.remove(j);
                }
            }
        }
        System.out.println(name);
    }
}
