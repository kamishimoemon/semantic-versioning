package semver;

/**
 * Backus–Naur Form Grammar for Valid Major Version Numbers
 * 
 * <major> ::= "0" | <positive digit> | <positive digit> <digits>
 * <positive digit> ::= "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9"
 * <digits> ::= <digit> | <digit> <digits>
 * <digit> ::= "0" | <positive digit>
 */
public class MajorVersion
{
	private int number;

	public MajorVersion (String number)
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