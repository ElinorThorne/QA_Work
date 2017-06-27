
public class StringReplaceMain
{
	public static void main(String[] args)
	{
		String sentence = "Elinor Sian Thorne";
		String search = "Eli";
		String replace = "Charles";
		String tempSent = "";
		String tmp = "";
		int length = search.length();
		
		//for every position within the sentence
		for(int i = 0; i < sentence.length(); i++)
		{			
			//stay within the bounds of the sentence
			//and store the position
			if( i+length <= sentence.length() )
			{
				tmp = sentence.substring(i, i+length);
			}
				//if sentence substring matches temporary search word
				if(tmp.equals(search))
				{
					//replace it
					tempSent = tempSent + replace;
					i = i + search.length()-1;
				}
				else
				{
					tempSent = tempSent + sentence.substring(i, i+1);
				}			
		}
		System.out.println(tempSent);
	}
}
