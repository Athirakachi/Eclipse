package oops;

class Dog2
{
	public void barking()
	{
		System.out.println("The dog is barking");
	}
}
class Cat2 extends Dog2
{
	public void sleeping()
	{
		System.out.println("The cat is sleeping");
	}
}
class Lion2 extends Dog2
{
	public void running()
	{
		System.out.println("The lion is running");
	}
}

public class Hierarchical_inheritance {
	public static void main(String[] args)
	{
		Cat ob=new Cat();
		Lion ob1=new Lion();
		ob.barking();
		ob.sleeping();
		ob1.barking();
		ob1.running();
	}

}
