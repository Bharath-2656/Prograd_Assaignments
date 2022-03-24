package Programs;

import java.util.ArrayList;
import java.util.Scanner;

public class palindrome 
{
	public static void main(String args[]) 
	{
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		int len =str.length();
		ArrayList<Character> list= new ArrayList<>();
		for (int i = 0; i < len; i++) 
		{
			list.add(str.charAt(i));
		}
		if(str.charAt(len-1)==str.charAt(len-2))
		{
			for(int i=2;i<len;i++)
			{
				if(str.charAt(len-i)==str.charAt(len-1-i)) {
					continue;
				}
				list.add(str.charAt(len-1-i));
			}
		}
		else 
		{
			for (int j = 1; j < len; j++) 
			{
				list.add(str.charAt(len-1-j));	
			}
		}
		for (Character s : list) 
		{
			System.out.print(s);

		}
	}
}

/*abb
 * abc
 * 
 * 
 * check the len and len-1 elements if equal thenthne go to len-2 and append from that on
 * if not equal then append from len-1
 * 
 */
