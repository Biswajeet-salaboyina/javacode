
public class ExampleB extends ExampleA{
	public int mul(int a, int b)
	{
		return a*b;
	}
	
	public  String Upper(String s)
	{
		String st =super.Upper(s);
		return st;
//		return s.toUpperCase();
	}
}
