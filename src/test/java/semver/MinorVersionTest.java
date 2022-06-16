package semver;

import org.junit.*;
import static org.junit.Assert.*;

public class MinorVersionTest
{
	@Test
	public void minorVersionNumberShouldAcceptZero ()
	{
		new MinorVersion("0");
	}

	@Test
	public void minorVersionNumberShouldAcceptAnyPositiveInteger ()
	{
		new MinorVersion("1");
		new MinorVersion("10");
		new MinorVersion("123");
		new MinorVersion(String.valueOf(Integer.MAX_VALUE));
	}

	@Test
	public void minorVersionNumberShouldNotAcceptAnyNegativeInteger ()
	{
		assertThrows(InvalidNumericIdentifier.class, () -> {
			new MinorVersion("-1");
		});

		assertThrows(InvalidNumericIdentifier.class, () -> {
			new MinorVersion("-10");
		});

		assertThrows(InvalidNumericIdentifier.class, () -> {
			new MinorVersion("-123");
		});

		assertThrows(InvalidNumericIdentifier.class, () -> {
			new MinorVersion(String.valueOf(Integer.MIN_VALUE));
		});
	}

	@Test
	public void minorVersionNumberShouldNotAcceptLeadingZeros ()
	{
		assertThrows(InvalidNumericIdentifier.class, () -> {
			new MinorVersion("01");
		});

		assertThrows(InvalidNumericIdentifier.class, () -> {
			new MinorVersion("001");
		});

		assertThrows(InvalidNumericIdentifier.class, () -> {
			new MinorVersion("0001");
		});
	}

	@Test
	public void minorVersionNumberShouldNotAcceptAnyNonNumber ()
	{
		assertThrows(InvalidNumericIdentifier.class, () -> {
			new MinorVersion("1.0");
		});

		assertThrows(InvalidNumericIdentifier.class, () -> {
			new MinorVersion("123a456");
		});

		assertThrows(InvalidNumericIdentifier.class, () -> {
			new MinorVersion("1-alpha");
		});
	}
}