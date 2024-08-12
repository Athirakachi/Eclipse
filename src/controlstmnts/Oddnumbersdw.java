package controlstmnts;

public class Oddnumbersdw {
	public static void main(String[] args)
	{
		int i=1;
		System.out.println("The odd numbers upto 10");
		do
		{
			if(i%2==1)
			{
				System.out.print(i +",");
			}
			i++;
		}while(i<=15);
	}

}
