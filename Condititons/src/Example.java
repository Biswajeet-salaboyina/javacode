import java.util.Scanner;

public class Example {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter marks");
		 int marks = sc.nextInt();
		 
		 if (marks >=0 && marks <41) {
			 System.out.println("Fail");
		 }
		 else if(marks >40 && marks <60)
		 {
			 System.out.println("C");
		 }
		 else if (marks > 59 && marks <75)
		 {
			 System.out.println("B");
		 }
		 else if (marks > 74 && marks <880)
		 {
			 System.out.println("A");
		 }
		 else if (marks >79 && marks <101)
		 {
			 System.out.println("A++");
			 
		 }
		 else
		 {
			 System.out.println("Invalid");
		 }
		 sc.close();
		
	}

}
