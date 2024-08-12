package controlstmnts;

import java.util.Scanner;

public class Alphabet_or_not {
	public static void main(String[] args)
	{
		char c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		c=sc.next().charAt(0);
		if(Character.isAlphabetic(c))
		{
			System.out.println(c +" is an alphabet");
		}
		else
		{
			System.out.println(c +" is not an alphabet");
		}
	}

}
