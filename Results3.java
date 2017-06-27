
public class Results3
{
	//class using invalid int
	//different types of passes - basic
	private int Phy, Che, Mat, Total, level, pass, invalid;	
	private float Per;
		
	public void showResults() 
	{
		if( pass == 0 && level == 0 && invalid == 0 )
		{
			Total = Phy + Che + Mat;
			Per = (float) Total * 100 / 450;
			System.out.println("Total score:\t" + Total + "/450");
			System.out.println("Percentage:\t" + Per + "%");
		}
		
		else if( level == 3 )
		{
			System.out.println("Go home");
			
		}
		else if( level == 2 )
		{
			System.out.println("Please repeat the course");
		}
		else if( level == 1 )
		{
			System.out.println("Retake the exam");
		}
		else if( invalid == 1 )
			System.out.println( "Cannot calculate Total and Percentage with an invalid entry." );		
	}
	
	public void Physics(int A)
	{
		if( A>=70 && A<=150 )
		{
			Phy = A;
			//System.out.println( "Physics:\t" + A + "/150" );
		}
		else if( A>=0 && A<=69)
		{
			level++;
		}
		else
		{
			System.out.println( A + " is an invalid entry for Physics.");
			invalid = 1;
		}
			
	}
	
	public void Chemistry(int A)
	{
		if( A>=70 && A<=150 )
		{
			Che = A;
			//System.out.println( "Chemistry:\t" + A + "/150" );
		}			
		else if( A>=0 && A<=69 )
		{
			level++;
		}
		else
		{
			System.out.println( A + " is an invalid entry for Chemistry.");
			invalid = 1;
		}
		
	}
	public void Mathematics(int A)
	{
		if( A>=70 && A<=150 )
		{
			Mat = A;
			//System.out.println( "Mathematic:\t" + A + "/150" );
		}
		else if( A>=0 && A<=69 )
		{
			level++;
		}
		else
		{
			System.out.println( A + " is an invalid entry for Mathematics.");
			invalid = 1;
		}
	}	
}

