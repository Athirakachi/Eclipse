package oops;

abstract class Google
{
	static int a=30;
	abstract void message();
	public void search()
	{
		System.out.println("Search all details");
	}
}
class SearchAll extends Google
{

	@Override
	void message() {
		System.out.println("Search all");
		
	}
	
}
class SearchImage extends Google
{

	@Override
	void message() {
		
		System.out.println("Search all images");
	}
	
}
class SearchVideo extends Google
{

	@Override
	void message() {
		System.out.println("Search all videos");
		
	}
	
}
public class Abstarct_class {
	public static void main(String[] args)
	{
		SearchAll s=new SearchAll();
		s.message();
		s.search();
		System.out.println(Google.a);
		
		SearchImage i=new SearchImage();
		i.message();
		i.search();
		
		SearchVideo v=new SearchVideo();
		v.message();
		v.search();
	}

}
