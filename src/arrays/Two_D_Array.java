package arrays;

import java.util.Scanner;

public class Two_D_Array {
	public static void main(String[] args)
	{
		String arr[][]=new String[2][3];
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your names");
		for( i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				arr[i][j]=sc.next();
			}
		}
		System.out.println("The entered strings are");
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
	}

}
