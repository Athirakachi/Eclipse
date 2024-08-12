package oops;
class Parent
{
	String s="Hello World";
	public void phone()
	{
		System.out.println("Nokia");
	}
}
class Child extends Parent
{
	public void phone()
	{
		super.phone();
		System.out.println(super.s);
		System.out.println("iPhone");
	}
}

public class Overriding_super {
	public static void main(String[] args)
	{
		Child ob=new Child();
		ob.phone();
	}

}
