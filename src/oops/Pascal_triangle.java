package oops;

import java.util.Scanner;

public class Pascal_triangle {
	public static void main(String[] args)
	{
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=0;j<=n-i;j++) 
			{
				System.out.print(" ");
			}
			int c=1;
			for(int k=1;k<=i;k++)
			{
				System.out.print(c +" ");
				c=c*(i-k)/k;
			}
			System.out.println();
		}
	}

}
