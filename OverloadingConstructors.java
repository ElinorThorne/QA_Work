
class OverloadingConstructors
{
	public OverloadingConstructors(int a)
	{
		System.out.println(a);
	}
	public OverloadingConstructors(int a, int b)
	{
		this(7);
		System.out.println(a + b);
	}
	public OverloadingConstructors(int a, int b, int c)
	{
		this(5, 10);
		System.out.println(a + b + c);
	}

}
