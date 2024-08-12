package oops;

interface Bank1
{
	void deposit();
	void withdraw();
}
interface Bank2
{
	void interestrate();
	void balancedetails();
}
class ICIC implements Bank1,Bank2
{

	@Override
	public void interestrate() {
		System.out.println("interest rate");
		
	}

	@Override
	public void balancedetails() {
		System.out.println("balance details");
		
	}

	@Override
	public void deposit() {
		System.out.println("deposit");
		
	}

	@Override
	public void withdraw() {
		System.out.println("withdraw");
		
	}
	
}
public class Multipleinheritance {
	public static void main(String[] args)
	{
		ICIC ob=new ICIC();
		ob.deposit();
		ob.interestrate();
		ob.balancedetails();
		ob.withdraw();
	}

}
