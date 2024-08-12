package oops;
interface Basicanimal
{
	void cat();
	void sleep();
}
class Monkey
{
	void jump()
	{
		System.out.println("jump");
	}
	void bite()
	{
		System.out.println("bite");
	}
}
class Human extends Monkey implements Basicanimal
{
	void speak()
	{
		System.out.println("Speak");
	}

	@Override
	public void cat() {
		System.out.println("cat is meowing");
		
	}

	@Override
	public void sleep() {
		System.out.println("Everyone is sleeping");
		
	}
}

public class Classwork_Inheritance {
	public static void main(String[] args)
	{
		Human ob=new Human();
		ob.speak();
		ob.jump();
		ob.bite();
		ob.cat();
		ob.sleep();
		
		
	}

}
