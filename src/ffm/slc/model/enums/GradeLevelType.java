package ffm.slc.model.enums;

/**
 * The enumeration items for the set of grade levels.
 */
public enum GradeLevelType {
	ADULT_EDUCATION("Adult Education"),
	EARLY_EDUCATION("Early Education"),
	EIGHTH_GRADE("Eighth grade"),
	ELEVENTH_GRADE("Eleventh grade"),
	FIFTH_GRADE("Fifth grade"),
	FIRST_GRADE("First grade"),
	FOURTH_GRADE("Fourth grade"),
	GRADE_13("Grade 13"),
	INFANT_TODDLER("Infant/toddler"),
	KINDERGARTEN("Kindergarten"),
	NINTH_GRADE("Ninth grade"),
	OTHER("Other"),
	POSTSECONDARY("Postsecondary"),
	PRESCHOOL_PREKINDERGARTEN("Preschool/Prekindergarten"),
	SECOND_GRADE("Second grade"),
	SEVENTH_GRADE("Seventh grade"),
	SIXTH_GRADE("Sixth grade"),
	TENTH_GRADE("Tenth grade"),
	THIRD_GRADE("Third grade"),
	TRANSITIONAL_KINDERGARTEN("Transitional Kindergarten"),
	TWELFTH_GRADE("Twelfth grade"),
	UNGRADED("Ungraded"),
	NOT_AVAILABLE("Not Available");

	private String prettyName;

	GradeLevelType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
