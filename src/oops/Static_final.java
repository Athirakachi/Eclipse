package oops;
class Schooldetails
{
	 final String schoolname="Luminar";
	 static String department="English";
}
public class Static_final {
	public static void main(String[] args)
	{
		System.out.println(Schooldetails.department);
		System.out.println(Schooldetails.department="Malayalam");
		System.out.println(Schooldetails.department);
		Schooldetails sc=new Schooldetails();
		System.out.println(sc.schoolname);
	}
	

}
