public class Subclass extends Superclass {

// overrides printMethod in Superclass
public void printMethod() {
    super.printMethod();
    System.out.println("Printed in Subclass");
}
public static void main(String[] args) {
    Subclass s = new Subclass();
    Superclass S = new Subclass();
    s.printMethod();    
    S.printMethod();
    String testString1 = new String("haiii");
    System.out.println(testString1);
    String testString2 = "hoiii";
    System.out.println(testString2);
}
}