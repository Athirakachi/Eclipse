package arrays;

import java.util.Scanner;

public class Ascending_array {
	public static void main(String[] args)
	{
		int a[]=new int[4];
		int i,temp;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the 4 numbers");
		for(i=0;i<4;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<4;i++)
		{
			for(int j=i+1;j<4;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("The sorted array is");
		for(i=0;i<4;i++)
		{
			System.out.print(a[i] +" ");
		}
	}

}
