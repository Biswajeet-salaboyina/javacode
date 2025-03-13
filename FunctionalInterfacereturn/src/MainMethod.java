
public class MainMethod {
	public static void main(String [] args )
	{
		Addexp e = (x,y)->{
			int z = x + y;
			return z;
		};
		
		int res = e.add(6, 1);
		System.out.println(res);
		
		Addexp e1 =(x, y)-> x+y;
		int res1 = e1.add(2, 7);
		System.out.println(res1);
	}
}
