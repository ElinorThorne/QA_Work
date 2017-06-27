/*Function class to convert:
 * Capital letter to lower case
 * Lower case to capital
 * Double a digit
 * Keep characters as are 
 */

public class ASCIIPracticeFunctions
{
	public void ASCII(String s)
	{
		System.out.println(s);
		char ch = ' ';
		char n = ' ';
		for(int a = 0; a<s.length(); a++)
		{
			ch = s.charAt(a);
			//lower case
			if( (int)ch >=97 && (int)ch <=122 )
			{
				int num = (int)ch-32;
				n = (char)num;		
				System.out.print(n);
			}
			//upper case
			else if( (int)ch >=65 && (int)ch <=90 )
			{
				int num = (int)ch+32;
				n = (char)num;		
				System.out.print(n);
			}
			//numbers
			else if( (int)ch >=48 && (int)ch <=57 )
			{
				int num = (Character.getNumericValue((int)ch)) * 2;
				System.out.print( num );
			}			
			//character
			else
			{
				System.out.print(ch);
			}

		}	
		
	}
}
