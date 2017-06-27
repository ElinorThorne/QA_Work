public class Flowchart2
{
	//Loops
	public static void main(String [] args )
	{
		int a;
		
		for( a=1; a<10; a++ )
		{
			System.out.print(a);
			if(a%2 == 0)
			{
				System.out.print("Exam");
				if(a>5)
				{
					System.out.println(" - ");
				}
				else
				{
					System.out.println(" * ");
				}
			}
			else
			{
				System.out.println("Odd");
				if( a>5 )
				{
					System.out.println("!");
				}
				else
				{
					System.out.println("?");
				}
			}
		}
	}
}