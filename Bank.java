
public class Bank
{
	//Static Members
	static int dollar;
	int x;
	
	public void setDollar(int a)
	{
		dollar = a;
	}
	public void convertMoney(int m)
	{
		System.out.println(m*dollar);
	}
	public void dollarRate()
	{
		System.out.println("Dollar rate: " + dollar );
	}
}
