//parent class to practice Overloading
public class Overloading
{
	public int Add(int a, int b)
	{
		int x = a + b;
		System.out.println( "Method 1. a + b. = " + x );
		return x;
	}
	public int Add(int a, int b, int c)
	{
		int x = a + b + c;
		System.out.println( "Method 2. a + b + c. = " + x );
		return x;
	}
	public double Add(double a, double b)
	{
		double x = a + b;
		System.out.println( "Method 3. a.f + b.f. = " + x);
		return x;
	}
}
