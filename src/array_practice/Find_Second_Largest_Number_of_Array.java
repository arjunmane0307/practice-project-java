package array_practice;

public class Find_Second_Largest_Number_of_Array 
{
	public static void main(String[] args) 
	{
		int arr[]= {70,55,10,20,99,25,105};
		
		int largest=Integer.MIN_VALUE;
		int secondlargest=Integer.MIN_VALUE;
		
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i]>largest)
			{
				secondlargest=largest;
				largest=arr[i];
			}
			else if(arr[i]>secondlargest)
			{
				secondlargest=arr[i];
			}
		}
		
		System.out.println("Second Largest number of an array is : "+secondlargest);
	}
}
