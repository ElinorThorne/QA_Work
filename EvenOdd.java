/* Print 1-10 on each line but for each odd number
 * print count again, i.e
 * 1
 * 2
 * 123
 * 4
 * 12345
 * 6
 * 1234567 
 */

public class EvenOdd
{
	public static void main(String[] args)
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
