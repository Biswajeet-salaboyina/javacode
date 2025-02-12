import java.util.Arrays;

public class StringMethodTypes {
	
	public static void main(String [] args)
	{
//		String s ="Hi";
		
		StringMethodTypes t =new StringMethodTypes();
		t.Message("hi");
		t.At("Hello");
		t.IgnoreCase("hi");
		t.StartW("Hello");
		t.Trim( "   Hi  ");
		t.len("World");
		t.lcase("ABCDER");
		t.contain("JAVA ");
		t.sustring("Console");
		t.reverse("Welcome to java");
		 
		
		
	}
	
	public void Message(String s)
	{
		String k = s.concat("World");
		System.out.println("The Concat of string is " +k);
	}
	
	public void At(String s)
	{
		char k = s.charAt(4);
		System.out.println("Character at is " +k);
		
	}
	
	public void IgnoreCase(String s)
	{
		
		boolean b =s.equalsIgnoreCase("Hi");
		System.out.println("Ignore case "+ b);
	}
	public void StartW(String s)
	{
		boolean b =s.startsWith("H");
		System.out.println("Starts with " +b);
		
	}
	public void Trim(String s)
	{
		String  b = s.trim();
		System.out.println("After Trim " +b);
		
	}
	public void len(String s)
	{
		int l =s.length();
		System.out.println("Length of string " + l);
		
	}
	public void lcase(String s)
	{
		String k = s.toLowerCase();
		System.out.println("Lower case of string " + k);
	}
	public void contain(String s )
	{
		boolean b= s.contains("av");
		System.out.println("Contains " +b);
	}
	
	public void sustring(String s) {
	 String r= s.substring(1, 4);
	 System.out.println("Substring " +r);
	}
	
	public void reverse(String s)
	{
		String [] q =s.split("\\s");
		for (int i =0; i<q.length ; i++)
		{
//			System.out.println(q[i]);
			String s2 =q[i];
			for (int j = s2.length()-1 ;j>=0; j--)
			{
				System.out.print(s2.charAt(j));
			}
			System.out.println();
		}
//		System.out.println(Arrays.toString(q));
		//Reverse  a String 
		
		for (int  k =s.length()-1; k>=0; k--)
		{
			System.out.print(s.charAt(k));
		}
		
	}

}
