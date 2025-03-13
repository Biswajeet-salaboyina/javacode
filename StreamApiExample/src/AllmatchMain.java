import java.util.List;

public class AllmatchMain {
	public static void main(String [] args)
	{
		List<Integer> l = List.of(3,2,4,6,9,12,43,15,42);
		
		boolean b =l.stream().anyMatch(n->n%3 ==0 );
		System.out.println(b);
		boolean b1 =l.stream().allMatch(n->n%3 ==0 );
		System.out.println(b1);
	}
}
