package string_practice;

public class Find_Duplicates_Charector_From_String 
{
	public static void main(String[] args) 
	{
		String str="asdinaeods";
		int count=0;
		char ch[]=str.toCharArray();
		
		for(int i=0 ; i<ch.length ; i++)
		{
			for(int j=i+1 ; j<ch.length ; j++)
			{
				if(ch[j]==ch[i])
				{
					System.out.println("duplicate charector : "+ch[j]);
					count++;
				}
			}
		}
		
		System.out.println("duplicate charector count is "+count);
	}
}
