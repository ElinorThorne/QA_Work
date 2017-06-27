
public class Arguments
{

	public static void main(String[] args)
	{
		if(args.length > 2)
		{
			System.out.println("Please enter only 2 values");
			System.exit(0);
		}
		int a = 0, b = 0, c;
		try
		{
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			c = a/b;
			System.out.println("The result of " + args[0] + " / " + args[1] + " = " + c);
		}
		/*catch(NumberFormatException nfe)
		{
			System.out.println("Please provide 2 numbers.");
		}*/
		catch(ArithmeticException ae)
		{
			System.out.println(args[0] + " cannot be divided by " + args[1] + ". Please try again");
		}
		catch(ArrayIndexOutOfBoundsException aob)
		{
			System.out.println("Please input 2 arguments");
		}
		catch(Exception x)
		{
			System.out.println("You broke my code!");
		}

	}

}
