package string_practice;

public class Count_vowels_and_consonants_from_string 
{
	public static void main(String[] args) 
	{
		String str="asdinheosdunmdsinmcmaxchbje";
		int v_count=0;
		int c_count=0;
		char ch[]=str.toCharArray();
		
		for(int i=0 ;i<ch.length ; i++)
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
			{
				v_count++;
				System.out.println("vowel : "+ch[i]);
			}
			else
			{
				c_count++;
				System.out.println("consonant : "+ch[i]);
			}
		}
		
		System.out.println("No of vowels are : "+v_count);
		System.out.println("No of consonants are : "+c_count);
	}
}
