package controlstmnts;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args)
	{
		int num,i=1,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find factorial");
		num=sc.nextInt();
		while(i<=num)
		{
			fact=fact*i;
			i+=1;
		}
		System.out.println("The factorial of the given numer is "+fact);
	}

}
