
public class SubstringSentenceTest
{

	public static void main(String[] args)
	{
		String s = "There are more words in this sentence";
		int spaces = 1;
		for(int a=0; a<s.length(); a++)
		{			
			if (s.substring(a, a+1).equals(" "))
				spaces++;
		}
		
		if(spaces >1)
			System.out.println("There are " + (spaces) + " words in this sentence");
		else
			System.out.println("There is " + (spaces) + " word in this sentence");
	}

}
