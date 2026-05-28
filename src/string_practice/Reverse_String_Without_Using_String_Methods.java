package string_practice;

public class Reverse_String_Without_Using_String_Methods 
{
	public static void main(String[] args) 
	{
        String st="Interview with the Infosys";
		
		String Reverse_String="";
		
		char str[]=st.toCharArray();
		
		for(int i=str.length-1; i>=0 ; i--)
		{
			Reverse_String = Reverse_String + str[i];
		}
		
		System.out.println("Reversed String is : "+Reverse_String);
	}
}
