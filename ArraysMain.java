
public class ArraysMain
{
	public static void main(String[] args)
	{
		int[] array = {5, 1, 2, 20, 30};
		Arr x = new Arr();
		int length = array.length-1;
		
		System.out.println("Unsorted array:");
		for(int i = 0; i <array.length; i++)
			System.out.println(array[i]);
		
		x.bubble(array);
		System.out.println("Sorted array:");
		for(int i = 0; i <array.length; i++)
			System.out.println(array[i]);
		
		System.out.println("Min value within array is " + array[0]);
		System.out.println("Max value within array is " + array[length]);
		
	}

}
