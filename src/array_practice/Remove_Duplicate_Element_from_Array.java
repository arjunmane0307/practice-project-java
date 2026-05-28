package array_practice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Remove_Duplicate_Element_from_Array 
{
	public static void main(String[] args) 
	{
		int arr[]= {23,10,34,23,44,70,60,70,44,60};
		
		// using HashSet collection
		System.out.println("Using Hash Set collection...");
		
		HashSet<Integer> hs=new HashSet<>();
		
		for(int i=0 ; i< arr.length ; i++)
		{
			hs.add(arr[i]);
		}
		System.out.println("After Removed duplicated array is : "+hs);
		
		// or
		
		for(int num:arr)
		{
			hs.add(num);
		}
		System.out.println("After Removed duplicated array is : "+hs);
		System.out.println("--------------------------------------------------------------");
		
		
		// using LinkedHashSet
		System.out.println("Using Linked Hash Set collection...");
		
		
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
		
		for(int i=0 ; i<arr.length ; i++)
		{
			lhs.add(arr[i]);
		}
		System.out.println("After Removed duplicated array is : "+lhs);
		
		//or 
		
		for(int num:arr)
		{
			lhs.add(num);
		}
		System.out.println("After Removed duplicated array is : "+lhs);
		
		
	}
}
