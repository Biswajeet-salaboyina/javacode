import java.util.Scanner;

public class Switch {
	
	public static void main(String [] args)
	{
		Scanner sc =new Scanner (System.in);
//		char c = sc.next;
		
		char c ='O';
//		char k = c.tolowerChar();
		
		switch(c) {
		case 'a':
		case 'A':
		{
			System.out.println("Vowel is a ");
			break;
		}
		case 'e':
		case 'E':
		{
			System.out.println("Vowel is e ");
			break;
		}
		case 'i':
		case 'I':
		{
			System.out.println("Vowel is i ");
			break;
			
		}
		case 'o':
		case 'O':
		{
			System.out.println("Vowel is o ");
			break;
		}
		case 'u':
		case 'U':
		{
			System.out.println("Vowel is u ");
			break;
		}
		
		default:{
			System.out.println("Consonents");
		}
		
		}
	}

}
