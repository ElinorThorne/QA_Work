
public class StaticInitialiser
{
	static int Dollar;
	static
	{
		Dollar = 10 + 15;
	}
	public void setDollar(int a)
	{
		Dollar = a;
	}
	public void ConvertMoney(int a)
	{
		System.out.println(a);
	}
}
