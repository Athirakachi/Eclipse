package arrays;

import java.util.Scanner;

public class Multiplication_table {
	public static void main(String[] args)
	{
		int num,limit,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enthe the limit");
		limit=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			result=i*limit;
			System.out.println(i +"*" +limit +"=" +result);
		}
	}

}
