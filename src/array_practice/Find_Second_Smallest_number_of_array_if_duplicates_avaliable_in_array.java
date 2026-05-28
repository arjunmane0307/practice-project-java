package array_practice;

public class Find_Second_Smallest_number_of_array_if_duplicates_avaliable_in_array 
{
	public static void main(String[] args) 
	{
        int arr[]= {70,55,10,20,99,25,105,10,10,10};
		
		int smallest=Integer.MAX_VALUE;
		int secondsmallest=Integer.MAX_VALUE;
		
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i]<smallest)
			{
				secondsmallest=smallest;
				smallest=arr[i];
			}
			else if(arr[i]<secondsmallest && arr[i] != smallest)
			{
				secondsmallest=arr[i];
			}
		}
		System.out.println("Second smollest number is : "+secondsmallest);
	}
}
