package controlstmnts;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args)
	{
		/*int a=100, b=25, choice=4;
		switch(choice)
		{
		case 1: int sum=a+b;
				System.out.println("Addition of given 2 numbers is " +sum);
				break;
		case 2: int dif=a-b;
				System.out.println("The difference of given 2 numbers is "+dif);
				break;
		case 3: int product;
				product=a*b;
				System.out.println("The product of given 2 numbers is " +product);
				break;
		case 4: int reminder;
				reminder=a/b;
				System.out.println("The reminder of given 2 numbers is "+reminder);
				break;
		default: System.out.println("Please enter a proper choice");
					break;
		}*/
		
		//Using Scanner
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("enter a choice from 1 to 4");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:	System.out.println("Enter two numbers for addition");
				int a1=sc.nextInt();
				int b1=sc.nextInt();
				int sum=a1+b1;
				System.out.println("The sum of two numbers is "+sum);
				break;
		case 2: System.out.println("Enter two numbers for Subtraction");
				int a2=sc.nextInt();
				int b2=sc.nextInt();
				int sub=a2-b2;
				System.out.println("The difference of two numbers is "+sub);
				break;
		case 3:	System.out.println("Enter two numbers for Multiplication");
				int a3=sc.nextInt();
				int b3=sc.nextInt();
				int product=a3-b3;
				System.out.println("The product4 of two numbers is "+product);
				break;
		case 4:	System.out.println("Enter two numbers for Division");
				int a4=sc.nextInt();
				int b4=sc.nextInt();
				int reminder=a4/b4;
				System.out.println("The division of two numbers is "+reminder);
				break;
		default: System.out.println("Please enter a proper value");
					break;
		}
	}

}
