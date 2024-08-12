package controlstmnts;

public class Homework {
	public static void main(String[] args)
	{
		int num=1234,i=0;
		while(num>0)
		{
			num=num/10;
			i+=1;
		}
		System.out.println("The total digit of the number is "+i);
	}

}
