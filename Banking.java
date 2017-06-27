//Main class to practice Inheritance and Abstract

public class Banking
{
	public static void Banking(Bank x)
	{
		x.deposit();
		x.draw();
		x.checkBalance();
	}
	public static void main(String[] args)
	{
		HSBC n = new HSBC();
		Banking(n);
	}
}
