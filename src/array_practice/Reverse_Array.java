package array_practice;

import java.util.Arrays;

public class Reverse_Array
{
	public static void main(String[] args) 
	{
		int arr[]= {10,20,30,40,50};
		
		int rev_arr[]=new int[arr.length];
		
		for(int i=0, j=arr.length-1 ; i<arr.length ; i++,j--)
		{
			rev_arr[j]=arr[i];
		}
		
		System.out.println("Actual array is : "+ Arrays.toString(arr));
		System.out.println("Reversed array is : "+ Arrays.toString(rev_arr));
	}
}
