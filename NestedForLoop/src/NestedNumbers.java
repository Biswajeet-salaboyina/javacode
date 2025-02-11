
public class NestedNumbers {
	
	public static void main(String []args)
	{
		for (int i=1;i<4;i++)
		{
			for (int j=i;j<4;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		for (int i=1;i<4;i++)
		{
			for (int j=1;j<i+1;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
