package arrays;

import java.util.Scanner;

public class Sample_array {
	public static void main(String[] args)
	{
		int a[]=new int[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers for array");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The numbers stored in array is");
		for( int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}

}
