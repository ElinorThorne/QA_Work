
public class BankTest2
{
	/*TASK: Try to use Static Members with
	 * non-static members 
	 */
	
	public static void main(String[] args)
	{
		Bank HSBC, NatWest;
		HSBC = new Bank();
		NatWest = new Bank();
		
		HSBC.setDollar(3);
		HSBC.convertMoney(100);
		HSBC.dollarRate();
		//HSBC.wontWork(96);
				
		System.out.println("");
		
		//NatWest.setDollar(96);
		NatWest.convertMoney(80);
		NatWest.dollarRate();
		

	}

}