package ffm.slc.model.enums;

/**
 * The current operational status of the education organization (e.g., active, inactive).
 */
public enum OperationalStatusType {
	ACTIVE("Active"),
	ADDED("Added"),
	CHANGED_AGENCY("Changed Agency"),
	CLOSED("Closed"),
	CONTINUING("Continuing"),
	FUTURE("Future"),
	INACTIVE("Inactive"),
	NEW("New"),
	REOPENED("Reopened");

	private String prettyName;

	OperationalStatusType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
