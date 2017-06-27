//TASK. Learn and practice Stack

public class StackMain
{
	public static void main(String[] args) 
	{
		StackFunctions theStack = new StackFunctions(10); 
		theStack.push(10);
		theStack.push(20);
		theStack.push(30);
		theStack.push(40);
		theStack.push(50);
		     
		//theStack.push(60);
		 
		theStack.pop();
		long value = theStack.pop();
		System.out.print(value);
		  
		/*theStack.peek();
		long value = theStack.peek();
		System.out.print(value);*/
		  
		  
		/*while (!theStack.isEmpty())
		{
			long value = theStack.pop();
			System.out.print(value);
			System.out.print(" ");
		}*/
		System.out.println("");
	}
}

