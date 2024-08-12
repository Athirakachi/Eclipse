package oops;

class Encap
{
	private String designation;
	private String name;
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class Encapsulation {
	public static void main(String[] args)
	{
		Encap ob=new Encap();
		ob.setName("Kukku");
		System.out.println(ob.getName());
		ob.setDesignation("Tester");
		System.out.println(ob.getDesignation());
		
	}

}
