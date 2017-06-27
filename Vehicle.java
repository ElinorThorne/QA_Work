
abstract class Vehicle
{

	protected int numberOfWheels;
	
	public Vehicle() {
		
	}

	public int getNumberOfWheels()
	{
		return numberOfWheels;
	}

	abstract void setNumberOfWheels(int numberOfWheels) throws TooManyWheelsException;
	
}
