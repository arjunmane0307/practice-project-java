package array_practice;

import java.util.Arrays;

public class Copy_Array_into_New_Array 
{
	public static void main(String[] args) 
	{
		int arr[]= {10,20,30};
		
		int copy_arr[]=new int[arr.length];
		
		for(int i=0 ; i<arr.length ; i++)
		{
			copy_arr[i]=arr[i];
		}
		
		System.out.println("Actual array is : "+Arrays.toString(arr));
		System.out.println("Copyed array is : "+Arrays.toString(copy_arr));
	}
}
