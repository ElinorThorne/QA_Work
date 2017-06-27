
public class ReverseSubstringPrintWords
{

	public static void main(String[] args)
	{

		String s = "Hello my name is El";
		String rev = "";
		
		for(int a=s.length()-1; a>=0; a--)
		{
			if (!(s.substring(a, a+1).equals(" ")))
			{
				rev = s.substring(a, a+1) + rev;				
			}
			else
			{
				System.out.print( rev );
				rev="";
				System.out.println(s.substring(a, a+1));
			}
		}
		System.out.print(rev);
	}
}
