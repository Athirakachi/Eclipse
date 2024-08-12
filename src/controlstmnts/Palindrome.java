package controlstmnts;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args)
	{
		int num,rev=0,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		int num1=num;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(num1==rev)
		{
			System.out.println("The number is palindrome");
		}
		else
		{
			System.out.println("The number is not a palindrome");
		}
	}

}
