import java.util.Arrays;

public class StringSort {
	public static void main(String[] args)
	{
		StringSort s =new StringSort();
		s.strsort("zyx");
		
	}
	
	public void strsort(String s)
	{
		char [] k =s.toCharArray();
		
		Arrays.sort(k);
		
		 String sortedString = new String(k);
	        System.out.println("Sorted string: " + sortedString);
		
	}
}
