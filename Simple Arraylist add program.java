
import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		ArrayList<String> car = new ArrayList<String>(2);
		Scanner sc = new Scanner(System.in);
		String str1=sc.nextLine();
		car.add(str1);
		for(int i=0;i<2;i++)
		{
		    System.out.println(car);
		}
		
	}
}
