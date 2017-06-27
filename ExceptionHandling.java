
public class ExceptionHandling
{

	public static void main(String[] args)
	{
		int a = 4;
		int b = 0;
		int c;
		
		try
		{
			c = a/b;
			System.out.println("Everything worked perfectly. " + a + " / " + b + " = " + c);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Get on yer bike. " + a + " cannot divide by " + b );
		}

	}

}
