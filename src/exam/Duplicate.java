package exam;

import java.util.Scanner;

public class Duplicate {
	public static void main(String[] args)
	{
		int[] arr = {10,20,15,6,7,8,10,15,20};
        System.out.println("Duplicate elements in the given array:");
        int l=arr.length;

        for (int i=0;i<l;i++)
        {
            for (int j=i+1; j<l;j++)
            {
                if (arr[i]==arr[j])
                {
                    System.out.println(arr[j]);
                }
            }
        }
	}
}
