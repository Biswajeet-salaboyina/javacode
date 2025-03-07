
public class ExampleWrapper {

	public static void main(String [] args)
	{
		//Auto boxing
		int i =10;
		Integer i2 = i;
		System.out.println(i2);
		
		long l = 23L;
		Long l2 = l;
		System.out.println(l2);
		
		//Unboxing 
		Integer k = 50;
		int r = k;
		System.out.println(r);
		
		Integer q = new Integer(20);
		int d = q;
		System.out.println(d);
		
		
	}
}
