package semver;

/**
 * Backus–Naur Form Grammar for Pre-Release Identifier
 * 
 * <pre-release identifier> ::= <alphanumeric identifier> | <numeric identifier>
 * 
 * <alphanumeric identifier> ::= <non-digit> | <non-digit> <identifier characters> | <identifier characters> <non-digit> | <identifier characters> <non-digit> <identifier characters>
 * <non-digit> ::= <letter> | "-"
 * <letter> ::= "A" | "B" | "C" | "D" | "E" | "F" | "G" | "H" | "I" | "J" | "K" | "L" | "M" | "N" | "O" | "P" | "Q" | "R" | "S" | "T" | "U" | "V" | "W" | "X" | "Y" | "Z" | "a" | "b" | "c" | "d" | "e" | "f" | "g" | "h" | "i" | "j" | "k" | "l" | "m" | "n" | "o" | "p" | "q" | "r" | "s" | "t" | "u" | "v" | "w" | "x" | "y" | "z"
 * <identifier characters> ::= <identifier character> | <identifier character> <identifier characters>
 * <identifier character> ::= <digit> | <non-digit>
 * 
 * <numeric identifier> ::= "0" | <positive digit> | <positive digit> <digits>
 * <positive digit> ::= "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9"
 * <digits> ::= <digit> | <digit> <digits>
 * <digit> ::= "0" | <positive digit>
 */
public class PreReleaseIdentifier
{
	public PreReleaseIdentifier (AlphanumericIdentifier identifier)
	{
		
	}

	public PreReleaseIdentifier (NumericIdentifier identifier)
	{
		
	}
}