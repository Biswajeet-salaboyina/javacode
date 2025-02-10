import java.util.Scanner;

public class Condition {
	
	public static void main (String[] args)
	{
		
//		 int age =12;
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter age");
		 int age = sc.nextInt();
		 
		 
		 
		 if (age> 18) {
			 Elgible();
		 }
		 else
		 {
			 System.out.println("not elgible");
		 }
		 
		 sc.close();
		
	}
	
	
	public static void Elgible()
	{
		System.out.println("Eligible");
	}

}