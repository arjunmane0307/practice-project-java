package array_practice;

public class Find_Average_of_an_Array 
{
	public static void main(String[] args) 
	{
		int arr[]= {65,67,34,90,34};
		
		int sum=0;
		float avg;
		
		for(int i=0 ; i< arr.length ; i++)
		{
			sum = sum + arr[i];
		}
		
		avg=sum/arr.length;

		System.out.println("Avarage of an array is : "+avg);
	}
}
