package oops;

class Member
{
	String name,address;
	int age,salary;
	void printdetails()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Adderess : "+address);
		System.out.println("Salary : "+salary);
	}
}

class Worker extends Member
{
	String specialization;
}

class Manager extends Member
{
	String department;
}

public class Classwork {
	public static void main(String[] args)
	{
		Worker wb=new Worker();
		Manager mb=new Manager();
		
		wb.specialization="Biology";
		wb.name="Athira";
		wb.age=30;
		wb.address="Nalini Bhavan";
		wb.salary=30000;
		wb.printdetails();
		System.out.println("Specialization : "+wb.specialization);
		mb.name="Rithwika";
		mb.age=25;
		mb.address="Thiruvathira";
		mb.salary=45000;
		mb.printdetails();
		mb.department="Chemistry";
		System.out.println("department : "+mb.department);
	}

}
