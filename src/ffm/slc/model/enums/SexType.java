package ffm.slc.model.enums;

/**
 * A person's gender.
 */
public enum SexType {
	FEMALE("Female"),
	MALE("Male");

	private String prettyName;

	SexType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
