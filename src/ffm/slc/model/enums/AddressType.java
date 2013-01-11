package ffm.slc.model.enums;

/**
 * The type of address listed for an individual or organization.
 */
public enum AddressType {
	HOME("Home"),
	PHYSICAL("Physical"),
	BILLING("Billing"),
	MAILING("Mailing"),
	OTHER("Other"),
	TEMPORARY("Temporary"),
	WORK("Work");

	private String prettyName;

	AddressType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
