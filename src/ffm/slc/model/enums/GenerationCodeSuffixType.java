package ffm.slc.model.enums;

/**
 * An appendage, if any, used to denote an individual's generation in his family (e.g., Jr., Sr., III).
 */
public enum GenerationCodeSuffixType {
	JR("Jr"),
	SR("Sr"),
	II("II"),
	III("III"),
	IV("IV"),
	V("V"),
	VI("VI"),
	VII("VII"),
	VIII("VIII");

	private String prettyName;

	GenerationCodeSuffixType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
