package oops;

public class Area_Circle {
	
	// with parameter and with return type
	public double area(int r)
	{
		double ar=3.14*r*r;
		return ar;
	}
	public static void main(String[] args)
	{
		Area_Circle ob=new Area_Circle();
		System.out.println("The area of a circle is " +ob.area(5));
	}

}
