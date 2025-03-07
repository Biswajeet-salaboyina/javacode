import java.util.ArrayList;
import java.util.List;

public class ArrayString {
	public static void main(String [] args)
	{
		List <String> s = new ArrayList<>();
		{
			s.add("hello");
			s.add("asd");
			System.out.println(s);
			String s1 = s.get(0);
			System.out.println(s1);
			s.add(2,"af");
			System.out.println(s);
			for( String i : s)
			{
				System.out.println(i);
			}
		}
	}
}
