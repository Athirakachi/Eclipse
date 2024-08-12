package arrays;

import java.util.Scanner;

public class Reverse_array {
	public static void main(String[]args)
	{
		int a[]=new int[6];
		int b[]=new int[6];
		int i,j=0;
		System.out.println("Enter the 6 numbers for the array");
		Scanner sc=new Scanner(System.in);
		for(i=0;i<6;i++)
		{
			a[i]=sc.nextInt();
		}
		for(j=0;j<6;j++) 
		{
			b[j]=a[i-1];
			System.out.print(b[j] +" ");
			i--;
		}
	}

}
