
import java.util.*;
import java.io.*;
class Student{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String name;
    String rollNo;
    String address;
    String class1;
    String dob;
    String phoneNo;
    public void addData()
    {   
        try 
        {
        //File MyStudent = new File("Student.txt");
        //FileWriter myWriter = new FileWriter("Student.txt");
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("Student.txt",true)));
        System.out.println("\nEnter your name: ");
        name= br.readLine();
        pw.println(name);
        System.out.println("\nEnter your Roll Number: ");
        rollNo= br.readLine();
        pw.println(rollNo);
        System.out.println("\nEnter your Address: ");
        address= br.readLine();
        pw.println(address);
        System.out.println("\nEnter your Class: ");
        class1= br.readLine();
        pw.println(class1);
        System.out.println("\nEnter your dob: ");
        dob= br.readLine();
        pw.println(dob);
        System.out.println("\nEnter your Phone Number: ");
        phoneNo= br.readLine();
        pw.println(phoneNo);
        pw.close();
        }
        catch(IOException e)
        {
            System.out.println("Error");
        }
    }
        public void ShowData()
        {
            try 
            {
           BufferedReader file = new BufferedReader(new FileReader ("Student.txt"));
            BufferedReader newfile = new BufferedReader(new FileReader ("Student.txt"));
            //while((name1 = file.readLine())!= null)
            {
                String name1 = file.readLine();
                String rollNo1 = file.readLine();
                String address1 = file.readLine();
                String class2 = file.readLine();
                String dob1 = file.readLine();
                String phoneNo1 = file.readLine();
                System.out.println("\nName: "+name1);
                System.out.println("\nRoll Number: "+rollNo1); 
                System.out.println("\nAddress: "+address1);
                System.out.println("\nClass: "+class2);
                System.out.println("\nDate of Birth: "+dob1);
                System.out.println("\nPhone Number: "+phoneNo1);
            }
        }
        catch(IOException e)
        {
            System.out.println("Error");
        }
        }
}
public class Main
{
	public static void main(String[] args) {
	    Student stu = new Student();
	    stu.addData();
	    stu.ShowData();
	}
}
