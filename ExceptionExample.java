
public class ExceptionExample
{
	public void Div(int a, int b) throws MyExp
	{
		int c = 0;
		if(a<b)
		{
			MyExp e = new MyExp();
			throw e;
		}
		c=a/b;
	}
}
