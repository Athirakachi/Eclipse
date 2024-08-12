package basic;

public class Assignmentop {
	public static void main(String[] args)
	{
		int a=55;
		System.out.println(a);
		int b=a;
		//b=55
		System.out.println(b);
		b+=a;
		//b=b+a
		//b=55+55
		//b=110
		System.out.println(b);
		b-=a;
		//b=b-a;
		//b=110-55;
		//b=55
		System.out.println(b);
		b*=a;
		//b=b*a
		//b=55*55
		//b=3025
		System.out.println(b);
		b/=a;
		//b=b/a
		//b=3025/55
		//b=55
		System.out.println(b);
	}
}
