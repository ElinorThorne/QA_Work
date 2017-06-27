
public class Results 
{
	/*class using valid boolean
	 * Pass or Fail?
	 */
	private int Phy, Che, Mat, Total;	
	private float Per;
	private boolean valid = true;
	
	public void showResults() 
	{
		if( valid == true )
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
			valid = false;
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
			valid = false;
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
			valid = false;
		}
	}	
}
