import java.util.Arrays;

public class Example {
	
	public static void main(String [] args)
	{
		int [] a = {54,657,4534,7,2,66,78};
//		Arrays.sort(a);
		
		Example e =new Example();
		e.largest(a);
		e.Secondlargest(a);
		e.copy(a);
		e.arrequals(a);
		e.search(a);
	}
	
	public void largest(int [] arr)
	{
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr [arr.length-1]);
		
	}
	public void Secondlargest(int [] arr)
	{
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr [arr.length-2]);
		
	}
	
	public void copy(int [] arr)
	{
		int [] newarr = arr;
		System.out.print(Arrays.toString(newarr));
		
	}
	
	public void arrequals(int [] arr)
	{
		int [] sarr= {2, 7, 54, 66, 78, 657, 4534}; 
		
		
		if( arr.length == sarr.length)
		{
			 boolean b = Arrays.equals(arr, sarr);
			 if (b == true)
			 {
				 System.out.println("Arrays are equal");
			 }
			 else {
				 System.out.println("not equal");
			 }
		}
		else {
			System.out.println("not equal");
		}
		
	}
	
	public void search(int [] arr) 
	{
		for(int i =0 ; i<arr.length ;i++)
		{
			if (arr [i] == 66) 
			{
				System.out.print(i);
				break;
			}
			else 
			{
				System.out.println("not found");
				break;
			}
			
		}
		
		
	}
	

	
	
	
	
	

}
