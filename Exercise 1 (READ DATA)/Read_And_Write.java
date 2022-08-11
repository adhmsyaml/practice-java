import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Read_And_Write {
  public static void main(String[] args) {
    BufferedReader in = new BufferedReader(new FileReader("name.txt"));
    String valueString = in.readLine();
    while(valueString != null) {
        valueString = in.readLine();
    }
    
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("personInfo.txt")));
    
    in.close();
    out.close();
  }
}