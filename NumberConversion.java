/*Main class
 * Combining many number conversion tasks in to
 * one class
 */
public class NumberConversion
{
	public static void main(String[] args)
	{
		NumberConversionFunctions a = new NumberConversionFunctions();
		
		a.DecimalToBinary(69);
		a.DecimalToBinary(108);
		a.DecimalToBinary(105);
		a.BinaryToDecimal("1101001");
		a.StringToBinary("Elinor");
		a.NumberToString(24);
				
		a.BinaryToCharacter();
	}
}

	
