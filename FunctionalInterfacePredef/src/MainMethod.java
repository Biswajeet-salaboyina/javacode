import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainMethod {
	public static void main(String [] args)
	{
		Predicate<Integer> p = (x)->
		{
			if(x%2 == 0) {
			return true;
			}
			else
			{
				return false;
			}
		};
		boolean res = p.test(4);
		System.out.println(res);
		
		Predicate <Integer> p1 = (x) -> x% 2 == 0;
		boolean result = p1.test(3);
		System.out.println(result);
		
		Consumer <String> s = (a)->{
			String sq = a.toLowerCase();
			System.out.println(sq);		};
			s.accept("REE");
			
		Supplier <Integer> i = ()->{
				Random rn = new Random();
				int num = rn.nextInt();
				return num;
		};
		int resw= i.get();
		System.out.println(resw);
			
	}
}
