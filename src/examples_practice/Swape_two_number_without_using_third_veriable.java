package examples_practice;

public class Swape_two_number_without_using_third_veriable 
{
	public static void main(String[] args) 
	{
		int a=21, b=18;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swap a is :"+a);
		System.out.println("After swap b is :"+b);
	}
}
