package ffm.slc.model.enums;

/**
 * Enumeration items defining the categories of behavior coded for use in describing an incident.
 */
public enum BehaviorCategoryType {
	STATE_LAW_CRIME("State Law Crime"),
	STATE_OFFENSE("State Offense"),
	SCHOOL_VIOLATION("School Violation"),
	SCHOOL_CODE_OF_CONDUCT("School Code of Conduct");

	private String prettyName;

	BehaviorCategoryType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
