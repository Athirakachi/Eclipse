package exam;

class Classroom
{
	int rollno,mark;
	String name;
	void store()
	{
		rollno=01;
		mark=75;
		name="Steny";
	}
	void display() {
		System.out.println("Roll number is "+rollno);
		System.out.println("Name is " +name);
		System.out.println("Mark is "+mark);
	}
}

public class Classroom_Details {
	public static void main(String[] args)
	{
		Classroom ob=new Classroom();
		ob.store();
		ob.display();
	}

}
