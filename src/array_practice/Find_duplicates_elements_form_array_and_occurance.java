package array_practice;

public class Find_duplicates_elements_form_array_and_occurance 
{
	public static void main(String[] args) 
	{
		int arr[]= {10,10,30,20,30,20,50,70};
		int count =0;
		
		for(int i=0 ; i<arr.length ; i++)
		{
			for(int j=i+1 ; j<arr.length ; j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate element : "+arr[j]);
					count ++;
				}
			}
		}
		System.out.println("occurance of duplicate element is : "+count);
	}
}
