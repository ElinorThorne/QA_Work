
public class MyExp
{
	public static void main(String[] args)
	{
		ExceptionExample ee = new ExceptionExample();
		try
		{
			ee.Div(2,5);
		}
		catch()
		{
			System.out.println("Do something");
		}
	}
}
