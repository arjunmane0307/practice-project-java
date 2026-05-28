package array_practice;

public class Find_Largest_Number_of_Array 
{
	public static void main(String[] args)
	{
		int arr[]= {70,34,76,95,18,75};
		
		int largest=Integer.MIN_VALUE;
		
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
		}
		
		System.out.println("Largest Numer of an array is :"+largest);
	}
}
