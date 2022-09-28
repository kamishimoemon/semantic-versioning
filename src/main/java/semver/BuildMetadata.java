package semver;

/**
 * Backus–Naur Form Grammar for Build Metadata
 * 
 * <build> ::= <dot-separated build identifiers>
 * <dot-separated build identifiers> ::= <build identifier> | <build identifier> "." <dot-separated build identifiers>
 * <build identifier> ::= <alphanumeric identifier> | <digits>
 * <alphanumeric identifier> ::= <non-digit> | <non-digit> <identifier characters> | <identifier characters> <non-digit> | <identifier characters> <non-digit> <identifier characters>
 * <non-digit> ::= <letter> | "-"
 * <letter> ::= "A" | "B" | "C" | "D" | "E" | "F" | "G" | "H" | "I" | "J" | "K" | "L" | "M" | "N" | "O" | "P" | "Q" | "R" | "S" | "T" | "U" | "V" | "W" | "X" | "Y" | "Z" | "a" | "b" | "c" | "d" | "e" | "f" | "g" | "h" | "i" | "j" | "k" | "l" | "m" | "n" | "o" | "p" | "q" | "r" | "s" | "t" | "u" | "v" | "w" | "x" | "y" | "z"
 * <identifier character> ::= <digit> | <non-digit>
 * <digits> ::= <digit> | <digit> <digits>
 * <digit> ::= "0" | <positive digit>
 * <positive digit> ::= "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9"
 */
public class BuildMetadata
{
	
}