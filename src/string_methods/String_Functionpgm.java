package string_methods;

public class String_Functionpgm {
	public static void main(String[] args)
	{
		//Length of the string
		String s="welcome";
		System.out.println(s.length());
		/*int w=s.length();
		System.out.println(w);*/
		
		// To join two strings
		String s1="Hello";
		String s2=" Luminar";
		System.out.println(s1.concat(s2));
		
		System.out.println(s1+s2);
		System.out.println(s1+1+2);
		System.out.println(1+2+s1);
		
		String s3="Luminar";
		System.out.println(s3.toLowerCase());
		System.out.println(s3.toUpperCase());
		System.out.println(s3.startsWith("u"));
		System.out.println(s3.endsWith("a"));
		
		//Compare two strings
		
		String s4="abc";
		String s5="Abc";
		System.out.println(s4.equals(s5));
		System.out.println(s4.equalsIgnoreCase(s5));
		
		// To trim white spaces from starting and ending
		
		String a=" Luminar ";
		System.out.println(a);
		System.out.println(a.trim());
		
		//To extract a particular portion from string
		
		String a1="welcome";
		System.out.println(a1.substring(3));
		System.out.println(a1.substring(0,4));
		
		String b="Welcome to luminar";
		System.out.println(b.contains("Luminar"));
		System.out.println(b.contains("luminar"));
		
		System.out.println(b.replace("el", "wx"));
		
		System.out.println(a1.charAt(5));
		
		// To split words from sentences
		
		String w1="Welcome to luminar";
		String words[]=w1.split(" ");
		for(String l:words)
		{
			System.out.println(l);
		}
		
		// To split character from a word
		
		String t="hello";
		char c1[]=t.toCharArray();
		for(char v:c1)
		{
			System.out.println(v);
		}
		
		
	}

}
