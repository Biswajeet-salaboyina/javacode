
public class MainMethod {
	public static void main(String [] args)
	{
		Addexp a = new AddImpl();
		a.Add(2, 3);
		
		Addexp a1 =(x,y)->{
			int z = x+y;
			System.out.println(z);
			};
		a1.Add(2, 05);
		
		Addexp b = (x,y) ->{
			System.out.println(x+y);
		};
		b.Add(1, 03);
		
		Addexp c= (x,y)-> System.out.println(x+y);
		c.Add(3, 44);
	}
}
