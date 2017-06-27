
public class Arr implements ArraysInterface
{
	public void bubble(int[] array)
	{
		for(int i = 0; i<array.length-1; i++)
		{
			int swap = 0;
			for(int j = array.length-1; j>i; j--)
			{
				if( array[j] < array[j-1] )
				{
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
					swap++;
				}
			}
			if(swap == 0)
				break;
		}		
	}
}
