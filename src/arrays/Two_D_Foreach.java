package arrays;

import java.util.Scanner;

public class Two_D_Foreach {
	public static void main(String[] args)
	{
		int arr[][]=new int[2][3];
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 6 numbers");
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int v[]:arr)	//v[]=assigns first row of elements
		{
			for(int m:v)	//m=v[0][0], m=v[0][1], m=v[0][2]
			{
				System.out.print(m +" ");
			}
			System.out.println();
		}
	}

}
