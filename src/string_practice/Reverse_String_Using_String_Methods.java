package string_practice;

public class Reverse_String_Using_String_Methods 
{
	public static void main(String[] args) 
	{
		String st="Interview with the Infosys";
		
		String Reverse_String="";
		
		for(int i=st.length()-1 ; i>=0 ; i--)
		{
			Reverse_String = Reverse_String + st.charAt(i);
		}
		
		System.out.println("Reversed String is : "+ Reverse_String);
	}
}
