/*Function class
 * Combining many number conversion tasks in to
 * one class
 */
public class NumberConversionFunctions implements NumberConversionInterface
{
	//Convert a decimal number to binary string
	public void DecimalToBinary(int num)
	{
		int a = num;
		String ans="";		 
		while(num >=2)
		{
			ans = num % 2 + ans;
			num=num/2;		
		}
		ans=num+ans;
		System.out.println( "The binary number of " + a + " = " + ans );
	}
	//Convert a binary string to decimal number
	public void BinaryToDecimal(String a)
	{
		int dec = 0;
		int x = 1;
		String bin = a;
				
		for(int i=bin.length(); i>0; i--)
		{
			if( i == bin.length())
			{
				if(bin.substring(i-1,i).equals("1"))
					dec = dec + x;
			}
			else
			{
				x = (x*2);
				if(bin.substring(i-1,i).equals("1"))
					dec = dec + x;
			}
		}
		System.out.println( "The decimal number of " + bin + " = " + dec );
	}
	
	//convert a decimal number to string
	public void NumberToString(int a)
	{
		System.out.print( "The string number of " + a + " = ");
		String word = null;
		
		NumberConversionFunctions x = new NumberConversionFunctions();
		
		if(a>=1000)
		{
			word = x.ones(a/1000) + "thousand ";
			System.out.print( word );
			a = a - (a/1000*1000);
		}
		if(a>=100)
		{
			word = x.ones(a/100) + "hundred ";
			System.out.print( word );
			a = a - (a/100*100);
		}
		if(a>=10)
		{
			word = x.ty(a/10*10);
			System.out.print( word );
			a = a - (a/10*10);
		}
		if(a>=1)
		{
			word = x.ones(a);
						
		}		
		System.out.println( word );
	}
	public String ones(int a)
	{
		String x = null;
			
		switch(a)
		{
		case 1: x = "one "; break;
		case 2: x = "two "; break;
		case 3: x = "three "; break;
		case 4: x = "four "; break;
		case 5: x = "five "; break;
		case 6: x = "six "; break;
		case 7: x = "seven "; break;
		case 8: x = "eight "; break;
		case 9: x = "nine "; break;
		case 10: x = "ten "; break;
		case 11: x = "eleven "; break;
		case 12: x = "twelve "; break;
		case 13: x = "thirteen "; break;
		case 14: x = "forteen "; break;
		case 15: x = "fifteen "; break;
		case 16: x = "sixteen "; break;
		case 17: x = "seventeen "; break;
		case 18: x = "eighteen "; break;
		case 19: x = "nineteen "; break;			
		}		
		return x;
	}
	public String ty(int a)
	{
		String x = null;
			
		switch(a)
		{
		case 20: x = "twenty "; break;
		case 30: x = "thirty "; break;
		case 40: x = "forty "; break;
		case 50: x = "fifty "; break;
		case 60: x = "sixty "; break;
		case 70: x = "seventy "; break;
		case 80: x = "eighty "; break;
		case 90: x = "ninety "; break;
		}		
		return x;			
	}
	//convert any string to ASCII to binary
	public void StringToBinary(String x)
	{
		System.out.print( "The binary of \"" + x + "\" = ");
		
		for(int i = 0; i<x.length(); i++)
		{
			int num = (int)x.charAt(i);
			//a.Binary2(ch);
			String ans="";		 
			while(num >=2)
			{
				ans = num % 2 + ans;
				num=num/2;		
			}
			ans=num+ans;
			System.out.print( ans + " " );
		}
		System.out.println("");
	}
	//INCOMPLETE
	public void BinaryToCharacter()
	{
		NumberConversionFunctions a = new NumberConversionFunctions();
		int n = (int)'E';
		a.DecimalToBinary((int)n);
		System.out.println(n);
	}
}

