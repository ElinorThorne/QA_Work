
public class SubstringPrintWordsLn
{

	public static void main(String[] args)
	{

		String s = "There are more words in this sentence";
		
		for(int a=0; a<s.length(); a++)
		{
			if (!(s.substring(a, a+1).equals(" ")))
				System.out.print(s.substring(a, a+1));
			else
				System.out.println("\n");
		}
		
	}

}
