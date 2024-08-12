package oops;

public class Area_Rectangle {
	
	// Without return type and with parameter
	public void area(int l, int b)
	{
		int ar=l*b;
		System.out.println("The area of rectangle is "+ar);
	}
	public static void main(String[] args)
	{
		Area_Rectangle ob= new Area_Rectangle();
		ob.area(5, 8);
	}

}
