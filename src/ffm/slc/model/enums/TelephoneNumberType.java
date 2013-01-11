package ffm.slc.model.enums;

/**
 * The type of communication number listed for an individual.
 */
public enum TelephoneNumberType {
	FAX("Fax"),
	EMERGENCY_1("Emergency 1"),
	EMERGENCY_2("Emergency 2"),
	HOME("Home"),
	MOBILE("Mobile"),
	OTHER("Other"),
	UNLISTED("Unlisted"),
	WORK("Work");

	private String prettyName;

	TelephoneNumberType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
