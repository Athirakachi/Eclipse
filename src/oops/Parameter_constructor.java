package oops;

public class Parameter_constructor {
	
	int empid,salary;
	String desi;
	
	/*public Parameter_constructor(int empid, int salary,String desi)
	{
		this.empid=empid;
		this.salary=salary;
		this.desi=desi;
	}*/
	
	public Parameter_constructor(int id,int sal,String designation)
	{
		empid=id;
		salary=sal;
		desi=designation;
	}
	public static void main(String[] args)
	{
		Parameter_constructor ob=new Parameter_constructor(1,4000,"Tester");
		System.out.println("empid = "+ob.empid);
		System.out.println("salary = "+ob.salary);
		System.out.println("Designation = "+ob.desi);


	}

}
