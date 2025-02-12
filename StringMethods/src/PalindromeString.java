
public class PalindromeString {
	
	public static void main(String [] args) {
		PalindromeString s = new PalindromeString();
		s.palin("Hello");
	}
	
	public void palin(String s)
	
	{
		String s1 =s.toLowerCase();
		
		int left = 0;
		int right = s1.length()-1;
		
		while(left<right) {
			if(s1.charAt(left) != s1.charAt(right)) {
				System.out.println("Not palindrome");
				return;
			}
//			else
//			{
//				System.out.println("Palindrome");
//			}
			left++;
			right --;
		}
		System.out.println("Palindrome");
		System.out.println(s1);
	}

}
