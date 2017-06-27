
public class Car extends Vehicle
{

	public void setNumberOfWheels(int numberOfWheels) throws TooManyWheelsException
	{
		if(numberOfWheels == 3 || numberOfWheels ==4)
			this.numberOfWheels = numberOfWheels;
		else
			throw new TooManyWheelsException("Whoa! Too many wheels for a car.");
		
	}
	
}
