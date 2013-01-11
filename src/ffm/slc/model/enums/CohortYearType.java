package ffm.slc.model.enums;

/**
 * The enumeration items for the set of cohort years.
 */
public enum CohortYearType {
	EIGHTH_GRADE("Eighth grade"),
	ELEVENTH_GRADE("Eleventh grade"),
	FIFTH_GRADE("Fifth grade"),
	FIRST_GRADE("First grade"),
	FOURTH_GRADE("Fourth grade"),
	NINTH_GRADE("Ninth grade"),
	SECOND_GRADE("Second grade"),
	SEVENTH_GRADE("Seventh grade"),
	SIXTH_GRADE("Sixth grade"),
	TENTH_GRADE("Tenth grade"),
	THIRD_GRADE("Third grade"),
	TWELFTH_GRADE("Twelfth grade");

	private String prettyName;

	CohortYearType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
