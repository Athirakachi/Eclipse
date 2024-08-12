package oops;

public class Instance_variable {
	int empid,salary;
	String designation;
	// Using local variable name same as instance variable name
	
	/*public void setvalues(int empid,int salary,String designation)
	{
		this.empid=empid;
		this.salary=salary;
		this.designation=designation;
	}*/
	
	// Using deifferent names for instance and local variables
	
	public void setvalues(int id,int sal,String desi)
	{
		empid=id;
		salary=sal;
		designation=desi;
	}
	public void display()
	{
		System.out.println("Emp id: "+empid);
		System.out.println("Salary: "+salary);
		System.out.println("Designation: "+designation);
	}
	public static void main(String[] args)
	{
		Instance_variable ob=new Instance_variable();
		ob.setvalues(1, 50000, "designer");
		ob.display();
		
	}

}
