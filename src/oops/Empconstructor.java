package oops;

public class Empconstructor {
	// Defining instance variable
	
	int empid,salary;
	String designation;
	
	// declaring constructor
	
	public Empconstructor()
	{
		empid=1;
		salary=50000;
		designation="Designer";
	}
	public static void main(String[] args)
	{
		Empconstructor ob=new Empconstructor();
		System.out.println("Empid : "+ob.empid);
		System.out.println("Salary : "+ob.salary);
		System.out.println("Designation : "+ob.designation);
	}

}
