
public class NestedReverse 
{
	
	public static void main(String [] args)
	{
		int n=3
				;
		
		for (int i= 0; i<= n; i++)  
		{  
		//outer loop  
		for (int j=1; j<=n-i; j++)  
		{  
		System.out.print(" ");  
		}  
		for (int k=0;k<=i;k++)  
		{  
		System.out.print("*");  
		}   
		System.out.println("");  
		}  
//		for(int i=0;i<=3;i++)
//		{
//			for (int j=1; j<=3-i;j++)
//			{
//				System.out.println();
//			}
//			
//			for(int k=0; k<=i;k++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();		
//		}
//		
////		for(int i=0;i<4;i++)
////		{
////			for(int j=i;j<4;j++)
////				
////			{
////				System.out.print("*");
////			}
////			System.out.println();
////		}
	}
}
