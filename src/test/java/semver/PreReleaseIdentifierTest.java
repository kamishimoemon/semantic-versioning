package semver;

import org.junit.*;
import static org.junit.Assert.*;

public class PreReleaseIdentifierTest
{
	@Test
	public void zeroShouldBeAValidIdentifier ()
	{
		new PreReleaseIdentifier("0");
	}

	@Test
	public void anyPositiveNumberShouldBeAValidIdentifier ()
	{
		new PreReleaseIdentifier("1");
		new PreReleaseIdentifier("10");
		new PreReleaseIdentifier("123");
		new PreReleaseIdentifier(String.valueOf(Integer.MAX_VALUE));
	}
}