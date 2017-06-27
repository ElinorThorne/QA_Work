import java.util.HashMap;
import java.util.Map;

public class FruitMap
{
	public static void main(String[] args)
	{
		//int[] keys = new int[10];
		//int[] values = new int[10];
		
		Map<String, Integer> myMap = new HashMap<String, Integer>();
		
		myMap.put("Roses", 34);
		
		myMap.put("Daffodil", 12);
		
		System.out.println(myMap.get("Roses"));
		
		myMap.put("Roses", 10);
		System.out.println(myMap.get("Roses"));
		
		myMap.put("Tulips", 3);
		
		for(Map.Entry<String, Integer> entry : myMap.entrySet()) {
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println(key + " : " + value);
			
			
		}
	}

}
