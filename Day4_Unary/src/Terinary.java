
public class Terinary {
	
	public static int  age(int k)
	{
//		int a =21;
		Terinary t =new Terinary(); // created object to call non static 
		
		int   s = (k<18) ? t.add(10,10) :t.mul(10,10);
		
		return s;
		
//		System.out.println(s);
		
		
	}
	
	public  int add (int a, int b) // non static 
	{
		int res= a+b;
		return res;
		
		
	}
	
	public  int mul (int a, int b)
	{
		int res= a*b;
		return res;
		
		
	}

}
