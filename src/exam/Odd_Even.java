package exam;

import java.util.Scanner;

public class Odd_Even {
	public static void main(String[] args)
	{
		int a[]=new int[5];
		System.out.println("Enter numbers");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i] +" is even number");
			}
			else
			{
				System.out.println(a[i] +" is odd number");
			}
		}
	}

}
