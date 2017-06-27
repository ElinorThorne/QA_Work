
public class ResultsH
{
	//class using valid boolean
	private int Phy, Che, Mat, Total, passes;	
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
			switch(passes) {
			case 0:
				System.out.println("Go home!");
				break;
			case 1:
				System.out.println("Please repeat the course1");
				break;
			case 2:
				System.out.println("Resit the exam!");
				break;
			case 3:
				System.out.println("Pass!");
				break;
			}
		} else {
			System.out.println( "Cannot calculate Total and Percentage with an invalid entry." );		
	
		}
	}
	
	public void Physics(int A)
	{
		if( isValidMark(A) )
		{
			Phy = A;
			//System.out.println( "Physics:\t" + A + "/150" );
			checkPass(A);
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
			checkPass(A);
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
			checkPass(A);
		}
		else
		{
			System.out.println( A + " is an invalid entry for Mathematics.");
			valid = false;
		}
	}	
	
	public void checkPass(int mark) {
		if(mark >= 70) {
			passes++;
		}
	}
	
	public boolean isValidMark(int mark) {
		return  (mark>=0 && mark<=150);
	}
}
