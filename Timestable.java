//For Loop Exercise

public class Timestable
{
	public void Table(int a, int b)
	{
		System.out.println("Timestable of " + a);
		
		for(int x=1; x<=b; x++)
		{
			int answer = a * x;
			System.out.println(a + " x " + x + " = " + answer);
		}			
	}	
	
	public void NestedLoop()
	{
		int a, b;
		for(a=1; a<=10; a++)
		{
			//
			System.out.println("This is a loop = " + a);
			for(b=1; b<=10; b++)
			{
				System.out.println(b);
			}
		}
	}
		
	public void NestedLoopEvenOdd()
	{
		for(int a=1; a<=10; a++)
		{
			if(a%2==0)
			{
				System.out.println(a);
			}
			else
			{
				for(int b=1; b<=a; b++)
				{
					System.out.print(b);
				}
				System.out.println();
			}
		}
						
	}
}
