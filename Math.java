
abstract public class Math
{
	private int c;
	
	final public void addition( int a, int b )
	{
		c = a + b;
		System.out.println("This is the parent addition " + c);
	}
	public void subtraction( int a, int b )
	{
		c = a - b;
		System.out.println("This is the parent subtraction " + c);
	}
}
