package arrays;

import java.util.Scanner;

public class Array_string {
	public static void main(String[] args) {
		String arr[]=new String[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your names");
		for(int i=0;i<4;i++)
		{
			arr[i]=sc.next();
		}
		System.out.println("The strings entered are");
		for(String v:arr)	//for each statements instead of for loop
		{
			System.out.println(v);
		}
	}
}
