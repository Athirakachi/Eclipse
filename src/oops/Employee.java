package oops;

public class Employee {
	int empid,deptid;
	String designation,empname;
	public void display()
	{
		System.out.println(empid);
		System.out.println(deptid);
		System.out.println(empname);
		System.out.println(designation);
	}
	public static void main(String[] args)
	{
		Employee emp=new Employee();
		emp.empid=101;
		emp.deptid=001;
		emp.empname="Rinil";
		emp.designation="Tester";
		emp.display();
	}
	

}
