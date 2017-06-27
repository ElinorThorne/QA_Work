
public class Results2 
{
	/*class using invalid int
	 * If/Else
	 */
	private int Phy, Che, Mat, Total;	
	private float Per;
	private int invalid;
	
	public void showResults() 
	{
		if( invalid != 1 )
		{
			Total = Phy + Che + Mat;
			Per = (float) Total * 100 / 450;
			System.out.println("Total score:\t" + Total + "/450");
			System.out.println("Percentage:\t" + Per + "%");
		}
		else
			System.out.println( "Cannot calculate Total and Percentage with an invalid entry." );		
	}
	
	public void Physics(int A)
	{
		if( A>=0 && A<=150 )
		{
			Phy = A;
			//System.out.println( "Physics:\t" + A + "/150" );
		}
		else
		{
			System.out.println( A + " is an invalid entry for Physics.");
			invalid = 1;
		}
			
	}
	
	public void Chemistry(int A)
	{
		if( A>=0 && A<=150 )
		{
			Che = A;
			//System.out.println( "Chemistry:\t" + A + "/150" );
		}			
		else
		{
			System.out.println( A + " is an invalid entry for Chemistry.");
			invalid = 1;
		}
	}
	public void Mathematics(int A)
	{
		if( A>=0 && A<=150 )
		{
			Mat = A;
			//System.out.println( "Mathematic:\t" + A + "/150" );
		}
		else
		{
			System.out.println( A + " is an invalid entry for Mathematics.");
			invalid = 1;
		}
	}	
}

