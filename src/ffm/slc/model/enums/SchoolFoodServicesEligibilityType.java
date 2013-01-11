package ffm.slc.model.enums;

/**
 * An indication of a student's level of eligibility for breakfast, lunch, snack, supper, and milk programs.
 */
public enum SchoolFoodServicesEligibilityType {
	FREE("Free"),
	FULL_PRICE("Full price"),
	REDUCED_PRICE("Reduced price"),
	UNKNOWN("Unknown");

	private String prettyName;

	SchoolFoodServicesEligibilityType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
