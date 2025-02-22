
public class ThrowExample {
		public static void main(String [] args)
		{
			try {
			age(15);
			}
			catch (RuntimeException e)
			{
				e.printStackTrace();
			}
		}
		
		public static void  age(int age)
		{
			
			if(age < 18)
			{
				throw new RuntimeException("Age is less than 18"); 
			}
		}
}
