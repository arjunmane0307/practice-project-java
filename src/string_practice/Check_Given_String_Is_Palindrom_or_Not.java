package string_practice;

public class Check_Given_String_Is_Palindrom_or_Not 
{
	public static void main(String[] args) 
	{
		String str="Madam";
		String Rev_str="";
		
		for(int i=str.length()-1; i>=0 ; i--)
		{
			Rev_str = Rev_str + str.charAt(i);
		}
		
		if(str.equalsIgnoreCase(Rev_str))
		{
			System.out.println("It is Palindram");
		}
		else
		{
			System.out.println("Not a Palindrom");
		}
	}
}
