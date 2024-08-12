package arrays;

import java.util.Scanner;

public class Reverse_string {
	public static void main(String[] args)
	{
		String s;
		int i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to be reversed");
		s=sc.next();
		int l=s.length();
		System.out.println("The reversed string is ");
		while(i<=l)
		{
			System.out.print(s.charAt(l-i));
			i++;
		}
	}

}
