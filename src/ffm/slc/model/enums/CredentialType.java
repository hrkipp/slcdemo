package ffm.slc.model.enums;

/**
 * An indication of the category of credential an individual holds.
 */
public enum CredentialType {
	CERTIFICATION("Certification"),
	ENDORSEMENT("Endorsement"),
	LICENSURE("Licensure"),
	OTHER("Other"),
	REGISTRATION("Registration");

	private String prettyName;

	CredentialType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
