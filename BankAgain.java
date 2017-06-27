
public class BankAgain
{
	int a, b, c, d;
	static BankAgain r;
	static int count=0;
	
	public void msg()
	{
		System.out.println("Hello");
	}
	private BankAgain()
	{
		System.out.println("This is the BankAgain private method");
	}
	public static BankAgain XYZ()
	{
		if(count<3)
		{
			if(r==null)
			{
				r = new BankAgain();
			}
			count++;
		}
		else
		{
			System.out.println("Computer says no");
		}
		return r;
		
	}
}
