/*TASK: Create a timetable using loops 
 * AND call the function from a different class
 */

public class MathTable
{
	public void Table( int a, int b)
	{
		System.out.println("Timestable of " + a);
		
		for(int x=1; x<=b; x++)
		{
			int answer = a * x;
			System.out.println(a + " x " + x + " = " + answer);
		}
	}
}
