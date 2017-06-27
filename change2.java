	/*TASK: List denominations of required change
	 * FIXED: Penny problem
	 */

public class change2
{
	public static void main(String[] args) 
	{
		int £fifty, £twenty, £ten, £five, £two, £one, fiftyP, twentyP, tenP, fiveP, twoP;
		float change, bill, cash, oneP;
				
		bill = 0.99f;
		cash = 1;
		change = cash - bill;
		
		System.out.printf( "Change due = £%.2f \n", change);
	
		£fifty = ((int) change / 50);
		change = change - (£fifty * 50 );
		if( £fifty>0 )
			System.out.println("£50: " + £fifty );
						
		£twenty = ((int) change / 20);
		change = change - (£twenty * 20 );
		if( £twenty>0 )
			System.out.println("£20: " + £twenty );
		
		£ten = ((int) change / 10);
		change = change - (£ten * 10 );
		if( £ten>0 )
			System.out.println("£10: " + £ten );
		
		£five = ((int) change / 5);
		change = change - (£five * 5 );
		if( £five>0 )
			System.out.println("£5: " + £five );
		
		£two = ((int) change / 2);
		change = change - (£two * 2 );
		if( £two>0 )
			System.out.println("£2: " + £two );
		
		£one = ((int) change / 1);
		change = change - (£one * 1 );
		if( £one>0)
			System.out.println("£1: " + £one );
		
		fiftyP = (int) (change / 0.5);
		change = (float) (change - (fiftyP * 0.50 ));
		if( fiftyP > 0 )
			System.out.println("50p: " + fiftyP );
				
		twentyP = (int) (change / 0.2);
		change = (float) (change - (twentyP * 0.20 ));
		if( twentyP > 0 )
			System.out.println("20p: " + twentyP );
		
		tenP = (int) (change / 0.1);
		change = (float) (change - (tenP * 0.10 ));
		if( tenP > 0)
			System.out.println("10p: " + tenP );
				
		fiveP = (int) (change / 0.05);
		change = (float) (change - (fiveP * 0.05 ));
		if( fiveP > 0 )
			System.out.println("5p: " + fiveP );
		
		twoP = (int) (change / 0.02);
		change = (float) (change - (twoP * 0.02));
		if(twoP > 0)
			System.out.println("2p: " + twoP );
		
		oneP = (float) (change / 0.01);
		double entire1p = Math.round(oneP);
		change = (float) (change - (entire1p * 0.01 ));
		if(entire1p > 0)
			System.out.println("1p: " + (int)entire1p );

	}

}
