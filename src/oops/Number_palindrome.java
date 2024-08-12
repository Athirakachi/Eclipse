package oops;

import java.util.Scanner;

public class Number_palindrome {
	public static void main(String[] args)
	{
		//System.out.println(1%10);
		int num,rem,prod=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();	//141
		int temp=num;	//141
		while(num>0)	//141>0		//14>0		//1>0		//0>0--exit loop
		{
			rem=num%10;		//141%10=1		//14%10=4		//1%10=1
			prod=(prod*10)+rem;		//(0*10)+1=1		//(1*10)+4=14		//(14*10)+1=141
			num=num/10;		//141/10=14		//14/10=1		//1/10=0
		}
		if(temp==prod)
		{
			System.out.println("The number is palindrome");
		}
		else
		{
			System.out.println("The number is not in palindrome");
		}
	}

}
