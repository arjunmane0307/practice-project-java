package examples_practice;

import java.util.Scanner;

public class Check_given_number_prime_or_not 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter input : ");
		int num=sc.nextInt();
		
		boolean isprime=true;
		
		if(num<=1)
		{
			isprime=false;
		}
		else
		{
			for(int i=2 ; i<num ; i++)
			{
				if(num % i == 0)
				{
					isprime=false;
					break;
				}
			}
		}
		
		if(isprime)
		{
			System.out.println("it is prime number");
		}
		else
		{
			System.out.println("it is not a prime number");
		}
		
		sc.close();
	}
}
