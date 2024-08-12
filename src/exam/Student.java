package exam;
interface Principal
{
	void resign();
	void rejoin();
}
class Students
{
	void marks()
	{
		int mark=75;
		System.out.println("The mark is "+mark);
	}
	void showdetails()
	{
		String name="Leena";
		System.out.println("Name of student is "+name);
	}
}
class Teacher extends Students implements Principal
{
	void department() 
	{
		System.out.println("department");
	}

	@Override
	public void resign() {
		System.out.println("Resign");
		
	}

	@Override
	public void rejoin() {
		System.out.println("Rejoin");
		
	}
}

public class Student {
	public static void main(String[] args)
	{
		Teacher ob=new Teacher();
		ob.showdetails();
		ob.marks();
		ob.department();
		ob.resign();
		ob.rejoin();
		
		
	}

}
