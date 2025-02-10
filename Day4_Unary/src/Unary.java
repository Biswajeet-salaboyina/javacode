
public class Unary {
	public void increment()
	{
		int i = 10;
		int l= i++;
		
		System.out.println(l);
	}
	
	public void n()
	{
		Decrement d = new Decrement();
		int r = d.dec(5);
		System.out.println(r);
	}
}
