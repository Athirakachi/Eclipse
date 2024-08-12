package oops;

class Dog
{
	public void barking()
	{
		System.out.println("The dog is barking");
	}
}
class Cat extends Dog
{
	public void sleeping()
	{
		System.out.println("The cat is sleeping");
	}
}

public class Single_inheritance {
	public static void main(String[] args)
	{
		Cat ob=new Cat();
		ob.sleeping();
		ob.barking();
	}

}
