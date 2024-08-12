package oops;

public class Area_Square {
	
	// without parameter and without return type
	public void area()
	{
		int side=10,ar;
		ar=side*side;
		System.out.println("The area of a square is " +ar);
	}
	public static void main(String[] args)
	{
		Area_Square ob=new Area_Square();
		ob.area();
	}

}
