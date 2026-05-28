package string_practice;

public class Reverse_Complete_String 
{
	public static void main(String[] args) 
	{
        String st="Interview with the Infosys";
		
		String Reverse_String="";
		
		String word[]=st.split(" ");
		
		for(int i=word.length-1 ; i>=0 ; i--)
		{
			Reverse_String = Reverse_String + word[i] + " ";
		}
		
		System.out.println("Complete reversed string is : "+Reverse_String);
	}
}
