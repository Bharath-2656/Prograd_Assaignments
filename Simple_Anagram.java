/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	
		/*int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		String arr[] = new String[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextLine();
		}
		*/
		char str1[]={'A','B','B'};
		char str2[]={'B','A','B'};
		int l=str1.length;
		int flag=0;
		Arrays.sort(str1);
		Arrays.sort(str2);
		for(int i=0;i<l;i++)
		{
		    if(str1[i]!=str2[i])
		        {
		            flag=1;
		            System.out.println("False");
		        }
		}
		if(flag==0)
		    {
		        System.out.println("True");
		    }
		    
		
	}
}
