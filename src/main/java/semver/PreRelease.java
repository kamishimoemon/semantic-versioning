package semver;

/**
 * Backus–Naur Form Grammar for Pre-Release
 * 
 * <pre-release> ::= <dot-separated pre-release identifiers>
 * <dot-separated pre-release identifiers> ::= <pre-release identifier> | <pre-release identifier> "." <dot-separated pre-release identifiers>
 */
public class PreRelease
{
	private PreReleaseIdentifier[] identifiers;

	public PreRelease (PreReleaseIdentifier... identifiers)
	{
		this.identifiers = identifiers;
	}
}