package arrays;

import java.util.Scanner;

public class Find_largset {
	public static void main(String[] args)
	{
		int a[]=new int[5];
		int i,big;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 numbers");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		big=a[0];
		
		for(i=0;i<4;i++)
		{
			if(big<a[i+1])
			{
				big=a[i+1];
			}
		}
		System.out.println("The largest number is "+big);
	}

}
