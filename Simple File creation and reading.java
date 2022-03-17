/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	  try{
      File f1 = new File("hii.txt");
      FileWriter f2= new FileWriter("hii.txt");
      f2.write("Good Morning");
      f2.close();
      Scanner sc= new Scanner(f1);
      while(sc.hasNextLine())
      {
      String str = sc.nextLine();
      System.out.println(str);
	  }
	}
	catch(IOException e)
	{
	    System.out.println("Error");
	    e.printStackTrace();
	}
}
}
