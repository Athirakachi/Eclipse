package arrays;

import java.util.Scanner;

public class Vowels_number {
	public static void main(String[] args)
	{
		String s,temp;
		char c;
		int v,i,l,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		s=sc.nextLine();			//used to read a long sentence.

		temp=s.replaceAll("\\s","");	//used to avoid white space from the sentence.
		System.out.println(temp);
		l=temp.length();
		
		for(i=0;i<l;i++)
		{
			c=temp.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			{
				count++;
			}
		}
		System.out.println("The number of vowels in word is "+count);
	}

}
