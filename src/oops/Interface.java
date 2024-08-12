package oops;

interface Whatsappcalls
{
	int a=10;
	void calls();
	void mute();
	void disconnect();
}
class Audiocalls implements Whatsappcalls
{

	@Override
	public void calls() {

System.out.println("whatsapp calls");
		
	}

	@Override
	public void mute() {
		System.out.println("Whatsapp call muted");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Whatsapp call disconnected");
		
	}
	
}
class Videocalls implements Whatsappcalls
{

	@Override
	public void calls() {
		System.out.println("Video calls");
		
	}

	@Override
	public void mute() {
		System.out.println("Video calls are muted");
		
	}

	@Override
	public void disconnect() {
		System.out.println("video calls are disconnected");
		
	}
	
}
public class Interface {
	public static void main(String[] args)
	{
		/*Audiocalls ob= new Audiocalls();
		Videocalls vb=new Videocalls();
		ob.calls();
		ob.mute();
		ob.disconnect();
		System.out.println(ob.a);	
		
		vb.calls();
		vb.mute();
		vb.disconnect();
		System.out.println(vb.a);*/
		
		Whatsappcalls wb=new Audiocalls();
		wb.calls();
		wb.mute();
		wb.disconnect();
		
		wb=new Videocalls();
		wb.calls();
		wb.mute();
		wb.disconnect();
		
		System.out.println(wb.a);
		
		
	}

}
