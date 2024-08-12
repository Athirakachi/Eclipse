package oops;

public class Area_Triangle {
	
	// without parameter and with return type
	public double area()
	{
		double b=5,h=6,ar;
		ar=0.5*5*6;
		return ar;
	}
	public static void main(String[] args)
	{
		Area_Triangle ob=new Area_Triangle();
		System.out.println("The are of a triangle is "+ob.area());
	}

}
