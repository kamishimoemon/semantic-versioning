package semver;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Backus–Naur Form Grammar for Numeric Identifiers
 * 
 * <numeric identifier> ::= "0" | <positive digit> | <positive digit> <digits>
 * <digits> ::= <digit> | <digit> <digits>
 * <digit> ::= "0" | <positive digit>
 * <positive digit> ::= "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9"
 */
public class NumericIdentifierTest
{
	@Test
	public void numericIdentifierNumberShouldAcceptZero ()
	{
		new NumericIdentifier("0");
	}

	@Test
	public void numericIdentifierNumberShouldAcceptAnyPositiveInteger ()
	{
		new NumericIdentifier("1");
		new NumericIdentifier("10");
		new NumericIdentifier("123");
		new NumericIdentifier(String.valueOf(Integer.MAX_VALUE));
	}

	@Test
	public void numericIdentifierNumberShouldNotAcceptAnyNegativeInteger ()
	{
		assertThrows(InvalidNumericIdentifier.class, () -> {
			new NumericIdentifier("-1");
		});

		assertThrows(InvalidNumericIdentifier.class, () -> {
			new NumericIdentifier("-10");
		});

		assertThrows(InvalidNumericIdentifier.class, () -> {
			new NumericIdentifier("-123");
		});

		assertThrows(InvalidNumericIdentifier.class, () -> {
			new NumericIdentifier(String.valueOf(Integer.MIN_VALUE));
		});
	}

	@Test
	public void numericIdentifierNumberShouldNotAcceptLeadingZeros ()
	{
		assertThrows(InvalidNumericIdentifier.class, () -> {
			new NumericIdentifier("01");
		});

		assertThrows(InvalidNumericIdentifier.class, () -> {
			new NumericIdentifier("001");
		});

		assertThrows(InvalidNumericIdentifier.class, () -> {
			new NumericIdentifier("0001");
		});
	}

	@Test
	public void numericIdentifierNumberShouldNotAcceptAnyNonNumber ()
	{
		assertThrows(InvalidNumericIdentifier.class, () -> {
			new NumericIdentifier("1.0");
		});

		assertThrows(InvalidNumericIdentifier.class, () -> {
			new NumericIdentifier("123a456");
		});

		assertThrows(InvalidNumericIdentifier.class, () -> {
			new NumericIdentifier("1-alpha");
		});
	}
}