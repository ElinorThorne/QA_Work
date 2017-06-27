
public class SearchArray
{

	public static void main(String[] args)
	{
		int[] x = {-9, -9, -9, -130, -99, -9, -98, -321, -42, -1, -160};
		int high=0, mid=0, tempL=0, low=0;
		int AbsoluteLow = 0;
				
		for(int i = 0; i<x.length; i++)
		{			
			if(x[i] > high)
			{
				high = x[i];
			}
			if(mid > x[i] && mid < high)
			{
				mid = x[i];
			}
		}	

		//find highest
		for(int i = 0; i<x.length; i++)
		{			
			if( x[i] > AbsoluteLow)
			{
				AbsoluteLow = x[i];
				high = x[i];
			}
			
		}
		
		//find 2nd highest
		for(int i = 0; i<x.length; i++)
		{			
			if( x[i] < high && x[i] > mid)
			{
				mid = x[i];
			}
		}
		
		//find 3rd highest
		for(int i = 0; i<x.length; i++)
		{			
			for(int j = 1; j<x.length; j++)
			{
				if( x[i] < mid && x[i] > AbsoluteLow)
				{
					low = x[i];
				}
			}
							
		}
		System.out.println("The highest number within the array is " + high);
		System.out.println("The second highest number within the array is " + mid );
		System.out.println("The third highest number within the array is " + low);
	}
}
