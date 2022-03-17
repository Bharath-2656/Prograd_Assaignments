
import java.util.Scanner;
import java.util.*;
public class Unique_Year {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	String paragraph =sc.nextLine();
	int year=1;
	char[] ch =paragraph.toCharArray();
	HashSet<Integer> set=new HashSet();  
	for(int i=0;i<ch.length-3;i++)
	{
		if(ch[i]=='-' && Character.isDigit(ch[i+1])==true && Character.isDigit(ch[i+2])==true 
		&& Character.isDigit(ch[i+3])==true && Character.isDigit(ch[i+4])==true)
		{
			year=Integer.parseInt(paragraph.substring(i+1,i+5));
		    set.add(year);
		}
	}
	System.out.println(set.size());
}
}