package oops;

class Car
{
	public void speed()
	{
		System.out.println("Car Speed");
	}
	public void power()
	{
		System.out.println("Car power");
	}
}
class BMW extends Car
{

	@Override
	public void speed() {
		System.out.println("Bmw speed");
		super.speed();
	}

	@Override
	public void power() {
		System.out.println("Bmw power");
		super.power();
	}
	
}
public class Overriding_Annotation {
	
	public static void main(String[] args)
	{
		BMW ob=new BMW();
		ob.speed();
		ob.power();
	}

}
