import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExp {

	public static void main(String [] args)
	{
		Map <Integer, String> m = new HashMap<>();
		m.put(1, "a");
		m.put(3,"c");
		m.put(2, "b");
		m.put(4,"d");
		m.put(null, "r");
		
		System.out.println(m);
		
		Set <Integer> s = m.keySet();
		System.out.println(s);
		
		Collection<String> st = m.values();
		System.out.println(st);
		
		for(Map.Entry<Integer, String> mq : m.entrySet())
		
		{
			System.out.print(mq.getKey());
			System.out.print(mq.getValue());
		}
		
	}
}
