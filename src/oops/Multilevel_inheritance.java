package oops;


class Dog1
{
	public void barking()
	{
		System.out.println("The dog is barking");
	}
}
class Cat1 extends Dog1
{
	public void sleeping()
	{
		System.out.println("The cat is sleeping");
	}
}
class Lion extends Cat1
{
	public void running()
	{
		System.out.println("The lion is running");
	}
}
public class Multilevel_inheritance {
	public static void main(String[] args)
	{
		Lion ob=new Lion();
		ob.running();
		ob.sleeping();
		ob.barking();
	}

}
