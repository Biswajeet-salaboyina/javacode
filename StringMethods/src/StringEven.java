
public class StringEven {
	public static void main (String [] args) {
		StringEven e = new StringEven();	
		e.evenstring("Hello");
	}
	
	public void evenstring(String s)
	{
//		String [] a = s.split("\\s");
		for (int i =0; i<s.length(); i+=2)
		{
			System.out.println(s.charAt(i));
		}
	}
}
