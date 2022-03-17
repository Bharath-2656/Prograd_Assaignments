/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
class Holiday {
private String name;
private int day;
private String month;
Holiday(String name, int day, String month)
{
    this.name=name;
    this.day=day;
    this.month=month;
}
String getName()
{
    return name;
}
int getDay()
{
    return day;
}
String getMonth()
{
    return month;
}
boolean inSameMonth(String str1, String str2)
{
    return str1.equals(str2);
}
static double avgDate (Holiday[] arr)
{   int sum=0;
    for (int i=0;i<arr.length ;i++ )
    {
        sum+=arr[i].getDay();
    }
    return (double)sum/arr.length;
}
}
class Main
{
	public static void main(String[] args) {
		Holiday h1 = new Holiday("New year", 1, "January");
		System.out.println("Name: " + h1.getName() + " Day: "+ h1.getDay() + " Month: " + h1.getMonth());
		Holiday h2 = new Holiday("Independence day", 4, "July");
		System.out.println("Name: " + h2.getName() + " Day: "+ h2.getDay() + " Month: " + h2.getMonth());
		String str1=h1.getMonth();
		String str2=h2.getMonth();
		System.out.println(h1.inSameMonth(str1,str2));
		Holiday arr[] ={h1,h2};
		System.out.println(Holiday.avgDate(arr));
		
	}
}
