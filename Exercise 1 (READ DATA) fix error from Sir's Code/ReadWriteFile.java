import java.util.*; // StringTokenizer
import java.io.*; //BufferedReader, PrintWriter, etc.
public class ReadWriteFile extends ArrayList
{
    
    public static void main() throws FileNotFoundException, IOException
    {
        //code to read a File
        BufferedReader infile = new BufferedReader(new FileReader("data.txt"));
        //code to write a File
        PrintWriter outfile = new PrintWriter(new BufferedWriter(new FileWriter("report2.txt")));
        
        ArrayList <Lecturer> list = new ArrayList <Lecturer> ();

        //String input = null;
        String input = infile.readLine();
        while(input != null) 
        {
            StringTokenizer separate = new StringTokenizer(input,"-");
            String name = separate.nextToken();
            int age = Integer.parseInt(separate.nextToken());
            double salary = Double.parseDouble(separate.nextToken());
            
            list.add(new Lecturer(name, age, salary));
            System.out.println(list);
            input = infile.readLine();
        }
        //
        //List Lecturer with salary above 5500.0
        outfile.println("List of name with salary above 5500.00\n");
        for (int i=0; i<list.size(); i++)
        {
            Lecturer l = (Lecturer) list.get(i);
            if(l.getSalary() > 5500)
            {
                System.out.println(l.toString()); // console
                outfile.println(l.toString()); // go to file
            }
        }
        infile.close();
        outfile.close();
    }
}