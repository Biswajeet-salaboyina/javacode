import java.util.HashSet;

import java.util.Set;
public class Setexp {


		public static void main(String [] args)
		{
			Set<Integer>  l = new HashSet<>();
			l.add(23);
			l.add(11);
			l.add(54);
			l.add(33);
			l.add(54);
			l.add(33);
			System.out.println(l);
			int length = l.size();
			System.out.println(length);
			l.remove(11);
			System.out.println(l);
		
		
			System.out.println(l);
		
			System.out.println(l);
			for(Integer i : l)
			{
				System.out.println(i);
			}
		}
	}


