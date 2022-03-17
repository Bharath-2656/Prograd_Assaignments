package Programs;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Anagram_Hashmap {
	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		HashMap<Character,Integer> map = new HashMap<Character,Integer>(5);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		for(char c: ch1)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c) + 1);
			}
			else
			{
				map.put(c,1);
			}
		}
		for(char c: ch2)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c) - 1);
			}
		}
		for (Entry<Character, Integer> m : map.entrySet()) 
		{
			if(m.getValue()>0)
			{
			sum=sum+(m.getValue());
			}
		}
		if(sum==0)
		{
			System.out.println("Words are Anagram");
		}
		else
		{
			System.out.println("Words are not Anagram");
		}
	}
}


