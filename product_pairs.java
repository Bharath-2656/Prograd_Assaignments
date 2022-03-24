package Programs;

import java.util.Scanner;
public class product_pairs {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int[] arr=new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		int count=0;
		for (int i = 0; i <n; i++) {
			for (int j = i; j < n; j++) {
				if(arr[i]*arr[j]==target)
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}
}

//5
//1 1 1 1 1
//1
