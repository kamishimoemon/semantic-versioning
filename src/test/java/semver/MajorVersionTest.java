package semver;

import org.junit.*;
import static org.junit.Assert.*;

public class MajorVersionTest
{
	@Test
	public void majorVersionNumberShouldAcceptZero ()
	{
		new MajorVersion("0");
	}

	@Test
	public void majorVersionNumberShouldAcceptAnyPositiveInteger ()
	{
		new MajorVersion("1");
		new MajorVersion("10");
		new MajorVersion("123");
		new MajorVersion(String.valueOf(Integer.MAX_VALUE));
	}

	@Test
	public void majorVersionNumberShouldNotAcceptAnyNegativeInteger ()
	{
		assertThrows(InvalidNumericIdentifier.class, () -> {
			new MajorVersion("-1");
		});

		assertThrows(InvalidNumericIdentifier.class, () -> {
			new MajorVersion("-10");
		});

		assertThrows(InvalidNumericIdentifier.class, () -> {
			new MajorVersion("-123");
		});

		assertThrows(InvalidNumericIdentifier.class, () -> {
			new MajorVersion(String.valueOf(Integer.MIN_VALUE));
		});
	}

	@Test
	public void majorVersionNumberShouldNotAcceptLeadingZeros ()
	{
		assertThrows(InvalidNumericIdentifier.class, () -> {
			new MajorVersion("01");
		});

		assertThrows(InvalidNumericIdentifier.class, () -> {
			new MajorVersion("001");
		});

		assertThrows(InvalidNumericIdentifier.class, () -> {
			new MajorVersion("0001");
		});
	}

	@Test
	public void majorVersionNumberShouldNotAcceptAnyNonNumber ()
	{
		assertThrows(InvalidNumericIdentifier.class, () -> {
			new MajorVersion("1.0");
		});

		assertThrows(InvalidNumericIdentifier.class, () -> {
			new MajorVersion("123a456");
		});

		assertThrows(InvalidNumericIdentifier.class, () -> {
			new MajorVersion("1-alpha");
		});
	}
}