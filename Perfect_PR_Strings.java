/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main {
	public static void main(String args[])
	{
	int flag=0;
	Scanner sc =new Scanner(System.in);
	String str=sc.nextLine();
	char[] ch =str.toCharArray();
	for(int i=1;i<ch.length;i++)
	{
		if(ch[i]==ch[i-1] || (ch[i]!='P' && ch[i]!='R'))
		{
			flag=1;
		}
	}
	if(flag==0)
	System.out.println("Perfect");
	else
	System.out.println("Imperfect");
}
}