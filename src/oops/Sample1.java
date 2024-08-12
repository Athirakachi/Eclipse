package oops;

public class Sample1 {
	
	public void sum()
	{
		int a=20,b=30;
		int c=a+b;
		System.out.println(c);
	}
	public int sub(int a, int b)
	{
		int c=a-b;
		return c;
	}
	public int mul()
	{
		int a=40,b=50;
		return a+b;
	}
	public void div(int a, int b)
	{
		int c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		Sample1 ob=new Sample1();
		ob.sum();			//with parameter and with return type
		System.out.println(ob.sub(100,80));		//with return type and with parameter
		System.out.println(ob.mul());			// with return type and without parameter
		ob.div(100,25);			// without return type and with parameter.
	}

}
