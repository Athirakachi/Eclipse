package controlstmnts;

public class Fibnocci {
	public static void main(String[] args)
	{
		int a=0,b=1,i=1,sum=0;
		System.out.println("Fibnocci series");
		System.out.print(a +",");
		while(i<10)
		{
			sum=a+b;
			System.out.print(sum +",");
			b=a;
			a=sum;
			i++;
		}
	}

}
