package controlstmnts;

public class Ifstmnts {
	public static void main(String[] args)
	{
		//Simple if statements
		
		int a=10;
		if(a==10)
		{
			System.out.println("Hello world");
		}
		
		//if-else statements
		
		int age=12;
		if(age>18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			System.out.println("Ineligible for voting");
		}
		
		//else-if Ladder statements
		
		int age1=26;
		if(age1>0&&age1<18)
		{
			System.out.println("Minor");
		}
		else if(age1>=18&&age1<60)
		{
			System.out.println("Major");
		}
		else if(age1>60)
		{
			System.out.println("Retired");
		}
		else
		{
			System.out.println("Invalid input");
		}
		
		//Nested if statements
		
		int age2=20,weight=55;
		if(age2>=18)
		{
			if(weight>50)
			{
				System.out.println("Eligible");
			}
			else
			{
				System.out.println("Ineligible: Under weight");
			}
		}
		else
		{
			System.out.println("Not eligible");
		}
	}

}
