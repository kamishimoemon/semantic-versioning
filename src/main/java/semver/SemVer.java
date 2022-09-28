package semver;

import java.util.Optional;

/**
 * Backus–Naur Form Grammar for Valid SemVer Versions
 * 
 * <valid semver> ::= <version core>
 * 					| <version core> "-" <pre-release>
 * 					| <version core> "+" <build>
 * 					| <version core> "-" <pre-release> "+" <build>
 */
public final class SemVer
	implements Comparable<SemVer>
{
	private VersionCore versionCore;
	private Optional<PreRelease> preRelease;
	private Optional<BuildMetadata> metadata;

	public SemVer (VersionCore versionCore)
	{
		this.versionCore = versionCore;
		this.preRelease = Optional.empty();
		this.metadata = Optional.empty();
	}

	public SemVer (VersionCore versionCore, PreRelease preRelease)
	{
		this.versionCore = versionCore;
		this.preRelease = Optional.of(preRelease);
		this.metadata = Optional.empty();
	}

	public SemVer (VersionCore versionCore, BuildMetadata metadata)
	{
		this.versionCore = versionCore;
		this.preRelease = Optional.empty();
		this.metadata = Optional.of(metadata);
	}

	public SemVer (VersionCore versionCore, PreRelease preRelease, BuildMetadata metadata)
	{
		this.versionCore = versionCore;
		this.preRelease = Optional.of(preRelease);
		this.metadata = Optional.of(metadata);
	}

	public VersionCore version ()
	{
		return versionCore;
	}

	public Optional<PreRelease> preRelease ()
	{
		return preRelease;
	}

	public Optional<BuildMetadata> metadata ()
	{
		return metadata;
	}

	public int compareTo (SemVer semver)
	{
		throw new RuntimeException("Method not implemented");
	}

	public String toString ()
	{
		throw new RuntimeException("Method not implemented");
		/*
		return versionCore.toString()
			+ (preRelease.isPresent() ? "-" + preRelease.get().toString() : "")
			+ (metadata.isPresent() ? "+" + metadata.get().toString() : "")
		;
		*/
	}
}