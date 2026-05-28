package array_practice;

public class Find_Second_Largest_number_of_array_if_duplicates_avaliable_in_array 
{	
	public static void main(String args[])
	{
        int arr[]= {70,55,10,105,20,99,25,105,10,105,};
		
		int largest=Integer.MIN_VALUE;
		int secondlargest=Integer.MIN_VALUE;
		
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i]>largest)
			{
				secondlargest=largest;
				largest=arr[i];
			}
			else if(arr[i]>secondlargest && arr[i] != largest)
			{
				secondlargest=arr[i];
			}
		}
		System.out.println("Second largest number is : "+secondlargest);
	}
}
