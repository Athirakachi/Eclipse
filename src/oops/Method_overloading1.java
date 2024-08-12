package oops;

public class Method_overloading1 {
	
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public void add(int a,double b)
	{
		double c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		Method_overloading1 ob=new Method_overloading1();
		ob.add(6,4);
		ob.add(5, 6.5);
	}
	

}
