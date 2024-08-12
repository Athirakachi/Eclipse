package oops;
class A
{
	void m1()
	{
		int i=10;
		System.out.println("Tha value of i is "+i);
	}
}
class B extends A
{
	void m1()
	{
		int j=20;
		System.out.println("The value of j is "+j);
	}
}
public class Method_overriding {
	public static void main(String[] args)
	{
		B ob=new B();
		ob.m1();
	}

}
