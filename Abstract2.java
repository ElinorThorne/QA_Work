//Child Class to practice Abstract

class Abstract2 extends Abstract
{

	public void Addition()
	{
		int a=0, b=0;
		int c = a + b;
		System.out.println("How do I create variables which can be passed from the user?" + a + b + c);
	}
	public void Addition(int a,int b)
	{
		int c = a + b;
		System.out.println("I would have to create an overloaded method to allow for the user to pass their own variables" + a + b + c);
	}
	public void Subtraction(int a, int b)
	{
		int c = a - b;
		System.out.println("The result of " + a + " - " + b + " is " + c);
	}
	public void Division(int a, int b)
	{
		int c = a / b;
		System.out.println("I have changed this method by adding this line..." + a + " / " + b + " = " + c);
	}
	/*public void multiply(int a, int b)
	{
		System.out.println("This line shouldn't appear because this method is final");
	}*/

}
