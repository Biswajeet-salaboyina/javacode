import java.util.*;

public class ArrayL {
	public static void main(String [] args)
	{
		List<Integer>  l = new ArrayList<>();
		l.add(23);
		l.add(11);
		l.add(54);
		l.add(33);
		System.out.println(l);
		int length = l.size();
		System.out.println(length);
		System.out.println(l.get(2));
		int k = l.remove(3);
		System.out.println(k);
		System.out.println(l);
		l.add(2, 34);
		System.out.println(l);
		for(Integer i : l)
		{
			System.out.println(i);
		}
	}
}
