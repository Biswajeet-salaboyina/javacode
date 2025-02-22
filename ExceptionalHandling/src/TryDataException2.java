
public class TryDataException2 {



		public static void main(String [] args) throws DataNotFoundException2
		{
			try {
			age(15);
			}
			catch (RuntimeException e)
			{
				e.printStackTrace();
			}
		}
		
		public static void  age(int age) throws DataNotFoundException2
		{
			
			if(age < 18)
			{
				throw new DataNotFoundException2("Age is less than 18"); 
			}
		}
}

