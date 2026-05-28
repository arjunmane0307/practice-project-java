package array_practice;

public class Find_Smallest_Value_of_Array 
{
	public static void main(String[] args) 
	{
		int arr[]= {70,34,76,95,18,75};
		
		int smallest=Integer.MAX_VALUE;
		
		for(int i=0 ; i< arr.length ; i++)
		{
			if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
		}
		
		System.out.println("Smallest number of an array is : "+smallest);
	}
}
