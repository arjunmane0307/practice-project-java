package string_practice;

public class Reverse_Strings_word_only 
{
	public static void main(String[] args) 
	{
        String st="Interview with the Infosys";
		
		String Reverse_String="";
		
		String words[]=st.split(" ");
		
		for(String word:words)
		{
			String Reverse_word="";
			
			for(int i=word.length()-1 ; i>=0 ; i--)
			{
				Reverse_word = Reverse_word + word.charAt(i);
			}
			
			Reverse_String = Reverse_String + Reverse_word + " ";
		}
		System.out.println("Word Reversed string is : "+Reverse_String);
	}
}
