package semver;

/**
 * Backus–Naur Form Grammar for Version Core
 * 
 * <version core> ::= <major> "." <minor> "." <patch>
 * <major> ::= <numeric identifier>
 * <minor> ::= <numeric identifier>
 * <patch> ::= <numeric identifier>
 */
public final class VersionCore
{
	private NumericIdentifier major;
	private NumericIdentifier minor;
	private NumericIdentifier patch;

	public VersionCore (NumericIdentifier major, NumericIdentifier minor, NumericIdentifier patch)
	{
		this.major = major;
		this.minor = minor;
		this.patch = patch;
	}

	@Override
	public String toString ()
	{
		throw new RuntimeException("Method not implemented");
	}

	public int compareTo (SemVer semver)
	{
		throw new RuntimeException("Method not implemented");
	}
}