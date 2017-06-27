public class Bank2
{
	/*TASK: Try to use Static Members with
	 * non-static members 
	 */
	
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
	/*public static void wontWork(int a)
	{
		int x = a;
	}*/
}