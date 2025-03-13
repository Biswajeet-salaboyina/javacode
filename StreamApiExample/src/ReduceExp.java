import java.util.List;
import java.util.Optional;

public class ReduceExp {
	public static void main(String [] args)
	{
		List<String> st = List.of("Abc","ce");
		List<String> t = List.of("Abc","ce","wer");
		
		Optional<String> s =st.stream().reduce((x,y)-> x.length()>y.length()? x:y);
		System.out.println(s.get());
		Optional<String> q =t.stream().reduce((a,b)-> a +b);
		System.out.println(q.get());
	}
	
}	
