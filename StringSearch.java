
public class StringSearch
{
	public void Search(String s, String f)
	{
		String sentence = s;
		String search = f;
		int count = 0;
		String pos = "";
		int length = search.length();
		
		for(int i = 0; i <=sentence.length(); i++)
		{
			if( i+length <=sentence.length() )
			{
				if(sentence.substring(i, i+length).equals(search))
				{
					count++;
					pos += (i + 1) + ", ";
				}
			}
		}
		if( count == 1 )
		{
			System.out.println( "\"" + search + "\" appears once" );
			System.out.println("In position " + pos);
		}
		else if( count == 2 )
		{
			System.out.println( "\"" + search + "\" appears twice" );
			System.out.println("In positions " + pos);
		}			
		else if( count >=3 )
		{
			System.out.println( "\"" + search + "\" appears " + count + " times" );
			System.out.println("In positions " + pos);
		}			
	}
}