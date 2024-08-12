package exam;

import java.util.Scanner;

public class Length_String {
	public static void main(String[] args)
	{
		String s;
		int l;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		s=sc.next();
		l=s.length();
		System.out.println("The length of a string is " +l);
	}

}
