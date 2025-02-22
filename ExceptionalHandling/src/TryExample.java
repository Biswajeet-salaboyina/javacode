import java.util.Arrays;

public class TryExample {
	public static void main(String [] args)
	{
		try {
		int [] a = new int [5];
		a[0] = 3;
		a[1]= 33;
		a[2] = 32;
		a[3] = 99;
		a[4] = 22;
		
		
		System.out.println(Arrays.toString(a));
		
		int b = 5;
		int c = 5/0;
		}
		
		catch (ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println(e.getLocalizedMessage());
		}
		catch (ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		
		finally {
		System.out.println("this is finally") ;
		}
		
	}
}
