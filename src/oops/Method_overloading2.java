package oops;

public class Method_overloading2 {
	public void add(int a,double b)
	{
		double c=a+b;
		System.out.println(c);
	}
	public void add(double a,int b)
	{
		double c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		Method_overloading2 ob=new Method_overloading2();
		ob.add(10,5.6);
		ob.add(5.5, 12);
	}

}
