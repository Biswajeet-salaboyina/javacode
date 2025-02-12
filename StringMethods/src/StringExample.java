
public class StringExample {
		public static void main(String[] args)
		{
			String s = "Hello";
			String s1 = "Hello";
			
			String st =new String("Hello");
			
			if(s==s1)
			{
				System.out.println(true);
			}
			else
			{
				System.out.println(false);
			}
			
			System.out.println("Object String");
			
			if(s==st)
			{
				System.out.println(true);
			}
			else 
			{
				System.out.println(false);
			}
			
		}
}

