package oops;

public class Method_overloading {
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public void add(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println(d);
	}
	public static void main(String[] args)
	{
		Method_overloading ob=new Method_overloading();
		ob.add(5, 6);
		ob.add(5, 6,7);
	}

}
