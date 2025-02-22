
public class TryExample2 {
			public static void main(String [] args )
			{
				try 
				{
				String s = null;
				s.toUpperCase();
				System.out.println(s);
				}
				
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
				
				
			}
}
