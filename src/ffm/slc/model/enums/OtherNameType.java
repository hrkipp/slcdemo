package ffm.slc.model.enums;

/**
 * The types of alternate names for a person.
 */
public enum OtherNameType {
	ALIAS("Alias"),
	NICKNAME("Nickname"),
	OTHER_NAME("Other Name"),
	PREVIOUS_LEGAL_NAME("Previous Legal Name");

	private String prettyName;

	OtherNameType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
