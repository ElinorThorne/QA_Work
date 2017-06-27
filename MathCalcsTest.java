/* Main class
 * TASK: Write multiple functions
 * Procedure - Never returns a value
 * Function - Always returns a single value
 */

public class MathCalcsTest 
{
	public static void main(String[] args) 
	{
		MathCalcs x = new MathCalcs();
			
		System.out.print("10 + 10 = " + x.Add(10, 10) + "\n30 - 10 = " + x.Subtract(30, 10) + "\n2 * 10 = " + x.Multiply(2, 10) + "\n100 / 5 = " + x.Divide(100, 5) + "\n5 % 100 = " + x.Mod(5, 100));
			
		/*int a = x.Add(10, 10);
		int b = x.Subtract(30, 10);
		int c = x.Multiply(2, 10);
		float d = x.Divide(100, 5);
		float e = x.Mod(5, 100);
		
		System.out.println("20 + 20 = " + x.Add(a, a));
		System.out.println("20 - 20 = " + x.Subtract(b, b));
		System.out.println("20 * 20 = " + x.Multiply(c, c));*/
		//System.out.println("20 / 20 = " + x.Divide(d, d));
		//System.out.println("20 % 20 = " + x.Mod(e, e));
	}

}
