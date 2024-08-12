package string_methods;

public class Classwork_3 {
	public static void main(String[] args)
	{
		String s3="Selenium webdriver is used for webapplication testing";
		String words[]=s3.split(" ");
		/*for(String temp:words)
		{
			System.out.println(temp);
		}*/
		for(String temp:words)
		{
			System.out.println(temp);
			if(temp.contains("webapplication"))
			{
				break;
			}
			/*else
			{
				System.out.println("A");
			}*/
		}
	}

}
