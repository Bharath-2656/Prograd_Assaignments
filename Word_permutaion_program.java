/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
import java.util.*;
public class Main
{
    public static int factorial(int num)
    {
        int fact=1;
        for(int i=1;i<num;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
  public static void main (String[]args)
  {

    int count = 1;
    Scanner sc = new Scanner (System.in);
    String Word = sc.next ();
    int leng = Word.length ();
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    for (int i = 0; i < leng; i++)
      {
	    map.put(Word.charAt(i),(map.getOrDefault(Word.charAt(i), 0)+1));
      }
      int numerator=factorial(leng);
      int denominator=1;
      for(Map.Entry<Character, Integer> entry: map.entrySet()){ 
          denominator=denominator*factorial(entry.getValue());
    }
    System.out.println (numerator / denominator);

}
}

