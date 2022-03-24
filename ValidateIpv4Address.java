package Programs;

import java.util.Scanner;

public class ValidateIpv4Address {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ip_address=sc.next();
		System.out.println(validateIp(ip_address));
	}
	public static boolean validateIp(String ip_address)
	{
		String[] result = ip_address.split("\\.");
		int temporary_number=0,flag=0,ctr=0;
		if(result.length==4)
		{
			for (String i:result) 
			{
				ctr++;
				temporary_number=Integer.parseInt(i);
				if(temporary_number<0 || temporary_number>255)
				{
					flag=1;
				}
			}
			if(temporary_number==0 || temporary_number==255 || ctr!=4)
			{
				flag=1;
			}
			if(flag==1)
			{
				return false;
			}
			else 
			{ 
				return true;
			}
		}
		else 
		{
			return false;
		}
	}
}
