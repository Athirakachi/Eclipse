package arrays;

public class Withoutsize_2D {
	public static void main(String[] args)
	{
		int a[][]= {{10,20},{30,40},{50,60}};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
	}

}
