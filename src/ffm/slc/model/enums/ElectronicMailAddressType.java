package ffm.slc.model.enums;

/**
 * The type of email listed for an individual or organization.
 */
public enum ElectronicMailAddressType {
	HOME_PERSONAL("Home/Personal"),
	ORGANIZATION("Organization"),
	OTHER("Other"),
	WORK("Work");

	private String prettyName;

	ElectronicMailAddressType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
