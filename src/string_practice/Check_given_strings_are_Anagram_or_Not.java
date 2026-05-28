package string_practice;

import java.util.Arrays;

public class Check_given_strings_are_Anagram_or_Not
{
	public static void main(String[] args) 
	{
		String str1="asdf";
		String str2="dfsa";
		
		char ar[]=str1.toCharArray();
		char ar1[]=str2.toCharArray();
		
		Arrays.sort(ar);
		Arrays.sort(ar1);
		
		if(Arrays.equals(ar, ar1))
		{
			System.out.println("Given strings are anagram");
		}
		else
		{
			System.out.println("They are not abnagram");
		}
	}
}
