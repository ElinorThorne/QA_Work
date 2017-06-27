
public class Motorbike extends Vehicle
{

	@Override
	void setNumberOfWheels(int numberOfWheels) throws TooManyWheelsException
	{
		if(numberOfWheels == 2 || numberOfWheels == 3)
			this.numberOfWheels = numberOfWheels;
		else
			throw new TooManyWheelsException("Whoa! Too many wheels for a motorbike.");
		
	}

	
	
}
