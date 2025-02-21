
public class MainMethod {
	public static void main (String [] args)
	{
		CarShip c = new CarShip();
		c.colour();
		c.engine();
		c.interior();
		c.tyres();
		
		System.out.println("..................");
		
		Car b = new CarShip();
		b.colour();
		b.engine();
//		b.interior();
		b.tyres();
	}
}
