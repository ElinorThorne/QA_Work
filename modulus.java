/* Main method
 * TASK: Using Modulus add all digits for 
 * any number between 1-999, i.e
 * 253 is 2 + 5 + 3 = 10
 * 759 is 7 + 5 + 9 = 21
 */
	
public class modulus 
{
	public static void main(String[] args) 
	{
		int x, no1, no2, no3, no4, y;
		x = 91;
		
		no1 = x / 100;
		no2 = x % 100;
		no3 = no2 / 10;
		no4 = no2 % 10;
		y = no1 + no3 + no4;
		
		System.out.println( no1 + " +\n" + no3 + " +\n" + no4 + " =\n" + y);
	}
}
