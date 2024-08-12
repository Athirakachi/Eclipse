package controlstmnts;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("Enter a charactor");
		char c=sc.next().charAt(0);
		System.out.println(name);
	}

}
