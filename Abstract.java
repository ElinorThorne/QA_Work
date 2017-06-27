//Parent class to practice Abstract

abstract class Abstract
{
	abstract public void Addition();
	abstract public void Subtraction(int a, int b);
	public void division(int a, int b)
	{
		int c = a / b;
		System.out.println(a + " / " + b + " = " + c);
	}
	final public void multiply(int a, int b)
	{
		int c = a * b;
		System.out.println(a + " / " + b + " = " + c);
	}
}