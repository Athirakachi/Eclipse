package exam;

public class Swapnumbers {
	public static void main(String[] args)
	{
		int a=10,b=20;
		System.out.println("The numbers before swaping a=" +a +" and b=" +b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swaping a="+a +" b="+b);
		
	}

}
