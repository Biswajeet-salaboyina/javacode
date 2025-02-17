import java.util.Arrays;

public class ArrayExample {

	public static void main(String [] args)
	{
		int [] j = {1,3,5,998,554,546,76869};
		System.out.println(Arrays.toString(j));
		j[j.length-1]=233;
		j[3] = 123;
		System.out.println(Arrays.toString(j));
	 Arrays.sort(j);
	 System.out.println(Arrays.toString(j));
	 
	 
	 /// Replacing the data 
	 for(int i=0; i<j.length; i++)
	 {
		 if(j[i]== 5)
		 {
			 
			 j[i] =  10;
			 System.out.println(j[i] + " ");
		 }
		 
		 else
		 
		 {
		 System.out.println(j[i]);
		 }
	 }
		
	}
}
