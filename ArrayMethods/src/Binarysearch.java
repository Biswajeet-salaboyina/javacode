import java.util.Arrays;

public class Binarysearch {

	
	public static void main(String [] args)
	{
		Binarysearch b = new Binarysearch();
		b.bin();
		
	}
	
	public void bin()
	{
		 int [] k = {2,6,9,7,5,3};
		 Arrays.sort(k);
		 System.out.println(Arrays.toString(k));

		boolean b =false;
		 int high = k.length-1;
		 System.out.println(high);
		 int s = 7;
		 int low =0;
		 
		 while(low<= high)
		 {
			 int mid = low + (high -low)/2;
			 if(k [mid] == s)
			 {
				 System.out.println("Target is " + mid);
				 b = true;
				 break;
			 }
			 else if(s < k [mid])
			 {
				 high = mid - 1;
			
			 }
			 else
			 {
				 low = mid+1;
			 }
		 }
		 if(!b)
		 {
			 System.out.println("Element not found");
		 }
		 
	}
}
