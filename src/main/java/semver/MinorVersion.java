package semver;

/**
 * Backus–Naur Form Grammar for Valid Minor Version Numbers
 * 
 * <minor> ::= <numeric identifier>
 * <numeric identifier> ::= "0" | <positive digit> | <positive digit> <digits>
 * <digits> ::= <digit> | <digit> <digits>
 * <digit> ::= "0" | <positive digit>
 * <positive digit> ::= "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9"
 */
public class MinorVersion
{
	private int number;

	public MinorVersion (String number)
	{
		try
		{
			this.number = Integer.valueOf(number);
			if (this.number < 0) throw new InvalidNumericIdentifier();
			if (this.number > 0 && number.startsWith("0")) throw new InvalidNumericIdentifier();
		}
		catch (NumberFormatException ex)
		{
			throw new InvalidNumericIdentifier();
		}
	}
}